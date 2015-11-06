## cljs.core/long-array



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/long-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/long-array)
</td>
</tr>
</table>


 <samp>
(__long-array__ size-or-seq)<br>
</samp>
 <samp>
(__long-array__ size init-val-or-seq)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L2000-L2019):

```clj
(defn long-array
  ([size-or-seq]
     (cond
      (number? size-or-seq) (long-array size-or-seq nil)
      (seq? size-or-seq) (into-array size-or-seq)
      :else (throw (js/Error. "long-array called with something other than size or ISeq"))))
  ([size init-val-or-seq]
     (let [a (make-array size)]
       (if (seq? init-val-or-seq)
         (let [s (seq init-val-or-seq)]
           (loop [i 0 s s]
             (if (and s (< i size))
               (do
                 (aset a i (first s))
                 (recur (inc i) (next s)))
               a)))
         (do
           (dotimes [i size]
             (aset a i init-val-or-seq))
           a)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2000-2019](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L2000-L2019)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/long-array` @ clojuredocs](http://clojuredocs.org/clojure.core/long-array)<br>
[`clojure.core/long-array` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/long-array/)<br>
[`clojure.core/long-array` @ crossclj](http://crossclj.info/fun/clojure.core/long-array.html)<br>
[`cljs.core/long-array` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/long-array.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/long-array.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "long-array",
 :signature ["[size-or-seq]" "[size init-val-or-seq]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core/long-array",
 :source {:code "(defn long-array\n  ([size-or-seq]\n     (cond\n      (number? size-or-seq) (long-array size-or-seq nil)\n      (seq? size-or-seq) (into-array size-or-seq)\n      :else (throw (js/Error. \"long-array called with something other than size or ISeq\"))))\n  ([size init-val-or-seq]\n     (let [a (make-array size)]\n       (if (seq? init-val-or-seq)\n         (let [s (seq init-val-or-seq)]\n           (loop [i 0 s s]\n             (if (and s (< i size))\n               (do\n                 (aset a i (first s))\n                 (recur (inc i) (next s)))\n               a)))\n         (do\n           (dotimes [i size]\n             (aset a i init-val-or-seq))\n           a)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1576",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2000 2019]},
 :full-name "cljs.core/long-array",
 :clj-symbol "clojure.core/long-array"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/long-array"]))
```

-->