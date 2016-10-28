(ns myfirstapi.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.params :refer [wrap-params]]))

(defn mycustomapp [request]
  ; print querystring to see contents.
  ; or access request object to see if middleware params has extended it
  (str "Hello, " (get (:params request) "name")))

(defn string-response-middleware [handler]
  (fn [request]
    (let [response (handler request)]
      (if (instance? String response)
        {:body response
         :status 200
         :headers {"Content-Type" "text/html"}}))))

(def handler
  (-> mycustomapp
      string-response-middleware
      wrap-params))

(defn -main []
  ;(print "Hello world"))
   (jetty/run-jetty handler (:port 3000)))
