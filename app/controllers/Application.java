package controllers;

import akka.actor.*;
import play.mvc.*;
import scala.compat.java8.FutureConverters;
import javax.inject.*;
import java.util.concurrent.CompletionStage;
import views.html.*;

import static akka.pattern.Patterns.ask;

@Singleton
public class Application extends Controller {

    final ActorRef helloActor;

    @Inject 
    public Application(ActorSystem system) {
        helloActor = system.actorOf(HelloActor.getProps());
    }

    public CompletionStage<Result> sayHello(String name) {
        return FutureConverters.toJava(ask(helloActor, new SayHello(name), 1000))
                .thenApply(response -> ok(hello.render( (String) response )));
    }
}