## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ISeqable

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
            └── <ins>[core.cljs:229-230](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L229-L230)</ins>
</pre>

```clj
(defprotocol ISeqable
  (-seq [o]))
```


---

```clj
{:ns "cljs.core",
 :name "ISeqable",
 :type "protocol",
 :full-name-encode "cljs.core_ISeqable",
 :source {:code "(defprotocol ISeqable\n  (-seq [o]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [229 230],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L229-L230"},
 :methods [{:name "-seq", :signature ["[o]"], :docstring nil}],
 :full-name "cljs.core/ISeqable",
 :history [["+" "0.0-927"]]}

```