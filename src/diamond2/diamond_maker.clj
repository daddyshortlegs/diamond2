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

(defn gen-line []
  (str (draw-blanks 3) "A" (draw-blanks 3) "A")
  )


(defn draw-line [char index]
  (def first (nth (get-points-for-line char index) 0))
  (def second (nth (get-points-for-line char index) 1))
  (str (apply str (take first (repeat " ")))
  (str (get-char-of-index index))
  (apply str (take second (repeat " ")))
  (str (get-char-of-index index))
  (str "\n")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
