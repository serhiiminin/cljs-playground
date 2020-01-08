(ns screencast.5_conditions)

(if (< 0 1) 10 20) ;; if 0 < 1 then 10 else 20 

;; when you don't need to have 'else' branch
(when (< 0 1) 10) ;; if 0 < 1 then 10

;; use it when you have many side effects
(do (println 1) (+ 2 3) (println 7))

;; opposite to 
(if-not false 1 0)

(if-let [x (str "hello, " "world")] x 0) ;; 'hello, world'
                 
                 ;; side effect
(when-not false (println 111) 1 2) 
;; 111
;; 2

(when-let [x (str "first" "second")] (println x) (str x "3")) 
;; firstsecond
;; firstsecond3

(cond false 1 true 2) 
;; if cond = false then 1 if true then 2

(case "name" "dan" "Dan" "bob" "Bob" "name" "Name" "default value") ;; like switch case
;; first param after case is what you are comparing with 
;; returns "Name" 
