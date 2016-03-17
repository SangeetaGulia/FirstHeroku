
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminhomepage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class adminhomepage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[repository.Interns],Form[repository.Assignment],Flash,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(internForm:Form[repository.Interns],assignmentForm:Form[repository.Assignment])(implicit flash:Flash,messages:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.122*/("""
"""),_display_(/*3.2*/main("adminhomepage")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""

"""),format.raw/*5.1*/("""<style>

</style>
<div class="container">
    <div class="row">
        <div class="col-md-1 col-md-offset-11">
            <a href=""""),_display_(/*11.23*/routes/*11.29*/.UsersController.logout),format.raw/*11.52*/("""" style="margin-top:10px;"><button class="btn btn-success">Log out</button></a>
        </div>
    </div>
    <h2>Admin Homepage</h2>
    <ul class="nav nav-tabs">
        <li class="active"><a data-toggle="tab" href="#home">Home</a></li>

        <li><a data-toggle="tab" href="#menu1" id="awards">Awards</a></li>
        <li><a data-toggle="tab" href="#menu2" id="language">Languages Known</a></li>
        <li><a data-toggle="tab" href="#menu3" id="assignment">Assignment</a></li>
        <li><a data-toggle="tab" href="#menu4" id="programming">Programming Language</a></li>
        <li><a data-toggle="tab" href="#menu5" id="intern">Intern Details</a></li>
    </ul>

    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">
            <h3>HOME</h3>
            <p>HOME</p>
        </div>
        <div id="menu1" class="tab-pane fade">
            <h3>Awards</h3>
            <p>


            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">Add Record</button>

            <div class="modal fade" id="myModal" role="dialog"></div>

            </p>
        </div>
        <div id="menu2" class="tab-pane fade">
            <h3>Language Known</h3>
            <p>


            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal1">Add Record</button>

            <div class="modal fade" id="myModal1" role="dialog"></div>


            </p>
        </div>

        <div id="menu3" class="tab-pane fade">

              <div id="assignmentRecord"></div>
            <p>
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal2">Add Record</button>
            <div class="modal fade" id="myModal2" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Assignments</h4>
                        </div>
                        <div class="modal-body">

            <div class="alert alert-success message" id="successAssign" style="display:none;">
                <strong>Success!</strong>Assignment has been successfully added.
            </div>
            <p>
                """),_display_(/*74.18*/b3/*74.20*/.form(action=routes.UsersController.addAssignments, 'id -> "myAssignmentForm" )/*74.99*/ {_display_(Seq[Any](format.raw/*74.101*/("""
                """),_display_(/*75.18*/b3/*75.20*/.number( assignmentForm("sno"), '_label -> "Serial No.",'value -> "1" )),format.raw/*75.91*/("""
                """),_display_(/*76.18*/b3/*76.20*/.text( assignmentForm("studname"), '_label -> "Student Name",'placeholder -> "Enter Student Name" )),format.raw/*76.119*/("""
                """),_display_(/*77.18*/b3/*77.20*/.text( assignmentForm("name"), '_label -> "Assignment Name",'placeholder -> "Enter Assignment Name" )),format.raw/*77.121*/("""
                """),_display_(/*78.18*/b3/*78.20*/.date( assignmentForm("date"), '_label -> "Date",'placeholder -> "Enter Date" )),format.raw/*78.99*/("""
                """),_display_(/*79.18*/b3/*79.20*/.number( assignmentForm("marks"), '_label -> "Marks",'placeholder -> "Enter Marks" )),format.raw/*79.104*/("""
                """),_display_(/*80.18*/b3/*80.20*/.text( assignmentForm("remarks"), '_label -> "Remarks",'placeholder -> "Enter Remarks" )),format.raw/*80.108*/("""
                """),format.raw/*81.17*/("""<button type="submit" id="assignmentadd" class="btn btn-default">Add</button>
                """)))}),format.raw/*82.18*/("""
            """),format.raw/*83.13*/("""</p>
        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
</div>

                </div>
            </div>



            </p>
        </div>


        <div id="menu4" class="tab-pane fade">
            <h3>Programming Language</h3>
            <p>
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal3">Add Record</button>

            <div class="modal fade" id="myModal3" role="dialog">

            </div>
            </p>
        </div>
        <div id="menu5" class="tab-pane fade">
               <p>
                <div id="internRecord"></div>



            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal4">Add Record</button>

            <div class="modal fade" id="myModal4" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Add Intern</h4>
                        </div>
                        <div class="modal-body">
                            <div class="alert alert-success message" id="successIntern" style="display:none;">
                                <strong>Success!</strong>Intern has been successfully added.
                            </div>
                            <p>

                                """),_display_(/*132.34*/b3/*132.36*/.form(action=routes.UsersController.addInterns, 'id -> "myForm" )/*132.101*/ {_display_(Seq[Any](format.raw/*132.103*/("""

                                """),_display_(/*134.34*/b3/*134.36*/.text( internForm("name"), '_label -> "Name",'placeholder -> "Enter InternName" )),format.raw/*134.117*/("""
                                """),_display_(/*135.34*/b3/*135.36*/.email( internForm("email"), '_label -> "Email",'placeholder -> "Enter Email" )),format.raw/*135.115*/("""
                                """),_display_(/*136.34*/b3/*136.36*/.number( internForm("mobile"), '_label -> "Mobile",'placeholder -> "Enter Mobile" )),format.raw/*136.119*/("""
                                """),_display_(/*137.34*/b3/*137.36*/.text( internForm("award"), '_label -> "Award",'placeholder -> "Enter Award" )),format.raw/*137.114*/("""



                                """),format.raw/*141.33*/("""<button type="submit" id="internadd" class="btn btn-default">Add</button>

                                """)))}),format.raw/*143.34*/("""

                            """),format.raw/*145.29*/("""</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>

                </div>
            </div>





            </p>
        </div>
    </div>

</div>





<script>
    $(document).ready(function()"""),format.raw/*170.33*/("""{"""),format.raw/*170.34*/("""
    """),format.raw/*171.5*/("""$('#awards').click(function()"""),format.raw/*171.34*/("""{"""),format.raw/*171.35*/("""

    """),format.raw/*173.5*/("""$.get("/users/getawards",function(data,status)"""),format.raw/*173.51*/("""{"""),format.raw/*173.52*/("""
    """),format.raw/*174.5*/("""$('#menu1').html(data);
    """),format.raw/*175.5*/("""}"""),format.raw/*175.6*/(""");
    """),format.raw/*176.5*/("""}"""),format.raw/*176.6*/(""");

    """),format.raw/*178.5*/("""}"""),format.raw/*178.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*182.33*/("""{"""),format.raw/*182.34*/("""
    """),format.raw/*183.5*/("""$('#language').click(function()"""),format.raw/*183.36*/("""{"""),format.raw/*183.37*/("""

    """),format.raw/*185.5*/("""$.get("/users/getlanguage",function(data,status)"""),format.raw/*185.53*/("""{"""),format.raw/*185.54*/("""
    """),format.raw/*186.5*/("""$('#menu2').html(data);
    """),format.raw/*187.5*/("""}"""),format.raw/*187.6*/(""");
    """),format.raw/*188.5*/("""}"""),format.raw/*188.6*/(""");

    """),format.raw/*190.5*/("""}"""),format.raw/*190.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*194.33*/("""{"""),format.raw/*194.34*/("""
    """),format.raw/*195.5*/("""$('#assignment').click(function()"""),format.raw/*195.38*/("""{"""),format.raw/*195.39*/("""

    """),format.raw/*197.5*/("""$.get("/users/getassignment",function(data,status)"""),format.raw/*197.55*/("""{"""),format.raw/*197.56*/("""
    """),format.raw/*198.5*/("""$('#assignmentRecord').html(data);
    """),format.raw/*199.5*/("""}"""),format.raw/*199.6*/(""");
    """),format.raw/*200.5*/("""}"""),format.raw/*200.6*/(""");

    """),format.raw/*202.5*/("""}"""),format.raw/*202.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*206.33*/("""{"""),format.raw/*206.34*/("""
    """),format.raw/*207.5*/("""$('#programming').click(function()"""),format.raw/*207.39*/("""{"""),format.raw/*207.40*/("""

    """),format.raw/*209.5*/("""$.get("/users/getprogramming",function(data,status)"""),format.raw/*209.56*/("""{"""),format.raw/*209.57*/("""
    """),format.raw/*210.5*/("""$('#menu4').html(data);
    """),format.raw/*211.5*/("""}"""),format.raw/*211.6*/(""");
    """),format.raw/*212.5*/("""}"""),format.raw/*212.6*/(""");

    """),format.raw/*214.5*/("""}"""),format.raw/*214.6*/(""");
</script>

<script>
    $(document).ready(function()"""),format.raw/*218.33*/("""{"""),format.raw/*218.34*/("""
    """),format.raw/*219.5*/("""$('#intern').click(function()"""),format.raw/*219.34*/("""{"""),format.raw/*219.35*/("""

    """),format.raw/*221.5*/("""$.get("/users/getintern",function(data,status)"""),format.raw/*221.51*/("""{"""),format.raw/*221.52*/("""
    """),format.raw/*222.5*/("""$('#internRecord').html(data);
    """),format.raw/*223.5*/("""}"""),format.raw/*223.6*/(""");
    """),format.raw/*224.5*/("""}"""),format.raw/*224.6*/(""");

    """),format.raw/*226.5*/("""}"""),format.raw/*226.6*/(""");
</script>

<script>
$(document).ready(function()"""),format.raw/*230.29*/("""{"""),format.raw/*230.30*/("""

"""),format.raw/*232.1*/("""$('#myForm').submit(function(e)"""),format.raw/*232.32*/("""{"""),format.raw/*232.33*/("""
"""),format.raw/*233.1*/("""e.preventDefault();
$form=$(this);
$.post('"""),_display_(/*235.10*/routes/*235.16*/.UsersController.addInterns),format.raw/*235.43*/("""',$(this).serialize(),function(data)"""),format.raw/*235.79*/("""{"""),format.raw/*235.80*/("""

"""),format.raw/*237.1*/("""$('#successIntern').fadeIn(3000);
$('#myForm')[0].reset();
"""),format.raw/*239.1*/("""}"""),format.raw/*239.2*/(""");


"""),format.raw/*242.1*/("""}"""),format.raw/*242.2*/(""");
"""),format.raw/*243.1*/("""}"""),format.raw/*243.2*/(""");
</script>

<script>


$(document).ready(function()"""),format.raw/*249.29*/("""{"""),format.raw/*249.30*/("""

"""),format.raw/*251.1*/("""$('#myAssignmentForm').submit(function(e)"""),format.raw/*251.42*/("""{"""),format.raw/*251.43*/("""
"""),format.raw/*252.1*/("""e.preventDefault();
$form=$(this);
$.post('"""),_display_(/*254.10*/routes/*254.16*/.UsersController.addAssignments),format.raw/*254.47*/("""',$(this).serialize(),function(data)"""),format.raw/*254.83*/("""{"""),format.raw/*254.84*/("""

"""),format.raw/*256.1*/("""$('#successAssign').fadeIn(3000);
$('#myAssignmentForm')[0].reset();
"""),format.raw/*258.1*/("""}"""),format.raw/*258.2*/(""");


"""),format.raw/*261.1*/("""}"""),format.raw/*261.2*/(""");
"""),format.raw/*262.1*/("""}"""),format.raw/*262.2*/(""");
</script>




""")))}))
      }
    }
  }

  def render(internForm:Form[repository.Interns],assignmentForm:Form[repository.Assignment],flash:Flash,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(internForm,assignmentForm)(flash,messages)

  def f:((Form[repository.Interns],Form[repository.Assignment]) => (Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (internForm,assignmentForm) => (flash,messages) => apply(internForm,assignmentForm)(flash,messages)

  def ref: this.type = this

}


}

/**/
object adminhomepage extends adminhomepage_Scope0.adminhomepage
              /*
                  -- GENERATED --
                  DATE: Thu Mar 17 11:43:59 IST 2016
                  SOURCE: /home/knodus/sangeeta/Git/TraineeAppRepo/app/views/adminhomepage.scala.html
                  HASH: 827d1eb234c8b3de4fc982ce707815e38a745341
                  MATRIX: 604->1|855->121|882->160|911->181|949->182|977->184|1138->318|1153->324|1197->347|3659->2782|3670->2784|3758->2863|3799->2865|3844->2883|3855->2885|3947->2956|3992->2974|4003->2976|4124->3075|4169->3093|4180->3095|4303->3196|4348->3214|4359->3216|4459->3295|4504->3313|4515->3315|4621->3399|4666->3417|4677->3419|4787->3507|4832->3524|4958->3619|4999->3632|6714->5319|6726->5321|6802->5386|6844->5388|6907->5423|6919->5425|7023->5506|7085->5540|7097->5542|7199->5621|7261->5655|7273->5657|7379->5740|7441->5774|7453->5776|7554->5854|7619->5890|7759->5998|7818->6028|8247->6428|8277->6429|8310->6434|8368->6463|8398->6464|8432->6470|8507->6516|8537->6517|8570->6522|8626->6550|8655->6551|8690->6558|8719->6559|8755->6567|8784->6568|8868->6623|8898->6624|8931->6629|8991->6660|9021->6661|9055->6667|9132->6715|9162->6716|9195->6721|9251->6749|9280->6750|9315->6757|9344->6758|9380->6766|9409->6767|9493->6822|9523->6823|9556->6828|9618->6861|9648->6862|9682->6868|9761->6918|9791->6919|9824->6924|9891->6963|9920->6964|9955->6971|9984->6972|10020->6980|10049->6981|10133->7036|10163->7037|10196->7042|10259->7076|10289->7077|10323->7083|10403->7134|10433->7135|10466->7140|10522->7168|10551->7169|10586->7176|10615->7177|10651->7185|10680->7186|10764->7241|10794->7242|10827->7247|10885->7276|10915->7277|10949->7283|11024->7329|11054->7330|11087->7335|11150->7370|11179->7371|11214->7378|11243->7379|11279->7387|11308->7388|11388->7439|11418->7440|11448->7442|11508->7473|11538->7474|11567->7475|11639->7519|11655->7525|11704->7552|11769->7588|11799->7589|11829->7591|11916->7650|11945->7651|11978->7656|12007->7657|12038->7660|12067->7661|12149->7714|12179->7715|12209->7717|12279->7758|12309->7759|12338->7760|12410->7804|12426->7810|12479->7841|12544->7877|12574->7878|12604->7880|12701->7949|12730->7950|12763->7955|12792->7956|12823->7959|12852->7960
                  LINES: 20->1|25->1|26->3|26->3|26->3|28->5|34->11|34->11|34->11|97->74|97->74|97->74|97->74|98->75|98->75|98->75|99->76|99->76|99->76|100->77|100->77|100->77|101->78|101->78|101->78|102->79|102->79|102->79|103->80|103->80|103->80|104->81|105->82|106->83|155->132|155->132|155->132|155->132|157->134|157->134|157->134|158->135|158->135|158->135|159->136|159->136|159->136|160->137|160->137|160->137|164->141|166->143|168->145|193->170|193->170|194->171|194->171|194->171|196->173|196->173|196->173|197->174|198->175|198->175|199->176|199->176|201->178|201->178|205->182|205->182|206->183|206->183|206->183|208->185|208->185|208->185|209->186|210->187|210->187|211->188|211->188|213->190|213->190|217->194|217->194|218->195|218->195|218->195|220->197|220->197|220->197|221->198|222->199|222->199|223->200|223->200|225->202|225->202|229->206|229->206|230->207|230->207|230->207|232->209|232->209|232->209|233->210|234->211|234->211|235->212|235->212|237->214|237->214|241->218|241->218|242->219|242->219|242->219|244->221|244->221|244->221|245->222|246->223|246->223|247->224|247->224|249->226|249->226|253->230|253->230|255->232|255->232|255->232|256->233|258->235|258->235|258->235|258->235|258->235|260->237|262->239|262->239|265->242|265->242|266->243|266->243|272->249|272->249|274->251|274->251|274->251|275->252|277->254|277->254|277->254|277->254|277->254|279->256|281->258|281->258|284->261|284->261|285->262|285->262
                  -- GENERATED --
              */
          