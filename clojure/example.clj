;; Literals

; Negative infinity
(println ##-Inf)
; Positive infinity
(println ##Inf)

; Strings
(def my-name "Fred Jones")
(println my-name)

; Collections
; list
(def random-values '(6 3 84 1 39))
(println random-values)

; vector
(def random-values-vector [9 2 47 13 6])
(println random-values-vector)

; set
(def random-set #{3 54 6 887 1})
(println random-set)

; map
(def my-map
  {:a 2,
   :b 5,
   :c 4,
   :d 8})
(println my-map)

;; Maps
(def scores {"Fred" 1400
             "Bob" 1240
             "Angelo" 2013})

(println scores)

