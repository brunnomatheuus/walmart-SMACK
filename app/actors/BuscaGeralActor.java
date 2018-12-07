package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import walmart.Produto;
import walmart.Produtos;

public class BuscaGeralActor extends AbstractActor {

    public static Props getProps() {
        return Props.create(BuscaGeralActor.class);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(Produtos.class, array -> {
                    Produto produto1 = new Produto(1, "produto1", 10.5);
                    array.array.add(produto1);
                    sender().tell(array.array, self());
                })
                .build();
    }
}
