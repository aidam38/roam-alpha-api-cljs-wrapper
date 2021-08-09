(ns roam-alpha-api.data
  (:require [roam-alpha-api.core :refer [api]]
            [clojure.string :as str]))

(def api-data (. api -data))

(defn stringify [d]
  (-> (pr-str d)
      (str/replace #"\n" " ")))

(defn q [q & o]
  (let [args (cons (stringify q) o)]
    (-> (apply (. api-data -q) args)
        (js->clj :keywordize-keys true))))

(defn pull [q id]
  (-> (. api-data pull (stringify q) id)
      (js->clj :keywordize-keys true)))

(defn add-pull-watch [pattern selector callback]
  (. api-data addPullWatch
     (stringify pattern)
     (stringify selector)
     #(apply callback (map js->clj %&))))

(defn remove-pull-watch [pattern selector & callback?]
  (. api-data removePullWatch
     (stringify pattern)
     (stringify selector) i
     (when-let [callback (first callback?)]
       #(apply callback (map js->clj %&)))))

(defn undo []
  (. api-data undo))

(defn redo []
  (. api-data redo))