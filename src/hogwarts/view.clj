(ns hogwarts.view
  (:use ring.util.response)
  (:require [net.cgrand.enlive-html :as html])
)

(html/deftemplate main-template "templates/index.html"
  []
)

(defn router [request]
  (condp = (:uri request)
    "/"
    (-> (response (apply str (main-template)))
        (content-type "text/html"))

    (-> (response "404")
        (content-type "text/html"))
))
