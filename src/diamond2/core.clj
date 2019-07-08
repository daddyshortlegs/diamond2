(ns diamond2.core
  (:gen-class))

(use '[clojure.string :only [index-of]])

(defn get-index-of-char [char] (index-of "ABCDEFGHIJKLMNOPQRSTUVWXYZ" char))

(defn get-char-of-index [index] (str (.charAt "ABCDEFGHIJKLMNOPQRSTUVWXYZ" index)))

(defn get-points-for-line [char index]
  (let [index-char (get-index-of-char char)]
    [(- index-char index) (+ index-char index)]))

(defn draw-blanks [n] (apply str (repeat n " ")))

(defn gen-line [char i j]
  (str (draw-blanks i) char (if (= i j) "\n" (str (draw-blanks (- j i 1)) char "\n"))))

(defn calc-leading-spaces [char index] (- (get-index-of-char char) index))

(defn calc-middle-spaces [char] (+ 1 (* 2 (- (get-index-of-char char) 1))))

(defn plot-line [char index]
  (let [leading-spaces (calc-leading-spaces char index) the-char (get-char-of-index index)]
    (gen-line the-char leading-spaces
      (if (= 0 index)
        leading-spaces
        (+ 1 leading-spaces (calc-middle-spaces the-char))))))

(defn diamond-range [char]
  (concat (range 0 (+ 1 (get-index-of-char char))) (range (- (get-index-of-char char) 1) -1 -1)))

(defn diamond-maker [char]
  (apply str (for [x (diamond-range char)] (plot-line char x))))

(defn -main
  "I print a big diamond"
  [& args]
  (println (diamond-maker "Z")))
