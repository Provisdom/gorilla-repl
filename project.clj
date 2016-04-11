;;;; This file is part of gorilla-repl. Copyright (C) 2014-, Jony Hudson.
;;;;
;;;; gorilla-repl is licenced to you under the MIT licence. See the file LICENCE.txt for full details.

(defproject gorilla-repl "0.3.7"
  :description "A rich REPL for Clojure in the notebook style."
  :url "https://github.com/JonyEpsilon/gorilla-repl"
  :license {:name "MIT"}
  :plugins [[s3-wagon-private "1.2.0"]]
  :repositories [["provisdom" {:url        "s3p://provisdom-artifacts/releases/"
                               :username   :env/aws_access_key,
                               :passphrase :env/aws_secret_key}]]
  :deploy-repositories [["provisdom" {:sign-releases false}]]
  :dependencies ^:replace [[org.clojure/clojure "1.6.0"]
                           [http-kit "2.1.18"]
                           [ring/ring-json "0.3.1"]
                           [cheshire "5.3.1"]
                           [compojure "1.1.8"]
                           [org.slf4j/slf4j-api "1.7.7"]
                           [ch.qos.logback/logback-classic "1.1.2"]
                           [gorilla-renderable "2.0.0"]
                           [gorilla-plot "0.1.4"]
                           [javax.servlet/servlet-api "2.5"]
                           [grimradical/clj-semver "0.2.0" :exclusions [org.clojure/clojure]]
                           [cider/cider-nrepl "0.10.2"]
                           [org.clojure/tools.nrepl "0.2.12"]]
  :main ^:skip-aot gorilla-repl.core
  :target-path "target/%s")
