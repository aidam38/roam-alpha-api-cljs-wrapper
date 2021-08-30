(ns roam-alpha-api.util
  (:require [roam-alpha-api.core :refer [api]]))

(def api-util (. api -utils))

(defn generate-uid [] (. api-util generateUID))