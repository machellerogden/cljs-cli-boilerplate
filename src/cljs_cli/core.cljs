(ns cljs-cli.core
  (:require [cljs-cli.promise :as p]
            ["answers" :as answers]))

(defn print-config []
  (-> (answers (clj->js {:name "cljs_cli"}))
    (p/then #(js->clj %))
    (p/then
      (fn [config]
       (println (pr-str (config)))))))
