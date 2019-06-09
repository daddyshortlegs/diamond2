(ns diamond2.diamond-maker
  (:gen-class))

(use '[clojure.string :only [index-of]])


(defn get-points-for-line [char index]
  [(- 25 index) (+ 25 index)])

(defn get-index-of-char [char]
  (index-of "ABCDEFGHIJKLMNOPQRSTUVWXYZ" char))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
