(ns learnclojure.core)

;; to use external clojure definitions we use require
(require '[clojure.string :as s])

;; require can contain a shortcut to refer to the external element
(s/split "a,b,c" #",")

;; require can also be referred without the as, then function calls should use the fullname
(require 'clojure.string)
(clojure.string/split "a,b,c" #",")

;; require can also be used to refer only to specific functions of the namespace and load them in the current one:
(require '[clojure.string :refer [split]])
(split "a,b,c" #",")

;; it can even load all methods from an external namespace into the current one. This is dangerous as it makes it hard to track where are functions coming from.
(require '[clojure.string :refer :all])
(split "a,b,c" #",")

;; use has been deprecated in favour of use.


;; We use import to load Java classes
(import 'java.util.Date)
(Date.)

;; If we want to import more than one [package classesToBeImported]:
(import '[java.util Date Calendar])


;; Anyway, requires, using and imports can be used inside the namespace declaration!
;; (ns learningclojure.core
;;  (:require [clojure.string :as st])
;;  (:use clojure.string)
;;  (:import [java.util Date]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main []
  (foo "Main"))

