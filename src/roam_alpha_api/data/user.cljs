(ns roam-alpha-api.data.user
  (:require [roam-alpha-api.data :refer [api-data]]))

(def api-data-user (. api-data -user))

(defn upsert [param]
  (. api-data-user upsert (clj->js param)))