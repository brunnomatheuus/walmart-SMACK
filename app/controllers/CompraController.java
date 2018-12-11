package controllers;

import actors.CompraActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import scala.compat.java8.FutureConverters;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.concurrent.CompletionStage;

import static akka.pattern.Patterns.ask;

@Singleton
public class CompraController extends Controller {

    static private ActorSystem system;

    @Inject
    public CompraController(ActorSystem system) {
        this.system = system;
    }

    public CompletionStage<Result> Compra() {

        String id = request().getQueryString("tipoProduto");
        String quantidade = request().getQueryString("quantidade");

        String msg = id + "-" + quantidade;

        ActorRef compraActor = system.actorOf(CompraActor.getProps());

        return FutureConverters.toJava(ask(compraActor, msg, 1000))
                .thenApply(response -> ok(index.render()));
    }
}