(ns myfirstapi.core
  (:require [ring.adapter.jetty :as jetty]))


(defn mycustomapp [request] "Hello World")

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Goodbye World"})

(defn string-response-middleware [handler]
  (fn [request]
    (let [response (handler request)]
      (if (instance? String response)
        {:body response
         :status 200
         :headers {"Content-Type" "text/html"}}))))


(defn pepe []
  (print "Hello world"))

(defn what-is-my-ip [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body (:remote-addr request)})

(defn -main []
  ;(print "Hello world"))
   (jetty/run-jetty (string-response-middleware mycustomapp) (:port 3000)))
