
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Walmart")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
  """),format.raw/*4.3*/("""<h1>LISTAR</h1>
  <form>
  	<button>Listar todos os produtos</button>
  </form>
  <p></p>
  <form>
	  <span> Listar produtos do valor
	  	<input id="menorValor"/>
	  	 ao valor <input id="maiorValor"/>
	  </span>
	  <button>Listar</button>
  </form>
  <hr/>
  <h1>COMPRAR</h1>
  <form>
  	<span>Comprar produto(TIPO)</span>
  	<input id="tipoProduto"/>
  	<p></p>
  	Quantidade: <input id="qtd"/>
  	<button>Comprar</button>
  </form>
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 05 22:13:13 BRT 2018
                  SOURCE: /home/bruno/Downloads/Disciplinas/Concorrente/projetounidade3/app/views/index.scala.html
                  HASH: 993d911d87cb6d206c10673b8779c84887dbbed2
                  MATRIX: 941->1|1037->4|1064->6|1087->21|1126->23|1155->26|1621->462
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|56->25
                  -- GENERATED --
              */
          