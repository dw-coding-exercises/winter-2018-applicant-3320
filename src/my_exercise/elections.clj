(ns my-exercise.elections
  (:require [hiccup.page :refer [html5]]
            [my-exercise.home :as home]
            [my-exercise.address :as address]))

(defn search [params]
  (html5
   (home/header params)
   (address/state-ocd params)
   [:p (str params)]))

; take these parameters and parse them into address components
; send components to an OCD/ID generator
; build API request
; display the election results on the page... (which page? home.... add to the page function?)
