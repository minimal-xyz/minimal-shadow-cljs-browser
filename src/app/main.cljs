
(ns app.main
  (:require (app.lib :as lib)))

(def a 1)

(defonce b 2)

(println "[main]: loading")

(defn on-reload! []
  (println "[main] reloaded lib:" lib/c lib/d)
  (println "[main] reloaded:" a b))
