// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brunnom/Downloads/walmart-smack/conf/routes
// @DATE:Tue Dec 11 10:46:59 BRT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

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

  // @LINE:15
  class ReverseBuscaFiltradoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def BuscaFiltrado: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BuscaFiltradoController.BuscaFiltrado",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/filtrado"})
        }
      """
    )
  
  }

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

  // @LINE:17
  class ReverseCompraController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def Compra: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CompraController.Compra",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/comprar"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseBuscarGeralController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def BuscaGeral: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BuscarGeralController.BuscaGeral",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/geral"})
        }
      """
    )
  
  }


}
