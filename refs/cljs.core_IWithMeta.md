## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IWithMeta

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
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
            └── <ins>[core.cljs:214-215](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L214-L215)</ins>
</pre>

```clj
(defprotocol IWithMeta
  (-with-meta [o meta]))
```


---

```clj
{:ns "cljs.core",
 :name "IWithMeta",
 :type "protocol",
 :full-name-encode "cljs.core_IWithMeta",
 :source {:code "(defprotocol IWithMeta\n  (-with-meta [o meta]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [214 215],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L214-L215"},
 :methods [{:name "-with-meta",
            :signature ["[o meta]"],
            :docstring nil}],
 :full-name "cljs.core/IWithMeta",
 :history [["+" "0.0-927"]]}

```