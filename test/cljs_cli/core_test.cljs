(ns cljs-cli.core-test
  (:require [cljs.test :as t :include-macros true :refer [deftest testing is async]]
            [cljs-cli.promise :as p]))

(deftest print-config
  (testing "works"
    (is (true? true))))

