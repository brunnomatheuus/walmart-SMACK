
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
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Walmart")/*2.17*/ {_display_(Seq[Any](format.raw/*2.19*/("""


  """),format.raw/*5.3*/("""<h1>LISTAR</h1>
  <form method="get" action="/produtos/geral" >
  	<button type="submit">Listar todos os produtos</button>
  </form>

  <p></p>


  <form method="get" action="/produtos/filtrado" >
	  <span> Listar produtos do valor
	  	<input type="number" name="min"/>
	  	 ao valor <input type="number" name="max" />
	  </span>
	  <button type="submit">Listar</button>
  </form>



  <hr/>


  <h1>COMPRAR</h1>
  <form method="get" action="/produtos/comprar">
  	<span>Comprar produto(TIPO)</span>
  	<input type="number" name="tipoProduto"/>
  	<p></p>
  	Quantidade: <input type="number" name="quantidade"/>
  	<button type="submit">Comprar</button>
  </form>
""")))}),format.raw/*34.2*/("""
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
                  DATE: Mon Dec 10 16:41:54 BRT 2018
                  SOURCE: /home/brunnom/Downloads/walmart-smack/app/views/index.scala.html
                  HASH: 583fb80b3eec4a917bcb748e2db020ba44290cb9
                  MATRIX: 1030->2|1053->17|1092->19|1123->24|1818->689
                  LINES: 33->2|33->2|33->2|36->5|65->34
                  -- GENERATED --
              */
          