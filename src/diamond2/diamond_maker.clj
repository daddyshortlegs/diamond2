(ns diamond2.diamond-maker
  (:gen-class))

(use '[clojure.string :only [index-of]])



(defn get-index-of-char [char]
  (index-of "ABCDEFGHIJKLMNOPQRSTUVWXYZ" char))

(defn get-char-of-index [index]
  (str (.charAt "ABCDEFGHIJKLMNOPQRSTUVWXYZ" index)))

(defn get-points-for-line [char index]
  [(- (get-index-of-char char) index) (+ (get-index-of-char char) index)])

(defn draw-blanks [n] (apply str (take n (repeat " "))))

(defn gen-line [char i j]
  (str (draw-blanks i) char (if (= i j) "" (str (draw-blanks (- j i 1)) char))))

(defn plot-line [index i j]
  (gen-line (get-char-of-index index) i j))

(defn diamond-maker [char]
  (for [x (range 0 (get-index-of-char char))] (gen-line (get-char-of-index x))

  ))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
