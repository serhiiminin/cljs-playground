(ns screencast.8_destructuring)

(defn f [v] v)

f([1 2 3 4]) 

;; desctrusturing
(defn destr [[first second third]] [first second third])

(destr [1 2 3 4 5]) ;; [1 2 3] 

(defn destr-rest [[first & rest]] rest)

(destr-rest [1 2 3 4]) ;; (2 3 4) returns rest list of rest items (all items without the first one)

(defn destr-rest-with-origin [[first :as orig]] [first orig])
;; :as returns the whole argument

(destr-rest-with-origin [1 2 3 4]) ;; [1 [1 2 3 4]]


;; descturcturing of a hash map 
(defn destr-hash [{msg :a}] msg) 

(destr-hash {:a "name" :b 1}) ;; "name"

;; default value using :or
(defn destr-hash-with-default [{msg :a :or {msg "default text"}}] msg)

(destr-hash-with-default {:b 1}) ;; there is no :a
;; "default text"


(defn destr-hash-with-orig [{msg :a :as orig] [msg orig])

(destr-hash-with-orig {:a 1 :b 2}) ;; [1, {:a 1 :b 2}]

;; for multiple keys

(defn destr-hash-multiple-keys [{:keys [a b]] [a b])

(destr-hash-multiple-keys {:a 1 :b 2}) ;; [1 2]
