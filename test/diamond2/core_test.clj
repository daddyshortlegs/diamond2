(ns diamond2.core-test
  (:require [clojure.test :refer :all]
            [diamond2.core :refer :all]))


(defn get-points-for-line [char index]


  [(- 25 index) (+ 25 index)])

(deftest points-generator
  (testing "Get 2 points for Z at index 0"
    (is (= 25 (nth (get-points-for-line "Z" 0) 0)))
    (is (= 25 (nth (get-points-for-line "Z" 0) 1))))

  (testing "Get 2 points for Z at index 1 - B"
    (is (= 24 (nth (get-points-for-line "Z" 1) 0)))
    (is (= 26 (nth (get-points-for-line "Z" 1) 1))))

  )

