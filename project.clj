(defproject hogwarts "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/java.jdbc "0.3.2"]
                 [postgresql "9.1-901.jdbc4"]
                 [enlive "1.1.5"]
                 [ring "1.3.0"]
                 [clojurewerkz/neocons"3.0.0"]]
  :main ^:skip-aot hogwarts.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
