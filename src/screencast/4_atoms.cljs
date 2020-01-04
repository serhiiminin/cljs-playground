(ns screencast.4_atoms)

(def state (atom 0))

(deref state) ;; 0
;; or 
@state ;; 0

;; to change atom using callback
(swap! state inc) ;; 1

;; to change atom with concrete value
(reset! state 100) ;; 100

;; if current value of atom equals 101 then it will set 1 as a atoms value (if not it will not be changed)
(compare-and-set! state 101 1) 

;; add watcher
(add-watch state :key (fn [k a o n] (println k a o n)))
;; k - key 
;; a - atom 
;; o - old value
;; n - new value

;; ! - mutations
;; ? - predicate

;; checks if new set value is lower than 5
(set-validator! state #(< % 5))
