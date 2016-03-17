
package views.html.adminDashboard

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object assignmentTable_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class assignmentTable extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[repository.Assignment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listOfAssignment:List[repository.Assignment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*3.1*/("""<h1>List of Assignment </h1>
<p>
<table class="table table-striped">
    <thead>
    <tr>
        <th>Id</th>
        <th>Student Name</th>
        <th>Assignment Name</th>
        <th>Date</th>
        <th>Marks</th>
        <th>Remarks</th>
    </tr>
    </thead>
    <tbody>

    """),_display_(/*18.6*/for(items <- listOfAssignment ) yield /*18.37*/{_display_(Seq[Any](format.raw/*18.38*/("""
    """),format.raw/*19.5*/("""<tr>
        <td>"""),_display_(/*20.14*/items/*20.19*/.sno),format.raw/*20.23*/("""</td>
        <td>"""),_display_(/*21.14*/items/*21.19*/.studname),format.raw/*21.28*/("""</td>
        <td>"""),_display_(/*22.14*/items/*22.19*/.name),format.raw/*22.24*/("""</td>
        <td>"""),_display_(/*23.14*/items/*23.19*/.date),format.raw/*23.24*/("""</td>
        <td>"""),_display_(/*24.14*/items/*24.19*/.marks),format.raw/*24.25*/("""</td>
        <td>"""),_display_(/*25.14*/items/*25.19*/.remarks),format.raw/*25.27*/("""</td>

    </tr>


    """)))}),format.raw/*30.6*/("""
    """),format.raw/*31.5*/("""</tbody>
</table>
</p>
"""))
      }
    }
  }

  def render(listOfAssignment:List[repository.Assignment]): play.twirl.api.HtmlFormat.Appendable = apply(listOfAssignment)

  def f:((List[repository.Assignment]) => play.twirl.api.HtmlFormat.Appendable) = (listOfAssignment) => apply(listOfAssignment)

  def ref: this.type = this

}


}

/**/
object assignmentTable extends assignmentTable_Scope0.assignmentTable
              /*
                  -- GENERATED --
                  DATE: Thu Mar 17 11:43:59 IST 2016
                  SOURCE: /home/knodus/sangeeta/Git/TraineeAppRepo/app/views/adminDashboard/assignmentTable.scala.html
                  HASH: 518be8b2c8572ff34388f52d97fc12116a06e9cf
                  MATRIX: 583->1|724->47|752->49|1062->333|1109->364|1148->365|1180->370|1225->388|1239->393|1264->397|1310->416|1324->421|1354->430|1400->449|1414->454|1440->459|1486->478|1500->483|1526->488|1572->507|1586->512|1613->518|1659->537|1673->542|1702->550|1756->574|1788->579
                  LINES: 20->1|25->1|27->3|42->18|42->18|42->18|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|54->30|55->31
                  -- GENERATED --
              */
          