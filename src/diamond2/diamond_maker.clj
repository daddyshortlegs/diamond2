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

(defn gen-line [i j]
  (str (draw-blanks i) "A" (if (= i j) "" (str (draw-blanks (- j i 1)) "A"))))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
