(ns hello.core
  (:require [compojure.core :refer [GET defroutes]]))

(defroutes app
  (GET "/" []
       "Hello, world!"))
