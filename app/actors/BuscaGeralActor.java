package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import walmart.Produto;
import walmart.Produtos;

import static com.datastax.spark.connector.japi.CassandraJavaUtil.mapColumnTo;
import static com.datastax.spark.connector.japi.CassandraJavaUtil.javaFunctions;



public class BuscaGeralActor extends AbstractActor {

    public static Props getProps() {
        return Props.create(BuscaGeralActor.class);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(Produtos.class, array -> {


                    SparkConf conf = new SparkConf()
                            .setAppName("Projeto Concorrente")
                            .setMaster("local");

                    JavaSparkContext sc = new JavaSparkContext(conf);


                    JavaRDD<Produto> produtoRdd = javaFunctions(sc)
                            .cassandraTable("projetoconcorrente", "produtos", mapColumnTo(Produto.class))
                            .select("*");

                    for (Produto produto : produtoRdd.collect()){
                        System.out.println(produto);
                    }

                    Produto produto1 = new Produto(1, "produto1", 10.5);
                    array.array.add(produto1);

                    sender().tell(array.array, self());
                })
                .build();
    }
}
