(defproject org.clojars.aidam/roam-plugin-tools "0.0.3"
  :description "Wraps the roamAlphaAPI JS Object in Roam Research"
  :url "https://roamresearch.com/#/app/developer-documentation/page/tIaOPdXCj"
  :scm {:url "https://github.com/aidam38/roam-plugin-tools-cljs-wrapper"}

  ;; this is optional, add what you want or remove it
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies
  ;; always use "provided" for Clojure(Script)
  [[org.clojure/clojurescript "1.10.520" :scope "provided"]
   [hiccup "1.0.5"]
   [org.clojars.aidam/roam-alpha-api "1.0.3"]]

  :source-paths
  ["src"])