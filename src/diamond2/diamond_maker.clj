(ns diamond2.diamond-maker
  (:gen-class))

(use '[clojure.string :only [index-of]])



(defn get-index-of-char [char]
  (index-of "ABCDEFGHIJKLMNOPQRSTUVWXYZ" char))

(defn get-char-of-index [index]
  "A")

(defn get-points-for-line [char index]
  [(- (get-index-of-char char) index) (+ (get-index-of-char char) index)])

(defn draw-line [char index]
  " A\n")

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
