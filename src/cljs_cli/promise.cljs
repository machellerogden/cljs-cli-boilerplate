(ns cljs-cli.promise
  (:refer-clojure :exclude [resolve]))

(defn promise [func]
  (js/Promise. func))

(defn resolve [val]
  (.resolve js/Promise val))

(defn reject [val]
  (.reject js/Promise val))

(defn then [^js/Promise prom func]
  (.then prom func))

(defn catch [^js/Promise prom func]
  (.catch prom func))

(defn all [prom-seq]
  (.all js/Promise (into-array prom-seq)))
