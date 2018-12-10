package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import com.datastax.spark.connector.japi.CassandraJavaUtil;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import walmart.Produto;
import walmart.Produtos;

import java.util.ArrayList;

import static com.datastax.spark.connector.japi.CassandraJavaUtil.mapRowTo;

public class BuscaFiltradoActor extends AbstractActor {

    private SparkConf conf;
    private JavaSparkContext sc;

    public static Props getProps() {
        return Props.create(BuscaFiltradoActor.class);
    }

    @Override
    public void preStart() {
        conf = new SparkConf(true)
                .setAppName("Projeto Concorrente")
                .set("spark.driver.allowMultipleContexts", "true")
                .setMaster("local");

        sc = new JavaSparkContext(conf);
    }

    @Override
    public void postStop() {
        sc.close();
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(Produtos.class, array -> {
                    ArrayList<Produto> produtos = new ArrayList<>();


                    JavaRDD<Produto> produtoRdd = CassandraJavaUtil.javaFunctions(sc)
                            .cassandraTable("projetoconcorrente", "produtos", mapRowTo(Produto.class))
                            .select("id", "nome", "preco", "quantidade")
                            .where("preco>=? AND preco<=?", array.getMin(), array.getMax());



                    for (Produto produto : produtoRdd.collect()){
                        produtos.add(produto);
                    }


                    /*for(int i = 0; i < produtos.size(); i++){
                        if(produtos.get(i).getPreco() < array.min || produtos.get(i).getPreco() > array.max){
                            System.out.println(array.min + ", " + array.max);
                            produtos.remove(produtos.get(i));

                        }
                    }*/

                    sender().tell(produtos, self());
                })
                .build();
    }
}