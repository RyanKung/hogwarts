(ns hogwarts.core
  (:use ring.adapter.jetty
        ring.util.response
        hogwarts.view)

  (:require [net.cgrand.enlive-html :as html])
)
(defn -main
  [& args]
  (run-jetty router {:port 8080}))
