// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brunnom/Downloads/walmart-smack/conf/routes
// @DATE:Mon Dec 10 16:33:15 BRT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:15
  class ReverseBuscaFiltradoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def BuscaFiltrado(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "produtos/filtrado")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:11
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def sayHello(msg:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "actor/" + implicitly[play.api.mvc.PathBindable[String]].unbind("msg", msg))
    }
  
  }

  // @LINE:17
  class ReverseCompraController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def Compra(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "produtos/comprar")
    }
  
  }

  // @LINE:13
  class ReverseBuscarGeralController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def BuscaGeral(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "produtos/geral")
    }
  
  }


}
