
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object homepage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class homepage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[repository.Awards],Flash,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(awardForm:Form[repository.Awards])(implicit flash:Flash,messages:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.77*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("homepage")/*4.18*/{_display_(Seq[Any](format.raw/*4.19*/("""


"""),format.raw/*7.1*/("""<div class="container">

    <div class="row">
        <div class="col-md-1 col-md-offset-11">
            <a href=""""),_display_(/*11.23*/routes/*11.29*/.UsersController.logout),format.raw/*11.52*/("""" style="margin-top:10px;"><button class="btn btn-success">Log out</button></a>
        </div>
    </div>

    <h2>User Homepage</h2>
    <ul class="nav nav-tabs">
        <li class="active"><a data-toggle="tab" href="#home">Home</a></li>

        <li><a data-toggle="tab" href="#menu1" id="awards">Awards</a></li>
        <li><a data-toggle="tab" href="#menu2" id="language">Languages Known</a></li>
        <li><a data-toggle="tab" href="#menu3" id="assignment">Assignment</a></li>
        <li><a data-toggle="tab" href="#menu4" id="programming">Programming Language</a></li>
    </ul>

    <div class="tab-content">

        <div id="home" class="tab-pane fade in active">
            <h3>HOME</h3>
            <p>HOME</p>
        </div>

        <!-- Awards div started -->
        <div id="menu1" class="tab-pane fade">
            <div id="awardsDiv"></div>

            <p>
               <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal4">Add Record</button>

            <div class="modal fade" id="myModal4" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Add Award</h4>
                        </div>
                        <div class="modal-body">
                            <div class="alert alert-success message" id="successAward" style="display:none;">
                                <strong>Success!</strong>Award has been successfully added.
                            </div>
                            <p>

                                """),_display_(/*54.34*/b3/*54.36*/.form(action=routes.UsersController.addAwards, 'id -> "awardForm" )/*54.103*/ {_display_(Seq[Any](format.raw/*54.105*/("""

                                """),_display_(/*56.34*/b3/*56.36*/.text( awardForm("name"), '_label -> "Student Name",'placeholder -> "Enter Name" )),format.raw/*56.118*/("""
                                """),_display_(/*57.34*/b3/*57.36*/.text( awardForm("details"), '_label -> "Details",'placeholder -> "Enter Award Details" )),format.raw/*57.125*/("""
                                """),_display_(/*58.34*/b3/*58.36*/.number( awardForm("year"), '_label -> "Year",'placeholder -> "Enter Year" )),format.raw/*58.112*/("""
                                """),_display_(/*59.34*/b3/*59.36*/.number( awardForm("sno"), '_label -> "Serial Number",'value->"1" )),format.raw/*59.103*/("""

                                """),format.raw/*61.33*/("""<button type="submit" id="awardadd" class="btn btn-default">Add</button>

                                """)))}),format.raw/*63.34*/("""

                            """),format.raw/*65.29*/("""</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>

                </div>
            </div>





            </p>






        </div>
        <!-- Awards div ended -->

        <div id="menu2" class="tab-pane fade">
            <div id="languageDiv"> </div>
        </div>

        <div id="menu3" class="tab-pane fade">
            <div id="assignmentDiv"></div>
        </div >

        <div id="menu4" class="tab-pane fade">
            <div id="programmingDiv"></div>
        </div>
    </div>
</div>

<script>
    $(document).ready(function()"""),format.raw/*104.33*/("""{"""),format.raw/*104.34*/("""
    """),format.raw/*105.5*/("""$('#awards').click(function()"""),format.raw/*105.34*/("""{"""),format.raw/*105.35*/("""

    """),format.raw/*107.5*/("""$.get("/users/getuserawards",function(data,status)"""),format.raw/*107.55*/("""{"""),format.raw/*107.56*/("""
    """),format.raw/*108.5*/("""$('#awardsDiv').html(data);
    """),format.raw/*109.5*/("""}"""),format.raw/*109.6*/(""");
    """),format.raw/*110.5*/("""}"""),format.raw/*110.6*/(""");

    """),format.raw/*112.5*/("""}"""),format.raw/*112.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*116.33*/("""{"""),format.raw/*116.34*/("""
    """),format.raw/*117.5*/("""$('#assignment').click(function()"""),format.raw/*117.38*/("""{"""),format.raw/*117.39*/("""

    """),format.raw/*119.5*/("""$.get("/users/getuserassignment",function(data,status)"""),format.raw/*119.59*/("""{"""),format.raw/*119.60*/("""
    """),format.raw/*120.5*/("""$('#assignmentDiv').html(data);
    """),format.raw/*121.5*/("""}"""),format.raw/*121.6*/(""");
    """),format.raw/*122.5*/("""}"""),format.raw/*122.6*/(""");

    """),format.raw/*124.5*/("""}"""),format.raw/*124.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*128.33*/("""{"""),format.raw/*128.34*/("""
    """),format.raw/*129.5*/("""$('#language').click(function()"""),format.raw/*129.36*/("""{"""),format.raw/*129.37*/("""

    """),format.raw/*131.5*/("""$.get("/users/getuserlanguage",function(data,status)"""),format.raw/*131.57*/("""{"""),format.raw/*131.58*/("""
    """),format.raw/*132.5*/("""$('#languageDiv').html(data);
    """),format.raw/*133.5*/("""}"""),format.raw/*133.6*/(""");
    """),format.raw/*134.5*/("""}"""),format.raw/*134.6*/(""");

    """),format.raw/*136.5*/("""}"""),format.raw/*136.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*140.33*/("""{"""),format.raw/*140.34*/("""
    """),format.raw/*141.5*/("""$('#programming').click(function()"""),format.raw/*141.39*/("""{"""),format.raw/*141.40*/("""

    """),format.raw/*143.5*/("""$.get("/users/getuserprogramming",function(data,status)"""),format.raw/*143.60*/("""{"""),format.raw/*143.61*/("""
    """),format.raw/*144.5*/("""$('#programmingDiv').html(data);
    """),format.raw/*145.5*/("""}"""),format.raw/*145.6*/(""");
    """),format.raw/*146.5*/("""}"""),format.raw/*146.6*/(""");

    """),format.raw/*148.5*/("""}"""),format.raw/*148.6*/(""");
</script>


<script>
$(document).ready(function()"""),format.raw/*153.29*/("""{"""),format.raw/*153.30*/("""

"""),format.raw/*155.1*/("""$('#myAssignmentForm').submit(function(e)"""),format.raw/*155.42*/("""{"""),format.raw/*155.43*/("""
"""),format.raw/*156.1*/("""e.preventDefault();
$form=$(this);
$.post('"""),_display_(/*158.10*/routes/*158.16*/.UsersController.addAssignments),format.raw/*158.47*/("""',$(this).serialize(),function(data)"""),format.raw/*158.83*/("""{"""),format.raw/*158.84*/("""
"""),format.raw/*159.1*/("""$('#successAssign').fadeIn(3000);
$('#myAssignmentForm')[0].reset();
"""),format.raw/*161.1*/("""}"""),format.raw/*161.2*/(""");


"""),format.raw/*164.1*/("""}"""),format.raw/*164.2*/(""");
"""),format.raw/*165.1*/("""}"""),format.raw/*165.2*/(""");
</script>

<script>
$(document).ready(function()"""),format.raw/*169.29*/("""{"""),format.raw/*169.30*/("""

"""),format.raw/*171.1*/("""$('#awardForm').submit(function(e)"""),format.raw/*171.35*/("""{"""),format.raw/*171.36*/("""
"""),format.raw/*172.1*/("""e.preventDefault();
$form=$(this);
$.post('"""),_display_(/*174.10*/routes/*174.16*/.UsersController.addAwards),format.raw/*174.42*/("""',$(this).serialize(),function(data)"""),format.raw/*174.78*/("""{"""),format.raw/*174.79*/("""
"""),format.raw/*175.1*/("""$('#successAward').fadeIn(3000);
$('#awardForm')[0].reset();
"""),format.raw/*177.1*/("""}"""),format.raw/*177.2*/(""");


"""),format.raw/*180.1*/("""}"""),format.raw/*180.2*/(""");
"""),format.raw/*181.1*/("""}"""),format.raw/*181.2*/(""");
</script>


""")))}))
      }
    }
  }

  def render(awardForm:Form[repository.Awards],flash:Flash,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(awardForm)(flash,messages)

  def f:((Form[repository.Awards]) => (Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (awardForm) => (flash,messages) => apply(awardForm)(flash,messages)

  def ref: this.type = this

}


}

/**/
object homepage extends homepage_Scope0.homepage
              /*
                  -- GENERATED --
                  DATE: Thu Mar 17 11:43:59 IST 2016
                  SOURCE: /home/knodus/sangeeta/Git/TraineeAppRepo/app/views/homepage.scala.html
                  HASH: 8d2e95fb15ae212816590722b9a06eb451143b65
                  MATRIX: 565->1|770->76|797->114|824->116|848->132|886->133|915->136|1059->253|1074->259|1118->282|2954->2091|2965->2093|3042->2160|3083->2162|3145->2197|3156->2199|3260->2281|3321->2315|3332->2317|3443->2406|3504->2440|3515->2442|3613->2518|3674->2552|3685->2554|3774->2621|3836->2655|3974->2762|4032->2792|4815->3546|4845->3547|4878->3552|4936->3581|4966->3582|5000->3588|5079->3638|5109->3639|5142->3644|5202->3676|5231->3677|5266->3684|5295->3685|5331->3693|5360->3694|5444->3749|5474->3750|5507->3755|5569->3788|5599->3789|5633->3795|5716->3849|5746->3850|5779->3855|5843->3891|5872->3892|5907->3899|5936->3900|5972->3908|6001->3909|6085->3964|6115->3965|6148->3970|6208->4001|6238->4002|6272->4008|6353->4060|6383->4061|6416->4066|6478->4100|6507->4101|6542->4108|6571->4109|6607->4117|6636->4118|6720->4173|6750->4174|6783->4179|6846->4213|6876->4214|6910->4220|6994->4275|7024->4276|7057->4281|7122->4318|7151->4319|7186->4326|7215->4327|7251->4335|7280->4336|7361->4388|7391->4389|7421->4391|7491->4432|7521->4433|7550->4434|7622->4478|7638->4484|7691->4515|7756->4551|7786->4552|7815->4553|7912->4622|7941->4623|7974->4628|8003->4629|8034->4632|8063->4633|8143->4684|8173->4685|8203->4687|8266->4721|8296->4722|8325->4723|8397->4767|8413->4773|8461->4799|8526->4835|8556->4836|8585->4837|8674->4898|8703->4899|8736->4904|8765->4905|8796->4908|8825->4909
                  LINES: 20->1|25->1|26->3|27->4|27->4|27->4|30->7|34->11|34->11|34->11|77->54|77->54|77->54|77->54|79->56|79->56|79->56|80->57|80->57|80->57|81->58|81->58|81->58|82->59|82->59|82->59|84->61|86->63|88->65|127->104|127->104|128->105|128->105|128->105|130->107|130->107|130->107|131->108|132->109|132->109|133->110|133->110|135->112|135->112|139->116|139->116|140->117|140->117|140->117|142->119|142->119|142->119|143->120|144->121|144->121|145->122|145->122|147->124|147->124|151->128|151->128|152->129|152->129|152->129|154->131|154->131|154->131|155->132|156->133|156->133|157->134|157->134|159->136|159->136|163->140|163->140|164->141|164->141|164->141|166->143|166->143|166->143|167->144|168->145|168->145|169->146|169->146|171->148|171->148|176->153|176->153|178->155|178->155|178->155|179->156|181->158|181->158|181->158|181->158|181->158|182->159|184->161|184->161|187->164|187->164|188->165|188->165|192->169|192->169|194->171|194->171|194->171|195->172|197->174|197->174|197->174|197->174|197->174|198->175|200->177|200->177|203->180|203->180|204->181|204->181
                  -- GENERATED --
              */
          