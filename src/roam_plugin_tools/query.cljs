(ns roam-plugin-tools.query
  (:require [roam-alpha-api.data :as rd]))

(defn q-first [& args]
  (-> (apply rd/q args)
      (first)
      (first)))