(defproject hello "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[compojure "1.6.0"]
                 [org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.6.3"]]
  :plugins [[lein-ring "0.12.1"]]
  :ring {:handler hello.core/app})
