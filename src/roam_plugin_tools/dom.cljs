(ns roam-plugin-tools.dom
  (:require [goog.dom :as gdom]))

;; LEFT SIDEBAR
(def sidebar (js/document.querySelector ".roam-sidebar-content"))

(def sidebar-top-row (js/document.querySelector ".top-row"))

(defn part-to-class [part]
  (case part
    :log-buttons [".log-button"]
    :shortcuts [".starred-pages-wrapper"]
    :logo ["#roam-sidebar-logo"]
    [".log-button" ".starred-pages-wrapper" "#roam-sidebar-logo"]))

(defn insert-custom-sidebar-container-before! [part]
  (let [csc (gdom/createDom "div" #js{:id "roam-custom-sidebar-container"})]
    (if-let [before-el (js/document.querySelector (first (part-to-class part)))]
      (.insertBefore sidebar csc before-el)
      (.appendChild sidebar csc))))

(defn sidebar-remove! [parts]
  "parts can be :log-buttons, :shortcuts, :logo or :all (always except top-row though)"
  (->> parts
       (mapcat part-to-class)
       (mapv #(. (. js/document -querySelectorAll) call js/document %))
       (mapv #(mapv gdom/removeNode %))))

;; MAIN


(def roam-main (js/document.querySelector ".roam-main"))

(def roam-body-main (js/document.querySelector ".roam-body-main"))

(defn body-main-clear! []
  (gdom/removeChildren (roam-body-main)))
