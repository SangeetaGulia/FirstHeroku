
package views.html.adminDashboard

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object progLanguageTable_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class progLanguageTable extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[repository.ProgrammingLanguage],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listOfLanguage:List[repository.ProgrammingLanguage]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*3.1*/("""<h1>List of Programming Languages Known </h1>
<p>
<table class="table table-striped">
    <thead>
    <tr>
        <th>S.no.</th>
        <th>Student Name</th>
        <th>Language Name</th>
        <th>Fluency</th>
    </tr>
    </thead>
    <tbody>

    """),_display_(/*16.6*/for(items <- listOfLanguage ) yield /*16.35*/{_display_(Seq[Any](format.raw/*16.36*/("""

    """),format.raw/*18.5*/("""<tr>
        <td>"""),_display_(/*19.14*/items/*19.19*/.sno),format.raw/*19.23*/("""</td>
        <td>"""),_display_(/*20.14*/items/*20.19*/.studname),format.raw/*20.28*/("""</td>
        <td>"""),_display_(/*21.14*/items/*21.19*/.langname),format.raw/*21.28*/("""</td>
        <td>"""),_display_(/*22.14*/items/*22.19*/.fluency),format.raw/*22.27*/("""</td>
    </tr>


    """)))}),format.raw/*26.6*/("""
    """),format.raw/*27.5*/("""</tbody>
</table>
</p>"""))
      }
    }
  }

  def render(listOfLanguage:List[repository.ProgrammingLanguage]): play.twirl.api.HtmlFormat.Appendable = apply(listOfLanguage)

  def f:((List[repository.ProgrammingLanguage]) => play.twirl.api.HtmlFormat.Appendable) = (listOfLanguage) => apply(listOfLanguage)

  def ref: this.type = this

}


}

/**/
object progLanguageTable extends progLanguageTable_Scope0.progLanguageTable
              /*
                  -- GENERATED --
                  DATE: Thu Mar 17 11:43:59 IST 2016
                  SOURCE: /home/knodus/sangeeta/Git/TraineeAppRepo/app/views/adminDashboard/progLanguageTable.scala.html
                  HASH: 92b3cbacda3cbff77a7b377e15798d99aa488eb9
                  MATRIX: 596->1|744->54|772->56|1055->313|1100->342|1139->343|1172->349|1217->367|1231->372|1256->376|1302->395|1316->400|1346->409|1392->428|1406->433|1436->442|1482->461|1496->466|1525->474|1578->497|1610->502
                  LINES: 20->1|25->1|27->3|40->16|40->16|40->16|42->18|43->19|43->19|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|50->26|51->27
                  -- GENERATED --
              */
          