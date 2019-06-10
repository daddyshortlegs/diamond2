(ns diamond2.diamond-maker-test
  (:require [clojure.test :refer :all]
            [diamond2.diamond-maker :refer :all]))


;(testing "the big Z"
;  (def expected (str "                         A\n"
;                     "                        B B\n"
;                     "                       C   C\n"
;                     "                      D     D\n"
;                     "                     E       E\n"
;                     "                    F         F\n"
;                     "                   G           G\n"
;                     "                  H             H\n"
;                     "                 I               I\n"
;                     "                J                 J\n"
;                     "               K                   K\n"
;                     "              L                     L\n"
;                     "             M                       M\n"
;                     "            N                         N\n"
;                     "           O                           O\n"
;                     "          P                             P\n"
;                     "         Q                               Q\n"
;                     "        R                                 R\n"
;                     "       S                                   S\n"
;                     "      T                                     T\n"
;                     "     U                                       U\n"
;                     "    V                                         V\n"
;                     "   W                                           W\n"
;                     "  X                                             X\n"
;                     " Y                                               Y\n"
;                     "Z                                                 Z\n"
;                     " Y                                               Y\n"
;                     "  X                                             X\n"
;                     "   W                                           W\n"
;                     "    V                                         V\n"
;                     "     U                                       U\n"
;                     "      T                                     T\n"
;                     "       S                                   S\n"
;                     "        R                                 R\n"
;                     "         Q                               Q\n"
;                     "          P                             P\n"
;                     "           O                           O\n"
;                     "            N                         N\n"
;                     "             M                       M\n"
;                     "              L                     L\n"
;                     "               K                   K\n"
;                     "                J                 J\n"
;                     "                 I               I\n"
;                     "                  H             H\n"
;                     "                   G           G\n"
;                     "                    F         F\n"
;                     "                     E       E\n"
;                     "                      D     D\n"
;                     "                       C   C\n"
;                     "                        B B\n"
;                     "                         A\n"
;                     ))
;  (is (= expected (diamond-maker "Z"))))


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

;(deftest draw-line-given-two-points
;  (testing "various points"
;    (is (= (str "A") (gen-line "A" 0 0)))
;    (is (= (str "AA") (gen-line "A" 0 1)))
;    (is (= (str " B B") (gen-line "B" 1 3)))
;    (is (= (str "     C    C") (gen-line "C" 5 10)))
;    ))
;
(deftest draw-line-given-index
  (testing "various points"
    (is (= (str "A") (plot-line "A" 0)))

    (is (= (str " A") (plot-line "B" 0)))
    (is (= (str "B B") (plot-line "B" 1)))
    ))
