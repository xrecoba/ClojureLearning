(ns hello-world-compojure.mongo
  (:require [monger.core :as mg]
            [monger.collection :as mc])
  (:import [org.bson.types ObjectId]
           [com.mongodb DB WriteConcern]))

(defn create-dinner [name]
    (let [conn (mg/connect)
      db (mg/get-db conn "trajeTraje")]
      (mc/insert db "trajeTraje" { :dinner_name name })))

