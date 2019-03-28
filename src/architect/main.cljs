(ns architect.main)

(defn reload! []
  (println "Code updated."))

(defn main! []
  (println (pr-str (js->clj js/process.argv))))
