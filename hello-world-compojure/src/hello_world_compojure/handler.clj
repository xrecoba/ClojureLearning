(ns hello-world-compojure.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(def hola-quim "Hello Quim")

(def dinners (list "hola" "adeu"))

(def add-dinner (cons "dinner" dinners))

(defroutes app-routes
  (GET "/" [] hola-quim)
  (POST "/dinner" [] add-dinner)
  (GET "/dinner" [] "This is some dinner")
  (route/not-found "Not Found"))


(def app
  (wrap-defaults app-routes (assoc-in site-defaults [:security :anti-forgery] false)))

(app {:uri "/" :request-method :get})
(app {:uri "/dinner" :request-method :post})
(print dinners)


(def x (list 1 2 3))
(cons 0 x)
(print x)
