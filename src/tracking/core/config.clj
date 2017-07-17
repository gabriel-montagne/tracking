(ns tracking.core.config
  (:require
   [clj-http.cookies :as cookie]
   [ak-dbg.core :refer :all]
   [environ.core :refer [env]]))

(def secret "mysecret")

(defonce db (str "jdbc:postgres://localhost"
                 "/tracking"
                 "?user=sa"
                 "&password=2vE7kG4fG.@w9T"))

(def trusted-algs #{:bcrypt+sha512})

(def smtp {:host "tech@orkiee.com"
           :user "office@softdata.ro"
           :pass "OrkieeRocks2016!"})
