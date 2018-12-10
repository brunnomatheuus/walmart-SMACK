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


public class BuscaGeralActor extends AbstractActor {

    private SparkConf conf;
    private JavaSparkContext sc;

    public static Props getProps() {
        return Props.create(BuscaGeralActor.class);
    }

    public BuscaGeralActor(){ }

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



                    JavaRDD<Produto> produtoRdd = CassandraJavaUtil.javaFunctions(sc)
                        .cassandraTable("projetoconcorrente", "produtos", mapRowTo(Produto.class))
                        .select("id", "nome", "preco", "quantidade");

                    ArrayList<Produto> produtos = new ArrayList<>();

                    for (Produto produto : produtoRdd.collect()){
                        produtos.add(produto);
                    }


                    sender().tell(produtos, getSelf());
                })
                .build();
    }
}
