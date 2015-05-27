## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/type

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-971"><img valign="middle" alt="[+] 0.0-971" src="https://img.shields.io/badge/+-0.0--971-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/type</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/type)
</td>
</tr>
</table>

 <samp>
(__type__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:368-370](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L368-L370)</ins>
</pre>

```clj
(defn type [x]
  (when-not (nil? x)
    (.-constructor x)))
```


---

```clj
{:full-name "cljs.core/type",
 :ns "cljs.core",
 :name "type",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn type [x]\n  (when-not (nil? x)\n    (.-constructor x)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [368 370],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L368-L370"},
 :full-name-encode "cljs.core_type",
 :clj-symbol "clojure.core/type",
 :history [["+" "0.0-971"]]}

```