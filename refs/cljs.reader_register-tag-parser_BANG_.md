## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/register-tag-parser!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__register-tag-parser!__ tag f)<br>
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
            └── <ins>[reader.cljs:539-544](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/reader.cljs#L539-L544)</ins>
</pre>

```clj
(defn register-tag-parser!
  [tag f]
  (let [tag (name tag)
        old-parser (get @*tag-table* tag)]
    (swap! *tag-table* assoc tag f)
    old-parser))
```


---

```clj
{:full-name "cljs.reader/register-tag-parser!",
 :ns "cljs.reader",
 :name "register-tag-parser!",
 :type "function",
 :signature ["[tag f]"],
 :source {:code "(defn register-tag-parser!\n  [tag f]\n  (let [tag (name tag)\n        old-parser (get @*tag-table* tag)]\n    (swap! *tag-table* assoc tag f)\n    old-parser))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [539 544],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/reader.cljs#L539-L544"},
 :full-name-encode "cljs.reader_register-tag-parser_BANG_",
 :history [["+" "0.0-1236"]]}

```