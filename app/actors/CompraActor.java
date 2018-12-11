package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import com.datastax.spark.connector.japi.CassandraJavaUtil;
import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import walmart.Produto;

import java.util.ArrayList;

import static com.datastax.spark.connector.japi.CassandraJavaUtil.mapRowTo;
import static com.datastax.spark.connector.japi.CassandraJavaUtil.mapToRow;

public class CompraActor extends AbstractActor {

    private SparkConf conf;
    private JavaSparkContext sc;

    public static Props getProps() {
        return Props.create(CompraActor.class);
    }

    @Override
    public void preStart() {
        conf = new SparkConf(true)
                .setAppName("Projeto Concorrente")
                .set("spark.driver.allowMultipleContexts", "true")
                .setMaster("local");

        sc = new JavaSparkContext(SparkContext.getOrCreate(this.conf));
    }

    @Override
    public void postStop() {
        sc.close();
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
            .match(String.class, msg -> {
                String[] msgs = msg.split("-");


                JavaRDD<Produto> produtoRdd = CassandraJavaUtil.javaFunctions(sc)
                        .cassandraTable("projetoconcorrente", "produtos", mapRowTo(Produto.class))
                        .select("id", "nome", "preco", "quantidade")
                        .where("id=?", msgs[0]);

                ArrayList<Produto> produtos = new ArrayList<>();
                for (Produto produto : produtoRdd.collect()){
                    produtos.add(produto);
                }

                produtos.get(0).setQuantidade(produtos.get(0).getQuantidade() - Integer.valueOf(msgs[1]));


                CassandraJavaUtil.javaFunctions(sc.parallelize(produtos))
                        .writerBuilder("projetoconcorrente", "produtos", mapToRow(Produto.class))
                        .saveToCassandra();

                sender().tell("", getSelf());
            })
            .build();
    }
}