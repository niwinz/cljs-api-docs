## clojure.zip/append-child



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/append-child</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/append-child)
</td>
</tr>
</table>


 <samp>
(__append-child__ loc item)<br>
</samp>

---





Source docstring:

```
Inserts the item as the rightmost child of the node at this loc,
without moving
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/zip.cljs#L200-L204):

```clj
(defn append-child
  [loc item]
    (replace loc (make-node loc (node loc) (concat (children loc) [item]))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:200-204](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/zip.cljs#L200-L204)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/append-child` @ clojuredocs](http://clojuredocs.org/clojure.zip/append-child)<br>
[`clojure.zip/append-child` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/append-child/)<br>
[`clojure.zip/append-child` @ crossclj](http://crossclj.info/fun/clojure.zip/append-child.html)<br>
[`clojure.zip/append-child` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/append-child.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/append-child.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "append-child",
 :signature ["[loc item]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/append-child",
 :source {:code "(defn append-child\n  [loc item]\n    (replace loc (make-node loc (node loc) (concat (children loc) [item]))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1576",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [200 204]},
 :full-name "clojure.zip/append-child",
 :clj-symbol "clojure.zip/append-child",
 :docstring "Inserts the item as the rightmost child of the node at this loc,\nwithout moving"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/append-child"]))
```

-->