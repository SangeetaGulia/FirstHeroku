
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knodus/sangeeta/Git/TraineeAppRepo/conf/routes
// @DATE:Thu Mar 17 11:43:58 IST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
