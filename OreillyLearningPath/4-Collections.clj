(ns learnClojure)

;; all closure collections are inmutable
(def x (list 1 2 3))
(cons 0 x)
(print x)

(first x)
(last x)
(nth x 1)

(cons 0 x)
(conj x 0)

;; conj adds an item in the most natural way possible to a collection
;; for lists this means at the beggining,
;; but for vectors this means at the end, as it just needs to add a new memory location.
(def v [1 2 3])
(cons 0 v)
(conj v 0)

;; concat concatenates collections
(concat x v)
;; Note the generated collection is a lazy sequence, which is an object that knows how to make the sequence but which HAS NOT created the sequence yet
(type (concat x v))

;; when defining a map, clojure decides the type
(def m {:a 1 :b 2})
(type m)
;; if we want to decide the map type, we can do it with the corresponding function. arraymap respects the order
(array-map :a 1 :b 2)
;;Forcing type to be a Hash-map
(type (hash-map :a 1 :b 2))

;; to insert an element in a map
(assoc {:a 1} :b 2)
;; assoc-in works to insert an element in nested maps.
(assoc-in {:settings {:a 1 :b 2}} [:settings :a] "a")
;; update-in allows to apply a function to an element inside a map.
(update-in {:settings {:a 1 :b 2}} [:settings :a] inc)

;; retrieve an entry from a map
(get m :a)
(:a m)

;; Sets have no order at all.
(def s #{1 2 3})
;; add to a set
(conj s 4)
;; remove from a set
(disj s 3)
;; check if element exists
(contains? s 3)

;; obtain a value if it exists in the set.
(get s 3)
(get s 4)




