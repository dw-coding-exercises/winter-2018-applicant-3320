(ns my-exercise.address)


; lower-casing the state abbreviation and appending it to ocd-division/country:us/state:
; ** Error accessing the state from the params hashmap
(defn state-ocd [params]
  (let [state (get params :state)])
  (str "ocd-division/country:us/state:" (clojure.string/lower-case state)))
