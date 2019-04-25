(ns cljs-cli.repl
  (:require [cljs-cli.core :as core]
            [cljs-cli.promise :as p]
            ["answers" :as answers]))

(defn reload! []
  (println "Code updated."))
