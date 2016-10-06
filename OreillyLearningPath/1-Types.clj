;;; Basics
;; Define namespace
(ns learnClojure)

;; Printing to console
(print "Hello world")

;; Arithmetic operations
(+ 1 1 )
(- 2 1 )
(* 2 4)
(/ 4 2)

;; Operator precedence is not necessary - Everything is functions
(* 3 (- 2 1))


;;; Types
(type 1)
(type 1.1)
(type true)
(type "Hello")

;; keywords can be referred
(type (keyword "a"))
;; quotes are not interpreted
(type (quote a))
;; quotes shorthand version
(type 'a)

;; building lists (linked list)
(type '(1 2 3))
(type (list 1 2 3))

;; vectors (array like, better for indexed acces)
(type (vector 1 2 3 ))
(nth (vector 1 2 3) 2)

;;; maps (list of keys and values)
{:a 1 :b 1 :c 1}
;; accessing the map:
(:a {:a 3 :b 7})

;; sets
(type #{1 2 3 4})
