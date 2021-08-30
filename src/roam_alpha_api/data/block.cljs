(ns roam-alpha-api.data.block
  (:require [roam-alpha-api.data :refer [api-data]]))

(def api-data-blk (. api-data -block))

(defn create [param] (. api-data-blk create (clj->js param)))

(defn move [param] (. api-data-blk move (clj->js param)))

(defn update [param] (. api-data-blk update (clj->js param)))

(defn delete [param] (. api-data-blk delete (clj->js param)))

(defn reorder-blocks [param] (. api-data-blk reorderBlocks (clj->js param)))