(ns hello-world-compojure.mongo
  (:require [monger.core :as mg]
            [monger.collection :as mc])
  (:import [org.bson.types ObjectId]
           [com.mongodb DB WriteConcern]))

(let [conn (mg/connect)
      db   (mg/get-db conn "trajeTraje")]
  ;(mc/insert-and-return db "trajeTraje" {:name "John" :age 30})

  (mc/insert db "trajeTraje" { :first_name "John" :last_name "Lennon" })
  )
