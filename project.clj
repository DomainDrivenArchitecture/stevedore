(defproject dda/stevedore "0.8.1-SNAPSHOT"
  :description "Embeds shell script in clojure"
  :url "http://palletops.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:url "git@github.com:DomainDrivenArchitecture/stevedore.git"}
  :dependencies [[org.clojure/tools.logging "0.4.0"
                  :exclusions [org.clojure/clojure]]
                 [dda/pallet-common "0.4.1-SNAPSHOT"
                  :exclusions [org.clojure/clojure]]])
