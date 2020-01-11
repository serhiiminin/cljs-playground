(ns screencast.6_HOF)

(comp inc inc dec) ;; function composition

(def do-nums (comp inc inc dec))

(do-nums 4) ;; dec => inc => inc
;; 5

(defn sum-three [a b c] (+ a b c));

(def fpn (partial sum-three 1 2)) ;; partial application; similar to carring 

(fpn 3) ;; 6

(memoize do-nums) ;; check for arguments and is they are the same as in previous calls it returns result without calculations

(identity) ;; checks it pased one arg and if it's a truthy value

(filter identity [1 2 3 nil false true]) ;; [1 2 3 true]

(def ac (juxt :a :c)) ;; takes values by passed keys from hash map and returns vector of values
(ac {:a 1 :b 2 :c 3}) ;; [1 3]
