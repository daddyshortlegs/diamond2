(ns diamond2.core
  (:gen-class))

(use '[clojure.string :only [index-of]])

(defn get-index-of-char [char] (index-of "ABCDEFGHIJKLMNOPQRSTUVWXYZ" char))

(defn get-char-of-index [index] (str (.charAt "ABCDEFGHIJKLMNOPQRSTUVWXYZ" index)))

(defn get-points-for-line [char index]
  [(- (get-index-of-char char) index) (+ (get-index-of-char char) index)])

(defn draw-blanks [n] (apply str (repeat n " ")))

(defn gen-line [char i j]
  (str (draw-blanks i) char (if (= i j) "\n" (str (draw-blanks (- j i 1)) char "\n"))))

(defn calc-leading-spaces [char index] (- (get-index-of-char char) index))

(defn calc-middle-spaces [char] (+ 1 (* 2 (- (get-index-of-char char) 1))))

(defn plot-line [char index]
  (gen-line
    (get-char-of-index index)
    (calc-leading-spaces char index)
    (if (= 0 index)
      (calc-leading-spaces char index)
      (+ 1 (calc-leading-spaces char index) (calc-middle-spaces (get-char-of-index index))))))

(defn diamond-range [char]
  (concat (range 0 (+ 1 (get-index-of-char char))) (range (- (get-index-of-char char) 1) -1 -1)))

(defn diamond-maker [char]
  (apply str (for [x (diamond-range char)] (plot-line char x))))

(defn -main
  "I print a big diamond"
  [& args]
  (println (diamond-maker "Z")))

