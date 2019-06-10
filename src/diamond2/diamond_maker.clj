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
  (println (str "i = " i " j = " j))
  (str (draw-blanks i) char (if (= i j) "" (str (draw-blanks (- j i 1)) char))))

(defn calc-leading-spaces [char index]
  (- (get-index-of-char char) index))

(defn calc-middle-spaces [char]
  (+ 1 (* 2 (- (get-index-of-char char) 1))))


(defn plot-line [char index]
  (gen-line
    (get-char-of-index index)
    (calc-leading-spaces char index)
    (if (= 0 index)
      (calc-leading-spaces char index)
      (+ 1 (calc-leading-spaces char index) (calc-middle-spaces char)))))

;(defn diamond-maker [char]
;  (for [x (range 0 (get-index-of-char char))] (gen-line (get-char-of-index x))
;
;  ))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
