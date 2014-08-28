(ns lightbringer.view
  (:use ring.util.response)
  (:require [net.cgrand.enlive-html :as html])
)

(html/deftemplate main-template "templates/index.html"
  [str]
  [:html] (html/content str))

(defn router [request]
  (condp = (:uri request)
    "/"
    (-> (response (apply str (main-template (:uri request))))
        (content-type "text/html"))

    (-> (response "404")
        (content-type "text/html"))
))
