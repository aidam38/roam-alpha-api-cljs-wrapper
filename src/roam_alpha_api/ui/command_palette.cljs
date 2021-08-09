(ns roam-alpha-api.ui.command-palette
  (:require [roam-alpha-api.ui :refer [api-ui]]))

(def api-ui-cp (. api-ui -commandPalette))

(defn add-command [param]
  (. api-ui-cp addCommand (clj->js param)))

(defn remove-command [param]
  (. api-ui-cp removeCommand (clj->js param)))
