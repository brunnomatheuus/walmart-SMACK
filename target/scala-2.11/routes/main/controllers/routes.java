// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brunnom/Downloads/walmart-smack/conf/routes
// @DATE:Mon Dec 10 16:33:15 BRT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBuscaFiltradoController BuscaFiltradoController = new controllers.ReverseBuscaFiltradoController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCompraController CompraController = new controllers.ReverseCompraController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBuscarGeralController BuscarGeralController = new controllers.ReverseBuscarGeralController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBuscaFiltradoController BuscaFiltradoController = new controllers.javascript.ReverseBuscaFiltradoController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCompraController CompraController = new controllers.javascript.ReverseCompraController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBuscarGeralController BuscarGeralController = new controllers.javascript.ReverseBuscarGeralController(RoutesPrefix.byNamePrefix());
  }

}
