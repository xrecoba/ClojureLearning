(ns learnclojure.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (str x "Hello, World!"))

(defn -main []
  (foo "Main"))


(comment
(require '[clojure.test :refer [is testing]])

(testing "make sure foo works"
(is (= (foo "") "Hello, World!"))
(is (= (foo "Hey, ") "Hey, Hello, World!"))))
