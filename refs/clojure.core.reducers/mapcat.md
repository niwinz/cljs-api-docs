## clojure.core.reducers/mapcat



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__mapcat__ f)<br>
</samp>
 <samp>
(__mapcat__ f coll)<br>
</samp>

---





Source docstring:

```
Applies f to every value in the reduction of coll, concatenating the result
  colls of (f val). Foldable.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/core/reducers.cljs#L95-L104):

```clj
(defcurried mapcat
  "Applies f to every value in the reduction of coll, concatenating the result
  colls of (f val). Foldable."
  {}
  [f coll]
  (folder coll
   (fn [f1]
     (rfn [f1 k]
          ([ret k v]
             (reduce f1 ret (f k v)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:95-104](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/core/reducers.cljs#L95-L104)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/mapcat` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/mapcat.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/mapcat.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "mapcat",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/mapcat",
 :source {:code "(defcurried mapcat\n  \"Applies f to every value in the reduction of coll, concatenating the result\n  colls of (f val). Foldable.\"\n  {}\n  [f coll]\n  (folder coll\n   (fn [f1]\n     (rfn [f1 k]\n          ([ret k v]\n             (reduce f1 ret (f k v)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1576",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [95 104]},
 :full-name "clojure.core.reducers/mapcat",
 :docstring "Applies f to every value in the reduction of coll, concatenating the result\n  colls of (f val). Foldable."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/mapcat"]))
```

-->