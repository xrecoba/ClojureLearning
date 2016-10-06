(ns learnClojure)

;; create a functiona named hello
(fn [] "Hello")

;; function types are anonymous
(type (fn [] "Hello"))

;; functions can be send to functions
((fn [] "Hello"))

;; and can also be defined with a full namespace
(def hello (fn [] "Hello"))

;; now we can call the function anywhere inside the namespace
(hello)

;; # is used to define anonymous functions
(#(str "Hello"))

;; shorthand version to assign a function and declare it at the same time.
;; closure implicitly returns the last statement in it
(defn hello [] "Hello")

(defn hello [name] (str "Hello " name))
(hello "Jane")

;; commas are trated as whitespace in closure, so:
(defn hello [name title] (str "Hello " title " " name))
(hello "Frances" "Admiral")
;;is the same as
(defn hello [name, title] (str "Hello " title " " name))
(hello "Frances" "Admiral")


;; to generate function documentation, specify the comment after the function name
(defn hello "Greets a person named <name> with their <title>" [name title] (str "Hello " title " " name))
;; then require clojure doc
(require '[clojure.repl :refer [doc]])
;;Now we can call doc function on the method to retrieve its extra info
(doc hello)

;; presumably Ctrl+D on top a function retrieves documentation, but that screws my LightTable (Ctrl+Enter stops working) + works on the function I have NOT defined though (sytem ones).

;; definition of function with any number of arguments
(defn hello [& args]
    (str "Hello " (apply str args)))

(hello "Fred" "Julie")

;; second way to define multivariant functions is to define different implementations depending on the number of arguments
(defn hello
  ([] "Hello world")
  ([name] (str "Hello " name)))

(hello)
(hello "Joan")

;; This second way, you can be used to define default values:
(defn hello
  ([] (hello "world"))
  ([name] (str "Hi " name)))
(hello)
(hello "Joan")

;; arguments to functions can have structure.
(defn hello [config]
   (str "Hello " (:name config)))

(hello {:name "Joe"})

;; structure can be resolved at top level too
(defn hello [{name :name}]
   (str "Hello " name))

(hello {:name "Jane"})

;; in this case, we could also have access to the whole config as a parameter if we wanted to
