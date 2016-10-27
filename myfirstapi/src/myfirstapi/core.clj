(ns myfirstapi.core
  (:require [ring.adapter.jetty :as jetty]))


(defn mycustomapp [request]
  (:body "Hello World"
         :status 200
         :headers ("Content-Type" "tesxt/html")))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Goodbye World"})

(defn -main []
  ;)
   (jetty/run-jetty handler (:port 3000)))
