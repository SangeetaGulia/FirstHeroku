
package views.html.adminDashboard

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object awardTable_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class awardTable extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[repository.Awards],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listOfAwards:List[repository.Awards]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*3.1*/("""<h1>List of Awards </h1>
<p>
<table class="table table-striped">
    <thead>
    <tr>
        <th>S.no.</th>
        <th>Student Name</th>
        <th>Details</th>
        <th>Year</th>
    </tr>
    </thead>
    <tbody>

    """),_display_(/*16.6*/for(items <- listOfAwards ) yield /*16.33*/{_display_(Seq[Any](format.raw/*16.34*/("""

"""),format.raw/*18.1*/("""<tr>
    <td>"""),_display_(/*19.10*/items/*19.15*/.sno),format.raw/*19.19*/("""</td>
    <td>"""),_display_(/*20.10*/items/*20.15*/.name),format.raw/*20.20*/("""</td>
    <td>"""),_display_(/*21.10*/items/*21.15*/.details),format.raw/*21.23*/("""</td>
    <td>"""),_display_(/*22.10*/items/*22.15*/.year),format.raw/*22.20*/("""</td>
</tr>


    """)))}),format.raw/*26.6*/("""
    """),format.raw/*27.5*/("""</tbody>
</table>
</p>
"""))
      }
    }
  }

  def render(listOfAwards:List[repository.Awards]): play.twirl.api.HtmlFormat.Appendable = apply(listOfAwards)

  def f:((List[repository.Awards]) => play.twirl.api.HtmlFormat.Appendable) = (listOfAwards) => apply(listOfAwards)

  def ref: this.type = this

}


}

/**/
object awardTable extends awardTable_Scope0.awardTable
              /*
                  -- GENERATED --
                  DATE: Thu Mar 17 11:43:59 IST 2016
                  SOURCE: /home/knodus/sangeeta/Git/TraineeAppRepo/app/views/adminDashboard/awardTable.scala.html
                  HASH: b48d20d6c8c365bcbbd81acfd5007bb7005777eb
                  MATRIX: 569->1|702->39|730->41|983->268|1026->295|1065->296|1094->298|1135->312|1149->317|1174->321|1216->336|1230->341|1256->346|1298->361|1312->366|1341->374|1383->389|1397->394|1423->399|1472->418|1504->423
                  LINES: 20->1|25->1|27->3|40->16|40->16|40->16|42->18|43->19|43->19|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|50->26|51->27
                  -- GENERATED --
              */
          