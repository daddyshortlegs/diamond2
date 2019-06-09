(ns diamond2.diamond-maker-test
  (:require [clojure.test :refer :all]
            [diamond2.diamond-maker :refer :all]))

(deftest points-generator
  (testing "Get 2 points for Z at index 0"
    (is (= 25 (nth (get-points-for-line "Z" 0) 0)))
    (is (= 25 (nth (get-points-for-line "Z" 0) 1))))

  (testing "Get 2 points for Z at index 1 - B"
    (is (= 24 (nth (get-points-for-line "Z" 1) 0)))
    (is (= 26 (nth (get-points-for-line "Z" 1) 1))))

  (testing "Get 2 points for Z at index 25 - Z"
    (is (= 0 (nth (get-points-for-line "Z" 25) 0)))
    (is (= 50 (nth (get-points-for-line "Z" 25) 1))))
  )



(deftest get-index-for-char-test
  (testing "index valiues"
    (is (= 0 (get-index-of-char "A")))
    (is (= 1 (get-index-of-char "B")))
    (is (= 25 (get-index-of-char "Z")))))


(deftest points-generator-with-an-a
  (testing "Get 2 points for A at index 0"
    (is (= 0 (nth (get-points-for-line "A" 0) 0)))
    (is (= 0 (nth (get-points-for-line "A" 0) 1)))))

(deftest points-generator-with-a-b
  (testing "Get 2 points for B at index 0"
    (is (= 1 (nth (get-points-for-line "B" 0) 0)))
    (is (= 1 (nth (get-points-for-line "B" 0) 1))))

  (testing "Get 2 points for B at index 1"
    (is (= 0 (nth (get-points-for-line "B" 1) 0)))
    (is (= 2 (nth (get-points-for-line "B" 1) 1))))

  )