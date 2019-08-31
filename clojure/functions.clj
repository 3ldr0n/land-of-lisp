(defn greet
  ([] (greet "Stranger"))
  ([name] (str "Hello, " name)))

(println (greet "Edison"))
(println (greet))

(defn variadic-greeting [greeting & who]
  (str greeting who))

(println (variadic-greeting "Hello, " "Fred"))
(println (variadic-greeting "Hello, " "Fred" "Jones"))

;; Anonymous functions
(fn [x] (* x x))
#(* %1 %2)

(fn [x] [x])
#(vector %)
(vector)

;; Apply
(apply println (apply greet '("Fred")))
