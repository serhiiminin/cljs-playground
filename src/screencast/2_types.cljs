(ns screencast.2_types)

;; number string keyword symbol list vector map set

1 2 3.4 ;; number

"hello" ;; string 

:name ;; keyword (are used as keys for hashmaps)

'foo ;; symbol


;; list 
(list 1 2 3 4 5)
;; or 
'(1 2 3 4 5)

;; vector
(vector 1 2 3 4 5)
;; or
[1 2 3 4 5]

;; map 
{:a 1 :b 2}

;; set
#{1 2 3 4 5} ;; unique values
