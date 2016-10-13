(ns learnClojure)

;; define a function that sums
(defn my_sum[total vals]
  (if (empty? vals)
    total
    (my_sum (+ (first vals) total) (rest vals))))

(my_sum 0 [0 1 2 3 4])

;; let's remove the total using multivariant arguments
(defn my_sum
  ([vals] (my_sum 0 vals))
  ([total vals]
  (if (empty? vals)
    total
    (my_sum (+ (first vals) total) (rest vals)))))

(my_sum [0 1 2 3 4])

;; tail recursion, user word recur instead of function name
(defn my_sum
  ([vals] (my_sum 0 vals))
  ([total vals]
  (if (empty? vals)
    total
    (recur(+ (first vals) total) (rest vals)))))

;; We can also use loop to iterate - As recur, almost never required thanks to Reduce.

(reduce (fn [total vals] (+ total vals)) 0 [0 1 2 3 4])

;; reduce syntax is simplified when we define the function before
(defn summer [total val]
  (+ total val))

(reduce summer 0 [0 1 2 3 4])

;; remember plus is a function!
(reduce + 0 [0 1 2 3 4])

;; even better, if reduce is not given an initial value, it will call the function with the first the first 2 arguments of the list
(reduce + [0 1 2 3 4])
;; if there´s only one it still works...
(reduce + [3])


;;Filters can be done with reduce, but filter function works better
(filter even? [0 1 2 3 4 5 6 7 8])

;; same goes for map and group
(map inc [0 1 2 3 4 5 6 7 8])

(group-by #(if (even? %) :even :odd)  [0 1 2 3 4 5 6 7 8])
