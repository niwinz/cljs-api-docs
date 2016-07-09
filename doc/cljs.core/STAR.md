## Name
cljs.core/*

## Signature
[]
[x]
[x y]
[x y & more]

## Description

Returns the product of nums.

`(*)` returns 1.

## Related
cljs.core/+
cljs.core//

## Examples

```clj
;; there is an implicit 1
(*)
;;=> 1

;; the implicit 1 comes into play
(* 6)
;;=> 6

(* 2 3)
;;=> 6

(* 2 3 4)
;;=> 24
```