(ns roam-alpha-api.ui.block-context-menu
  (:require [roam-alpha-api.ui :refer [api-ui]]))

(def api-ui-bcm (. api-ui -blockContextMenu))

(defn add-command [{:keys [label display-conditional callback]}]
  (. api-ui-bcm addCommand
     #js{:label label
         :display-conditional #(display-conditional (js->clj %))
         :callback #(callback (js-clj %))}))

(defn remove-command [param]
  (. api-ui-bcm removeCommand (clj->js param)))