(ns cljs-cli.repl
  (:require [cljs-cli.promise :as p]
            [cljs-cli.core :as core]
            ["answers" :as answers]))

(defn reload! []
  (println "Code updated."))

(defn main! []
  (println "Loaded."))
