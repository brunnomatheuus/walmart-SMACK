
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
/*1.2*/import walmart.Produto

object listaProdutos extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Produto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(
        array: List[Produto]
):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Lista geral")/*6.21*/ {_display_(Seq[Any](format.raw/*6.23*/("""
    """),format.raw/*7.5*/("""<form action="/">
        <button>Página inicial</button>
    </form>

    <ul>
    """),_display_(/*12.6*/for(produto <- array) yield /*12.27*/ {_display_(Seq[Any](format.raw/*12.29*/("""
        """),format.raw/*13.9*/("""<li>"""),_display_(/*13.14*/produto),format.raw/*13.21*/("""</li>
    """)))}),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""</ul>
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(array:List[Produto]): play.twirl.api.HtmlFormat.Appendable = apply(array)

  def f:((List[Produto]) => play.twirl.api.HtmlFormat.Appendable) = (array) => apply(array)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 11 10:46:59 BRT 2018
                  SOURCE: /home/brunnom/Downloads/walmart-smack/app/views/listaProdutos.scala.html
                  HASH: 8fa9e163a91172a85466a66cad428e57bd3ac17c
                  MATRIX: 651->1|993->25|1119->58|1146->60|1173->79|1212->81|1243->86|1354->171|1391->192|1431->194|1467->203|1499->208|1527->215|1568->226|1600->231|1637->238
                  LINES: 24->1|29->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|44->13|44->13|45->14|46->15|47->16
                  -- GENERATED --
              */
          