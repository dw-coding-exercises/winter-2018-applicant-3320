(ns my-exercise.elections
  (:require [my-exercise.home :as home]))


(defn search [params]
  (println params))

;{:__anti-forgery-token +acmTxD5jnnhbmm1gGIkaMaSR3DnVOkz8rbjQ6Jg53vTBxDCrxHqIDTTOL/8JiWgxWmXAUAsxheflGZR, :street 123 Way, :street-2 , :city Nashville, :state TN, :zip 37011}

; take these parameters and parse them into address components
; send components to an OCD/ID generator
; build API request
; display the election results on the page... (which page? home.... add to the page function?)
