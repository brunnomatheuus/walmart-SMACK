// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bruno/Downloads/Disciplinas/Concorrente/projetounidade3/conf/routes
// @DATE:Tue Dec 04 16:18:57 BRT 2018


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
