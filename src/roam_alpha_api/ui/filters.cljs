(ns roam-alpha-api.ui.filters
  (:require [roam-alpha-api.ui :refer [api-ui]]))

(def api-ui-ft (. api-ui -filters))

(defn add-global-filter [param] (. api-ui-ft addGlobalFilter (clj->js param)))

(defn remove-global-filter [param] (. api-ui-ft removeGlobalFilter (clj->js param)))

(defn get-global-filters [] (js->clj (. api-ui-ft getGlobalFilters)))