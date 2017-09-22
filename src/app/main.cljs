
(ns app.main
  (:require [app.lib :as lib]
            ["hsl" :as hsl]))

(def a 1)

(defonce b 2)

(defn main! []
  (println "[main]: loading")
  (println "calling hsl" (hsl 10 10 10)))

(defn reload! []
  (println "[main] reloaded lib:" lib/c lib/d)
  (println "[main] reloaded:" a b)
  (println "calling hsl" (hsl 10 10 10)))

(main!)
