
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loginusers_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class loginusers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[LoginData],Flash,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm:Form[LoginData])(implicit flash:Flash,messages:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.69*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("loginusers")/*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
"""),format.raw/*5.1*/("""<style>
    .container"""),format.raw/*6.15*/("""{"""),format.raw/*6.16*/("""
    """),format.raw/*7.5*/("""background-image:url("""),_display_(/*7.27*/routes/*7.33*/.Assets.versioned("images/login1.png")),format.raw/*7.71*/(""");
    """),format.raw/*8.5*/("""}"""),format.raw/*8.6*/("""

    """),format.raw/*10.5*/("""form"""),format.raw/*10.9*/("""{"""),format.raw/*10.10*/("""
    """),format.raw/*11.5*/("""font-family: 'Arimo', sans-serif;
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""
    """),format.raw/*13.5*/(""".header
    """),format.raw/*14.5*/("""{"""),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""font-family: 'Arimo', sans-serif;
    background-color:#4E004E;
    color:white;
    font-size:30px;
    padding:10px;
    border-radius:2px;
    """),format.raw/*21.5*/("""}"""),format.raw/*21.6*/("""
    """),format.raw/*22.5*/("""span
    """),format.raw/*23.5*/("""{"""),format.raw/*23.6*/("""
    """),format.raw/*24.5*/("""float:none;
    """),format.raw/*25.5*/("""}"""),format.raw/*25.6*/("""
"""),format.raw/*26.1*/("""</style>

<div class="container">



    <div class="row header">
        <div class="col-md-12">
            Login
        </div>
    </div>



        <div class="row">
        <div class="col-md-4 col-md-offset-4 " >
            """),_display_(/*42.14*/b3/*42.16*/.form(routes.UsersController.authenticate)/*42.58*/ {_display_(Seq[Any](format.raw/*42.60*/("""

            """),_display_(/*44.14*/b3/*44.16*/.text( loginForm("username"), '_label -> "User Name",'placeholder -> "Enter UserName" )),format.raw/*44.103*/("""
            """),_display_(/*45.14*/b3/*45.16*/.password( loginForm("password"), '_label -> "Password", 'placeholder -> "Enter password" )),format.raw/*45.107*/("""


            """),_display_(/*48.14*/b3/*48.16*/.submit('class -> "btn btn-primary")/*48.52*/{_display_(Seq[Any](format.raw/*48.53*/(""" """),format.raw/*48.54*/("""Login """)))}),format.raw/*48.61*/("""
                    """)))}),format.raw/*49.22*/("""

        """),format.raw/*51.9*/("""</div>
    </div>


    <div class="row">
        <div class="col-md-12">
            <div>
                """),_display_(/*58.18*/if(flash.get("error").isDefined)/*58.50*/{_display_(Seq[Any](format.raw/*58.51*/("""
                """),format.raw/*59.17*/("""<div class="alert alert-danger">
                    <strong>"""),_display_(/*60.30*/flash/*60.35*/.get("error")),format.raw/*60.48*/("""</strong>
                </div>
                """)))}),format.raw/*62.18*/("""
            """),format.raw/*63.13*/("""</div>
        </div>

    </div>


</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[LoginData],flash:Flash,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)(flash,messages)

  def f:((Form[LoginData]) => (Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => (flash,messages) => apply(loginForm)(flash,messages)

  def ref: this.type = this

}


}

/**/
object loginusers extends loginusers_Scope0.loginusers
              /*
                  -- GENERATED --
                  DATE: Thu Mar 17 11:43:59 IST 2016
                  SOURCE: /home/knodus/sangeeta/Git/TraineeAppRepo/app/views/loginusers.scala.html
                  HASH: 237409fe14ddeb2db8a070b27e0939fee4319cc0
                  MATRIX: 561->1|758->68|785->106|812->108|838->126|876->127|903->128|952->150|980->151|1011->156|1059->178|1073->184|1131->222|1164->229|1191->230|1224->236|1255->240|1284->241|1316->246|1381->284|1409->285|1441->290|1480->302|1508->303|1540->308|1713->454|1741->455|1773->460|1809->469|1837->470|1869->475|1912->491|1940->492|1968->493|2228->726|2239->728|2290->770|2330->772|2372->787|2383->789|2492->876|2533->890|2544->892|2657->983|2700->999|2711->1001|2756->1037|2795->1038|2824->1039|2862->1046|2915->1068|2952->1078|3088->1187|3129->1219|3168->1220|3213->1237|3302->1299|3316->1304|3350->1317|3431->1367|3472->1380
                  LINES: 20->1|25->1|26->3|27->4|27->4|27->4|28->5|29->6|29->6|30->7|30->7|30->7|30->7|31->8|31->8|33->10|33->10|33->10|34->11|35->12|35->12|36->13|37->14|37->14|38->15|44->21|44->21|45->22|46->23|46->23|47->24|48->25|48->25|49->26|65->42|65->42|65->42|65->42|67->44|67->44|67->44|68->45|68->45|68->45|71->48|71->48|71->48|71->48|71->48|71->48|72->49|74->51|81->58|81->58|81->58|82->59|83->60|83->60|83->60|85->62|86->63
                  -- GENERATED --
              */
          