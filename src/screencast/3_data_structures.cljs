(ns screencast.3_data_structures)

;; VECTOR 

(def v [1 2 3 4 5]) ;; vector

;; get item from vector by index
(nth v 3) ;; 4
;; or
(v 3) ;; 4

;; get last element of vector
(peek v) ;; 5

;; get items of vector (interval)

(subvec v 1 3) ;; [2 3]

;; push item to the end of vector
(conj v 6) ;; [1 2 3 4 5 6]

;; map vector
(mapv inc v) ;; [2 3 4 5 6]
(mapv dec v) ;; [0 1 2 3 4]

;; filter vector
(filterv odd? v) ;; [1 3 5] takes only odd numbers

(mapv #(+ % 1) v) ;; [2 3 4 5 6]
;; or
(mapv (fn [x] (+ x 1)) v) ;; [2 3 4 5 6]
;; #(+ % 1) - anonymous function that increments values of vector;


;; MAP

(def m {:key1 "a" :key2 {:key21 "b"}})

;; get value by key
(get m :key1)
;; or
(m :key1)
;; or
(:key1 m)

;; get in nested structure
(get-in m [:key2 :key21])

;; set value to map
(assoc m :key3 "c")

;; set value to nested structure
(assoc-in m [:key3 :key31] "c")

;; remove value from map
(dissoc m :key2)

;; merge 2 maps
(merge {:a 1 :b 2})

;; set value to nexted structure with calculation
(update-in m [:key2 : key21] #(str % "c"))


;; SET 

(def s #{1 2 3 4})

;; add value to the end of set 
(conj s 5) ;; #{1 2 3 4 5}

;; delete value by index 
(disj s 3) ;; #{1 2 4}

;; merge sets
(clojure.set/union #{1 2 3} #{2 3 4}) ;; #{1 2 3 4}

;; takes value from the first set that are not present in the second one
(clojure.set/difference #{1 2 3} #{2 3 4}) ;; #{1}

;; get values that both sets contain
(clojure.set/intersection #{1 2 3} #{2 3 4}) ;; #{2 3}

;; COLLECTION

(map inc [1 2 3 4 5]) ;; (2 3 4 5 6) ;; list

(concat [1 2] [3 4]) ;; (1 2 3 4) ;; list

;; to get vector instead of list use the following syntax
(into [] (concat [1 2] [3 4])) ;; [1 2 3 4]

(rest #{1 2 3}) ;; (2 3)

(take 5 (range)) ;; (0 1 2 3 4)

;; flatten 
(mapcat #(map inc %) [[1] [2] [3 4]]) ;; (1 2 3 4)
