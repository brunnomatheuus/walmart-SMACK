// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brunnom/Downloads/walmart-smack/conf/routes
// @DATE:Tue Dec 11 10:46:59 BRT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:9
  Assets_4: controllers.Assets,
  // @LINE:11
  Application_5: controllers.Application,
  // @LINE:13
  BuscarGeralController_2: controllers.BuscarGeralController,
  // @LINE:15
  BuscaFiltradoController_0: controllers.BuscaFiltradoController,
  // @LINE:17
  CompraController_3: controllers.CompraController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:9
    Assets_4: controllers.Assets,
    // @LINE:11
    Application_5: controllers.Application,
    // @LINE:13
    BuscarGeralController_2: controllers.BuscarGeralController,
    // @LINE:15
    BuscaFiltradoController_0: controllers.BuscaFiltradoController,
    // @LINE:17
    CompraController_3: controllers.CompraController
  ) = this(errorHandler, HomeController_1, Assets_4, Application_5, BuscarGeralController_2, BuscaFiltradoController_0, CompraController_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_4, Application_5, BuscarGeralController_2, BuscaFiltradoController_0, CompraController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """actor/""" + "$" + """msg<.+>""", """controllers.Application.sayHello(msg:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produtos/geral""", """controllers.BuscarGeralController.BuscaGeral()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produtos/filtrado""", """controllers.BuscaFiltradoController.BuscaFiltrado()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produtos/comprar""", """controllers.CompraController.Compra()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_sayHello2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("actor/"), DynamicPart("msg", """.+""",false)))
  )
  private[this] lazy val controllers_Application_sayHello2_invoker = createInvoker(
    Application_5.sayHello(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "sayHello",
      Seq(classOf[String]),
      "GET",
      this.prefix + """actor/""" + "$" + """msg<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BuscarGeralController_BuscaGeral3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produtos/geral")))
  )
  private[this] lazy val controllers_BuscarGeralController_BuscaGeral3_invoker = createInvoker(
    BuscarGeralController_2.BuscaGeral(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BuscarGeralController",
      "BuscaGeral",
      Nil,
      "GET",
      this.prefix + """produtos/geral""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BuscaFiltradoController_BuscaFiltrado4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produtos/filtrado")))
  )
  private[this] lazy val controllers_BuscaFiltradoController_BuscaFiltrado4_invoker = createInvoker(
    BuscaFiltradoController_0.BuscaFiltrado(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BuscaFiltradoController",
      "BuscaFiltrado",
      Nil,
      "GET",
      this.prefix + """produtos/filtrado""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_CompraController_Compra5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produtos/comprar")))
  )
  private[this] lazy val controllers_CompraController_Compra5_invoker = createInvoker(
    CompraController_3.Compra(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CompraController",
      "Compra",
      Nil,
      "GET",
      this.prefix + """produtos/comprar""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_Application_sayHello2_route(params@_) =>
      call(params.fromPath[String]("msg", None)) { (msg) =>
        controllers_Application_sayHello2_invoker.call(Application_5.sayHello(msg))
      }
  
    // @LINE:13
    case controllers_BuscarGeralController_BuscaGeral3_route(params@_) =>
      call { 
        controllers_BuscarGeralController_BuscaGeral3_invoker.call(BuscarGeralController_2.BuscaGeral())
      }
  
    // @LINE:15
    case controllers_BuscaFiltradoController_BuscaFiltrado4_route(params@_) =>
      call { 
        controllers_BuscaFiltradoController_BuscaFiltrado4_invoker.call(BuscaFiltradoController_0.BuscaFiltrado())
      }
  
    // @LINE:17
    case controllers_CompraController_Compra5_route(params@_) =>
      call { 
        controllers_CompraController_Compra5_invoker.call(CompraController_3.Compra())
      }
  }
}
