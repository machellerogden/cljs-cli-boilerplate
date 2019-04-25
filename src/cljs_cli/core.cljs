(ns cljs-cli.core
  (:require [cljs-cli.promise :as p]
            ["answers" :as answers]))

(defn print-config
  []
  (-> (answers (clj->js {:name "cljs_cli"}))
      (p/then #(js->clj %))
      (p/then #(println (pr-str %)))
      (p/catch #(println (ex-message %)))))
