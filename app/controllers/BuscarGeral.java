package controllers;

import actors.BuscaGeralActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import play.mvc.Controller;
import play.mvc.Result;
import scala.compat.java8.FutureConverters;
import views.html.listaProdutos;
import walmart.Produto;
import walmart.Produtos;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.concurrent.CompletionStage;

import static akka.pattern.Patterns.ask;

@Singleton
public class BuscarGeral extends Controller {

    final ActorRef buscaGeralActor;

    @Inject
    public BuscarGeral(ActorSystem system) {
        buscaGeralActor = system.actorOf(BuscaGeralActor.getProps());
    }

    public CompletionStage<Result> BuscaGeral() {
        return FutureConverters.toJava(ask(buscaGeralActor, new Produtos(), 1000))
                .thenApply(response -> ok(listaProdutos.render( (ArrayList<Produto>) response )));
    }
}
