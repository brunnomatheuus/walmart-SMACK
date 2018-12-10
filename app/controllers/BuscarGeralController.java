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
public class BuscarGeralController extends Controller {

    static private ActorSystem system;

    @Inject
    public BuscarGeralController(ActorSystem system) {
        this.system = system;
    }

    public CompletionStage<Result> BuscaGeral() {

        ActorRef buscaGeralActor = system.actorOf(BuscaGeralActor.getProps());
        return FutureConverters.toJava(ask(buscaGeralActor, new Produtos(), 1000))
                .thenApply(response -> ok(listaProdutos.render( (ArrayList<Produto>) response )));
    }
}
