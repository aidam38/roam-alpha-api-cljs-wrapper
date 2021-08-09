(ns roam-alpha-api.ui.components
  (:require [roam-alpha-api.ui :refer [api-ui]]))

(def api-ui-comp (. api-ui -components))

(defn render-block [param]
  (. api-ui-comp renderBlock (clj->js param)))

(defn unmount-node [param]
  (. api-ui-comp unmountNode (clj->js param)))
