// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brunnom/Downloads/walmart-smack/conf/routes
// @DATE:Mon Dec 10 16:33:15 BRT 2018


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
