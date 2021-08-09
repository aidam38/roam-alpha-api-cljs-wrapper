(ns roam-alpha-api.ui.graph-view
  (:require [roam-alpha-api.ui :refer [api-ui]]))

(def api-ui-gv (. api-ui -graphView))

(defn add-callback [param] (. api-ui-gv addCallback (clj->js param)))

(defn remove-callback [param] (. api-ui-gv removeCallback (clj->js param)))