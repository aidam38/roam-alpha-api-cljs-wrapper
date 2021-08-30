(ns roam-alpha-api.ui.right-sidebar
  (:require [roam-alpha-api.ui :refer [api-ui]]))

(def api-ui-rs (. api-ui .rightsidebar))

(defn open [] (. api-ui-rs open))

(defn close [] (. api-ui-rs close))

(defn get-windows [] (js->clj (. api-ui-rs getWindows)))

(defn add-window [param] (. api-ui-rs addWindow (clj->js param)))

(defn remove-window [param] (. api-ui-rs removeWindow (clj->js param)))

(defn expand-window [param] (. api-ui-rs expandWindow (clj->js param)))

(defn collapse-window [param] (. api-ui-rs collapseWindow (clj->js param)))

(defn pin-window [param] (. api-ui-rs pinWindow (clj->js param)))

(defn unpin-window [param] (. api-ui-rs unpinWindow (clj->js param)))

(defn set-window-order [param] (. api-ui-rs setWindowOrder (clj->js param)))
