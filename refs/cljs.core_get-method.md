## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/get-method

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/get-method</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/get-method)
</td>
</tr>
</table>

 <samp>
(__get-method__ multifn dispatch-val)<br>
</samp>

```
Given a multimethod and a dispatch value, returns the dispatch fn
that would apply to that value, or nil if none apply and no default
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7164-7167](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L7164-L7167)</ins>
</pre>

```clj
(defn get-method
  [multifn dispatch-val] (-get-method multifn dispatch-val))
```


---

```clj
{:ns "cljs.core",
 :name "get-method",
 :signature ["[multifn dispatch-val]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_get-method",
 :source {:code "(defn get-method\n  [multifn dispatch-val] (-get-method multifn dispatch-val))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7164 7167],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L7164-L7167"},
 :full-name "cljs.core/get-method",
 :clj-symbol "clojure.core/get-method",
 :docstring "Given a multimethod and a dispatch value, returns the dispatch fn\nthat would apply to that value, or nil if none apply and no default"}

```