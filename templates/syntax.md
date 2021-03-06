# ClojureScript Syntax

{{description}}

To let you know which syntax forms are also available in Clojure or [edn], we
mark the syntax forms with clickable icons linking to the appropriate official
clojure/edn docs.

 <table>
<tr>
<td><img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"></td>
<td>
available in clojure
</td>
</tr>
<tr>
<td><img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"></td>
<td>
available in [edn]
</td>
</tr>
</table>

[edn]:https://github.com/edn-format/edn#edn

 <table>
<thead><tr>
<th colspan=2>=</th>
<th>Name</th>
<th>History</th>
</tr></thead>
{{#symbols}}
<tr valign=top>
{{#syntax-equiv}}
<td>{{#clj-url}}[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">]({{&.}}){{/clj-url}}</td>
<td>{{#edn-url}}[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">]({{&.}}){{/edn-url}}</td>
{{/syntax-equiv}}
<td><samp>[{{&display-name}}]({{&link}})</samp></td>
<td>{{#history}}{{&shield}} {{/history}}</td>
</tr>
{{/symbols}}
</table>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/{{&cljsdoc-path}}
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files
