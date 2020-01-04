;; built-in operators
;; def if do let quote var fn loop recur throw try 

(def x 1) ;; global variable

(let [a 1  ;; local variable
      b 2]
  (* a b))

(defn average [a b] ;; function
  (/ (+ a b) 2))

(average 2 4)  

(if (= x 1)
   (println 1)
   (println 0)) 
