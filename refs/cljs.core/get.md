## cljs.core/get



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/get</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/get)
</td>
</tr>
</table>


 <samp>
(__get__ o k)<br>
</samp>
 <samp>
(__get__ o k not-found)<br>
</samp>

---

Returns the value mapped to key `k`.

Returns `not-found` or nil if `k` is not present in `o`.



---


###### See Also:

[`cljs.core/get-in`](../cljs.core/get-in.md)<br>

---


Source docstring:

```
Returns the value mapped to key, not-found or nil if key not present.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L831-L836):

```clj
(defn get
  ([o k]
     (-lookup o k))
  ([o k not-found]
     (-lookup o k not-found)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:831-836](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L831-L836)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1576/src/clj/cljs/core.clj#L358-L362):

```clj
(defmacro get
  ([coll k]
     `(-lookup ~coll ~k nil))
  ([coll k not-found]
     `(-lookup ~coll ~k ~not-found)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1576
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:358-362](https://github.com/clojure/clojurescript/blob/r1576/src/clj/cljs/core.clj#L358-L362)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/get` @ clojuredocs](http://clojuredocs.org/clojure.core/get)<br>
[`clojure.core/get` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/get/)<br>
[`clojure.core/get` @ crossclj](http://crossclj.info/fun/clojure.core/get.html)<br>
[`cljs.core/get` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/get.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/get.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the value mapped to key `k`.\n\nReturns `not-found` or nil if `k` is not present in `o`.",
 :ns "cljs.core",
 :name "get",
 :signature ["[o k]" "[o k not-found]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/get-in"],
 :full-name-encode "cljs.core/get",
 :source {:code "(defn get\n  ([o k]\n     (-lookup o k))\n  ([o k not-found]\n     (-lookup o k not-found)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1576",
          :filename "src/cljs/cljs/core.cljs",
          :lines [831 836]},
 :extra-sources [{:code "(defmacro get\n  ([coll k]\n     `(-lookup ~coll ~k nil))\n  ([coll k not-found]\n     `(-lookup ~coll ~k ~not-found)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1576",
                  :filename "src/clj/cljs/core.clj",
                  :lines [358 362]}],
 :full-name "cljs.core/get",
 :clj-symbol "clojure.core/get",
 :docstring "Returns the value mapped to key, not-found or nil if key not present."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/get"]))
```

-->