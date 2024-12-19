(ns core
  (:require [io.github.rafa0805/clj-git-lib :as clj-git-lib]))


(defn -main
  [& args]
  (println "Rusult : " (clj-git-lib.basic-math/sub 10 5)))
