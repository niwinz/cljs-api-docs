## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/not=

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not=</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not=)
</td>
</tr>
</table>

 <samp>
(__not=__ x)<br>
(__not=__ x y)<br>
(__not=__ x y & more)<br>
</samp>

```
Same as (not (= obj1 obj2))
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2173-2178](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L2173-L2178)</ins>
</pre>

```clj
(defn ^boolean not=
  ([x] false)
  ([x y] (not (= x y)))
  ([x y & more]
   (not (apply = x y more))))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "not=",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_not_EQ_",
 :source {:code "(defn ^boolean not=\n  ([x] false)\n  ([x y] (not (= x y)))\n  ([x y & more]\n   (not (apply = x y more))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2173 2178],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L2173-L2178"},
 :full-name "cljs.core/not=",
 :clj-symbol "clojure.core/not=",
 :docstring "Same as (not (= obj1 obj2))"}

```