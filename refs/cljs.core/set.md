## cljs.core/set



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set)
</td>
</tr>
</table>


 <samp>
(__set__ coll)<br>
</samp>

---

Returns a set of the distinct elements of `coll`.



---


###### See Also:

[`cljs.core/hash-set`](../cljs.core/hash-set.md)<br>
[`cljs.core/sorted-set`](../cljs.core/sorted-set.md)<br>
[`cljs.core/conj`](../cljs.core/conj.md)<br>
[`cljs.core/disj`](../cljs.core/disj.md)<br>
[`cljs.core/distinct`](../cljs.core/distinct.md)<br>
[`clojure.set/join`](../clojure.set/join.md)<br>
[`clojure.set/select`](../clojure.set/select.md)<br>
[`clojure.set/difference`](../clojure.set/difference.md)<br>
[`clojure.set/intersection`](../clojure.set/intersection.md)<br>
[`clojure.set/union`](../clojure.set/union.md)<br>
[`clojure.set/index`](../clojure.set/index.md)<br>
[`clojure.set/project`](../clojure.set/project.md)<br>
[`clojure.set/rename`](../clojure.set/rename.md)<br>
[`clojure.set/rename-keys`](../clojure.set/rename-keys.md)<br>
[`clojure.set/map-invert`](../clojure.set/map-invert.md)<br>

---


Source docstring:

```
Returns a set of the distinct elements of coll.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L5826-L5829):

```clj
(defn set
  [coll]
  (apply hash-set coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5826-5829](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L5826-L5829)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/set` @ clojuredocs](http://clojuredocs.org/clojure.core/set)<br>
[`clojure.core/set` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/set/)<br>
[`clojure.core/set` @ crossclj](http://crossclj.info/fun/clojure.core/set.html)<br>
[`cljs.core/set` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/set.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/set.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a set of the distinct elements of `coll`.",
 :ns "cljs.core",
 :name "set",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/hash-set"
           "cljs.core/sorted-set"
           "cljs.core/conj"
           "cljs.core/disj"
           "cljs.core/distinct"
           "clojure.set/join"
           "clojure.set/select"
           "clojure.set/difference"
           "clojure.set/intersection"
           "clojure.set/union"
           "clojure.set/index"
           "clojure.set/project"
           "clojure.set/rename"
           "clojure.set/rename-keys"
           "clojure.set/map-invert"],
 :full-name-encode "cljs.core/set",
 :source {:code "(defn set\n  [coll]\n  (apply hash-set coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1576",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5826 5829]},
 :full-name "cljs.core/set",
 :clj-symbol "clojure.core/set",
 :docstring "Returns a set of the distinct elements of coll."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/set"]))
```

-->