(ns hello.core
  (:require [compojure.core :refer [GET defroutes]]
            [compojure.route :as route]))

(defroutes app
  (GET "/" []
       "Hello, world!")
  (route/not-found "Not Found"))
