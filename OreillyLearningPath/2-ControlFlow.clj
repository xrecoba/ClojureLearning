(ns learnClojure)

;; everything is inmutable by definition
(def x "Hello")

;; let defines a binding only valid inside the parenthesis
(let [x "Steve"]
  (print "Hello, " x))

;; if statement
(if (empty? x)
  "X is empty"
  "X is not empty")

;; if
(if nil
  "Yes" "No")

;; do
(if (empty? x)
  nil
  (
    do
    (println "Ok")
    :ok))

;; do is usually is related to side effects, a little bit contradictory to functional programming.
;; if possible avoid "do" usage

;; if-not
(if-not (empty? x)
  (do
    (println "Ok")
    :ok))


;; when-not - one branch if which that wraps everything into an implicit do
(when-not (empty? x)
    (println "Ok")
    :ok)

;; case - switch alike
(case x
  "Goodbye" :goodbye
  "Hello" :hello
  :nothing
  )

;; cond - Conditional where you can write your predicate (superset of case)
(cond
  (= x "Goodbye") :goodbye
  (= (apply str (reverse x)) "olleH") :olleh
  :otherwise :nothing)

;; note "apply str" is required else the string does not match as it is a list of characters and not a string.
(reverse x)
