(ns my-exercise.address)


; (defn builder [params])


(defn state-ocd [params]
  (let [state (get params :state)])
  (str "ocd-division/country:us/state:" (clojure.string/lower-case state)))
; lower-casing the state abbreviation and appending it to ocd-division/country:us/state:
