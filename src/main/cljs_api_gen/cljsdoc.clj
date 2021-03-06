(ns cljs-api-gen.cljsdoc
  (:require
    [cljs-api-gen.config :refer [cljsdoc-dir]]
    [cljs-api-gen.encode :as encode]
    [cljs-api-gen.display :refer [sort-symbols]]
    [cljs-api-gen.cljsdoc.transform :refer [transform-versioned-doc]]
    [cljs-api-gen.cljsdoc.versioned :refer [versioned-doc]]
    [cljs-api-gen.cljsdoc.validate :refer [valid-doc? *result*]]
    [cljs-api-gen.cljsdoc.parse :refer [parse-doc]]
    [me.raynes.fs :refer [mkdir list-dir base-name exists? parent directory?]]
    [stencil.core :as stencil]
    [clansi.core :refer [style]]))

(def cljsdoc-map
  "Holds the result of the cljsdoc compiler."
  (atom nil))

(defn build-doc
  [file]
  (let [filename (base-name file)
        parentdir (base-name (parent file))
        doc (-> (parse-doc (slurp file) filename parentdir)
                versioned-doc
                transform-versioned-doc)]
    (when (valid-doc? doc)
      doc)))

(defn format-status
  [parsed skipped]
  (cond-> (str "Parsed " parsed " files")
    (pos? skipped) (str ", skipped " skipped)
    true (str ".")))

(defn cljsdoc-files [dir]
  (let [all (list-dir dir)
        files (->> all
                (remove directory?)
                (filter #(.endsWith (.getName %) ".cljsdoc")))
        subfiles (->> all
                      (filter directory?)
                      (map cljsdoc-files)
                      (apply concat))]
    (cond-> files
      (seq subfiles) (concat subfiles))))

(defn create-cljsdoc-stubs!
  [known-symbols]
  (doseq [full-name (sort-symbols known-symbols)]
    (let [filename (str cljsdoc-dir "/" (encode/encode-fullname full-name) ".cljsdoc")]
      (when-not (exists? filename)
        (encode/assert-lossless full-name)
        (mkdir (parent filename))
        (println "Creating new cljsdoc stub for" (style full-name :yellow) "at" (style filename :cyan))
        (spit filename
              (stencil/render-string
                (slurp "templates/stub.cljsdoc")
                {:full-name full-name}))))))

(defn build-cljsdoc!
  ([] (build-cljsdoc! nil))
  ([result]

   (println (cond-> (style "\nCompiling cljsdoc/ files" :cyan)
              (nil? result) (str " (without parsed API info)"))
            "...")

   (let [files (cljsdoc-files cljsdoc-dir)
         mandocs (binding [*result* result]
                   (doall (keep build-doc files)))
         mandoc-map (zipmap (map :full-name mandocs)
                            (map #(dissoc % :empty-sections) mandocs))
         skipped (- (count files) (count mandocs))
         parsed (- (count files) skipped)]

     (reset! cljsdoc-map mandoc-map)

     (if (zero? skipped)
       (println (style "Done with no errors." :green))
       (println (style "\nDone with some errors." :red)))
     (println (format-status parsed skipped))

     skipped)))

