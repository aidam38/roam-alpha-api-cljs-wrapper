(ns roam-alpha-api.data.page
  (:require [roam-alpha-api.data :refer [api-data]]))

(def api-data-pg (. api-data -page))

(defn create [param] (. api-data-pg create (clj->js param)))

(defn update [param] (. api-data-pg update (clj->js param)))

(defn delete [param] (. api-data-pg delete (clj->js param)))
