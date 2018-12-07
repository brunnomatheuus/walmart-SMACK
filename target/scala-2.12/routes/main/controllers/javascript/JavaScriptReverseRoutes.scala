// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bruno/Downloads/Disciplinas/Concorrente/projetounidade3/conf/routes
// @DATE:Tue Dec 04 16:18:57 BRT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def sayHello: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.sayHello",
      """
        function(msg0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "actor/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("msg", msg0)})
        }
      """
    )
  
  }


}
