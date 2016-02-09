(ns cider-example.test-helper
  (:require [clojure.test :refer :all]))

(defn fail
  []
  (is false))
