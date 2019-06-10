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

(deftest get-char-for-index-test
  (testing "chars"
    (is (= (str "A") (get-char-of-index 0)))
    (is (= (str "B") (get-char-of-index 1)))
    (is (= (str "C") (get-char-of-index 2)))
    (is (= (str "D") (get-char-of-index 3)))
    (is (= (str "Z") (get-char-of-index 25)))))

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

(deftest understanding-strings
  (testing "stuff"
    (is (= (str "   A   A") (gen-line)))))

(deftest test-plot-points
  (testing "point plitting"
    (is (= ()))))

;(deftest draw-line-given-two-points
;  (testing "We draw a line for B at index 0"
;    (is (= (str " A\n") (draw-line "B" 0)))
;    (is (= (str "B B\n") (draw-line "B" 1)))))