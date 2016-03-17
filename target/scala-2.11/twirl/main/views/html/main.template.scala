
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*10.70*/("""" type="text/javascript"></script>
    <link rel='stylesheet' href='"""),_display_(/*11.35*/routes/*11.41*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*11.103*/("""'>
<script type='text/javascript' src='"""),_display_(/*12.38*/routes/*12.44*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*12.98*/("""'></script>
        <link rel='stylesheet' href='"""),_display_(/*13.39*/routes/*13.45*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*13.107*/("""'>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    </head>
    <body>
        """),_display_(/*19.10*/content),format.raw/*19.17*/("""

    """),format.raw/*21.5*/("""</body>

</script>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Mar 17 11:43:59 IST 2016
                  SOURCE: /home/knodus/sangeeta/Git/TraineeAppRepo/app/views/main.scala.html
                  HASH: 0e4466a98a60fe4a453c051c96d2721141d1da19
                  MATRIX: 530->1|655->31|683->33|770->94|795->99|883->161|897->167|959->208|1046->269|1060->275|1120->314|1172->339|1187->345|1249->386|1345->455|1360->461|1444->523|1511->563|1526->569|1601->623|1678->673|1693->679|1777->741|2037->974|2065->981|2098->987
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|43->19|43->19|45->21
                  -- GENERATED --
              */
          