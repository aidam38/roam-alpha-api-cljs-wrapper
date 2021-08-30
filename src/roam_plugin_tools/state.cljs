(ns roam-plugin-tools.state
  (:require [clojure.string :as str]
            [roam-plugin-tools.query :refer [q-first]]))

(defn url [] js/window.location.href)

(defn graph-name []
  (if-let [tail (->> (url)
                     (re-find #"(#/app/)(.+)")
                     (last))]
    (if (str/includes? tail "/")
      (last (re-find #"^(.*?)/" tail))
      tail)))

(defn base-url []
  (let [head (->> (url)
                  (re-find #"(.*)#")
                  (last))]
    (str head "#/app/" (graph-name))))

(defn base-page-url []
  (str (base-url) "/page/"))

(defn get-page-url [uid]
  (str (base-page-url) uid))

(defn current-user-email []
  (-> "globalAppState"
      (js/localStorage.getItem)
      (js/JSON.parse)
      (seq)
      (last)
      (nth 2)))

(defn go-to-url! [url]
  (set! (.. js/window -location -href) url))

(defn go-to-uid! [uid]
  (go-to-url! (get-page-url uid)))

(defn go-to-page! [name]
  (->> name
       (q-first '[:find (pull ?e [:block/uid]) :in $ ?n :where [?e :node/title ?n]])
       (:uid)
       (go-to-uid!)))

