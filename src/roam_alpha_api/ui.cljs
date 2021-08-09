(ns roam-alpha-api.ui
  (:require [roam-alpha-api.core :refer [api]]))

(def api-ui (. api -ui))

(defn get-focused-block []
  (. api-ui getFocusedBlock))

