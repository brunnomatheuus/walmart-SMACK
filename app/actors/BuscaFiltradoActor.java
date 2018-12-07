package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import walmart.Produto;
import walmart.Produtos;

import java.util.ArrayList;

public class BuscaFiltradoActor extends AbstractActor {

    public static Props getProps() {
        return Props.create(BuscaFiltradoActor.class);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(Produtos.class, array -> {
                    ArrayList<Produto> produtos = array.array;

                    Produto produto = new Produto(1, "produto1", 10);
                    produtos.add(produto);


                    for(int i = 0; i < produtos.size(); i++){
                        if(produtos.get(i).getPreco() < array.min || produtos.get(i).getPreco() > array.max){
                            System.out.println(array.min + ", " + array.max);
                            produtos.remove(produtos.get(i));

                        }
                    }

                    sender().tell(produtos, self());
                })
                .build();
    }
}