(ns cider-example.core-test
  (:require [clojure.test :refer :all]
            [cider-example.test-helper :refer [fail]]))

(defn foo []
  (println 4))

(deftest a-test
  (testing "FIXME, I fail."
    (fail)))
