(ns learnClojure)

;; everything is inmutable by definition
(def x "Hello Clojure")

;; let defines a binding only valid inside the parenthesis
(let [x "Steve"]
  (print "Hello, " x))

;; if statement
(if (empty? x)
  "X is empty"
  "X is not empty")
