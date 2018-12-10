package controllers;

import actors.BuscaFiltradoActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import play.mvc.Controller;
import play.mvc.Result;
import scala.compat.java8.FutureConverters;
import views.html.listaProdutos;
import walmart.Produto;
import walmart.Produtos;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletionStage;

import static akka.pattern.Patterns.ask;

public class BuscaFiltradoController extends Controller {

    final ActorRef buscaFiltradoActor;

    @Inject
    public BuscaFiltradoController(ActorSystem system) {
        buscaFiltradoActor = system.actorOf(BuscaFiltradoActor.getProps());
    }

    public CompletionStage<Result> BuscaFiltrado() {
        Double min = Double.valueOf(request().getQueryString("min"));
        Double max = Double.valueOf(request().getQueryString("max"));



        return FutureConverters.toJava(ask(buscaFiltradoActor, new Produtos(min, max), 1000))
                    .thenApply(response -> ok(listaProdutos.render((ArrayList<Produto>) response)));

    }
}
