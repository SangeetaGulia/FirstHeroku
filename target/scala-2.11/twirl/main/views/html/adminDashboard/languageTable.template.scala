
package views.html.adminDashboard

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object languageTable_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class languageTable extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[repository.Language],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listOfLanguage:List[repository.Language]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*3.1*/("""<h1>List of Languages Known </h1>
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

  def render(listOfLanguage:List[repository.Language]): play.twirl.api.HtmlFormat.Appendable = apply(listOfLanguage)

  def f:((List[repository.Language]) => play.twirl.api.HtmlFormat.Appendable) = (listOfLanguage) => apply(listOfLanguage)

  def ref: this.type = this

}


}

/**/
object languageTable extends languageTable_Scope0.languageTable
              /*
                  -- GENERATED --
                  DATE: Thu Mar 17 11:43:59 IST 2016
                  SOURCE: /home/knodus/sangeeta/Git/TraineeAppRepo/app/views/adminDashboard/languageTable.scala.html
                  HASH: 376ec79e1e5ffb9e097276726d7e4760e3526909
                  MATRIX: 577->1|714->43|742->45|1013->290|1058->319|1097->320|1130->326|1175->344|1189->349|1214->353|1260->372|1274->377|1304->386|1350->405|1364->410|1394->419|1440->438|1454->443|1483->451|1536->474|1568->479
                  LINES: 20->1|25->1|27->3|40->16|40->16|40->16|42->18|43->19|43->19|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|50->26|51->27
                  -- GENERATED --
              */
          