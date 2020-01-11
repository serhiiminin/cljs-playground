(ns screencast.7_js_integration)

(js/setTimeout #(println "works") 1000)

(def obj #js {:a 1 :b 2}) ;; creats js object

(js->clj obj) ;; converts js data type to clojure one
;; {"a" 1 "b" 2} ;; keys are strings due to it's so in js

(clj->js {:a 5 :b 6}) ;; converts clojure data type to js one
;; #js {:b 5 :a 6}

(.-b obj) ;; takes value from js object by key b

(js/Date.) ;; call of constructor

(try (throw (js/Error. "Error message")) (catch js/Error error (println error)))
