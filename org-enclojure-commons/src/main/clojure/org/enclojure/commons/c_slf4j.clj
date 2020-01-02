(comment
;*    Copyright (c) ThorTech, L.L.C.. All rights reserved.
;*    The use and distribution terms for this software are covered by the
;*    Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;*    which can be found in the file epl-v10.html at the root of this distribution.
;*    By using this software in any fashion, you are agreeing to be bound by
;*    the terms of this license.
;*    You must not remove this notice, or any other, from this software.
;*
;*    Author: Eric Thorsen
)
(ns
   #^{:author "Eric Thorsen",
       :doc "Logging macros around slf4j.
These macros attempt to put as little additional scafolding as possible on the
sslf4j lib.  It all cases the calls should be the same as direct calls to the
slf4j lib convenience functions."}
 org.enclojure.commons.c-slf4j
 )

(defmacro ensure-logger []
   (let [nsym# (str (ns-name *ns*))]
    `(~@(list 'defonce (with-meta '--logger-- {:private true :tag  'java.util.logging.Logger}))
           (java.util.logging.Logger/getLogger ~nsym#))))

(defmacro log
  "macro to call log passing in a level.  Users should use the convenience macros:
debug, error, trace, warn and info.
NOTE: the def-logging-fn must be called in your file in order to use these macros.
It creates a logger using the namespace bound to *ns* at compile time."
  ([level msg]
    `(let [msg# ~msg]
       ;TODO: set level
       (~@(list '. '--logger--) (log java.util.logging.Level/WARNING #^String msg#))))
  ([level fmt obj]    
    `(let [fmt# ~fmt obj# ~obj]
       ;TODO: set level
        (~@(list '. '--logger--) (log java.util.logging.Level/WARNING #^String fmt# obj#))))
  ([level fmt obj1 obj2]
    `(let [fmt# ~fmt obj1# ~obj1 obj2# ~obj2]
        (~@(list '. '--logger--) (log java.util.logging.Level/WARNING #^String fmt# (to-array [obj1# obj2#])))))
  ([level fmt obj1 obj2 objs]
    `(let [fmt# ~fmt 
           objs# (into-array java.lang.Object  [~obj1 ~obj2 ~@objs])]
        (~@(list '. '--logger--)
            (log java.util.logging.Level/WARNING #^String ~fmt #^"[Ljava.lang.Object;" objs#)))))

(defmacro log-throwable
  ([level msg throwable]
    `(let [msg# ~msg
           throwable# ~throwable]
        (~@(list '. '--logger--)
            (log java.util.logging.Level/WARNING #^String msg# #^Throwable throwable#)))))

(defmacro 
  ;#^{:private true}
  make-level-macros
  "Macro to define the convenience functions for this module.
Users do not call this directly."
  [level julLevel]
  (let [t# (symbol (str level "-throwable"))]
      `(do         
         (defmacro ~level
             ([msg#]
                (let [s# (quote ~level)]
                    `(log ~s# ~msg#)))
             ([msg# obj#]
                (let [s# (quote ~level)]
                    `(log ~s# ~msg# ~obj#)))
             ([msg# obj1# obj2#]
                (let [s# (quote ~level)]
                    `(log ~s# ~msg# ~obj1# ~obj2#)))
             ([msg# obj1# obj2# & objs#]
                    (let [s# (quote ~level)]
                    `(log ~s# ~msg# ~obj1# ~obj2# ~objs#))))
        (defmacro ~t#
             ([msg# throwable#]
               (let [s# (quote ~level)]
                 `(log-throwable ~s# ~msg# ~throwable#)))))))

; Define the convenience macros
(make-level-macros debug java.util.logging.Level/FINE)
(make-level-macros error java.util.logging.Level/SEVERE)
(make-level-macros trace java.util.logging.Level/FINEST)
(make-level-macros warn java.util.logging.Level/WARNING)
(make-level-macros info java.util.logging.Level/INFO)

