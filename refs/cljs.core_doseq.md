## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/doseq

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/doseq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/doseq)
</td>
</tr>
</table>

 <samp>
(__doseq__ seq-exprs & body)<br>
</samp>

```
Repeatedly executes body (presumably for side-effects) with
bindings and filtering as provided by "for".  Does not retain
the head of the sequence. Returns nil.
```

---

 <pre>
clojurescript @ r1503
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:956-990](https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/core.clj#L956-L990)</ins>
</pre>

```clj
(defmacro doseq
  [seq-exprs & body]
  (assert-args doseq
     (vector? seq-exprs) "a vector for its binding"
     (even? (count seq-exprs)) "an even number of forms in binding vector")
  (let [step (fn step [recform exprs]
               (if-not exprs
                 [true `(do ~@body)]
                 (let [k (first exprs)
                       v (second exprs)

                       seqsym (when-not (keyword? k) (gensym))
                       recform (if (keyword? k) recform `(recur (next ~seqsym)))
                       steppair (step recform (nnext exprs))
                       needrec (steppair 0)
                       subform (steppair 1)]
                   (cond
                     (= k :let) [needrec `(let ~v ~subform)]
                     (= k :while) [false `(when ~v
                                            ~subform
                                            ~@(when needrec [recform]))]
                     (= k :when) [false `(if ~v
                                           (do
                                             ~subform
                                             ~@(when needrec [recform]))
                                           ~recform)]
                     :else [true `(loop [~seqsym (seq ~v)]
                                    (when ~seqsym
                                      (let [~k (first ~seqsym)]
                                        ~subform
                                        ~@(when needrec [recform]))))]))))]
    (nth (step nil (seq seq-exprs)) 1)))
```


---

```clj
{:ns "cljs.core",
 :name "doseq",
 :signature ["[seq-exprs & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_doseq",
 :source {:code "(defmacro doseq\n  [seq-exprs & body]\n  (assert-args doseq\n     (vector? seq-exprs) \"a vector for its binding\"\n     (even? (count seq-exprs)) \"an even number of forms in binding vector\")\n  (let [step (fn step [recform exprs]\n               (if-not exprs\n                 [true `(do ~@body)]\n                 (let [k (first exprs)\n                       v (second exprs)\n\n                       seqsym (when-not (keyword? k) (gensym))\n                       recform (if (keyword? k) recform `(recur (next ~seqsym)))\n                       steppair (step recform (nnext exprs))\n                       needrec (steppair 0)\n                       subform (steppair 1)]\n                   (cond\n                     (= k :let) [needrec `(let ~v ~subform)]\n                     (= k :while) [false `(when ~v\n                                            ~subform\n                                            ~@(when needrec [recform]))]\n                     (= k :when) [false `(if ~v\n                                           (do\n                                             ~subform\n                                             ~@(when needrec [recform]))\n                                           ~recform)]\n                     :else [true `(loop [~seqsym (seq ~v)]\n                                    (when ~seqsym\n                                      (let [~k (first ~seqsym)]\n                                        ~subform\n                                        ~@(when needrec [recform]))))]))))]\n    (nth (step nil (seq seq-exprs)) 1)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [956 990],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/core.clj#L956-L990"},
 :full-name "cljs.core/doseq",
 :clj-symbol "clojure.core/doseq",
 :docstring "Repeatedly executes body (presumably for side-effects) with\nbindings and filtering as provided by \"for\".  Does not retain\nthe head of the sequence. Returns nil."}

```