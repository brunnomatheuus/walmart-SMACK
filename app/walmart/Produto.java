package walmart;

public class Produto {
    private static int id;
    private static String nome;
    private static double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public static int getId() {
        return id;
    }

    public static String getNome() {
        return nome;
    }

    public static double getPreco() {
        return preco;
    }

    public static void setId(int id) {
        Produto.id = id;
    }

    public static void setNome(String nome) {
        Produto.nome = nome;
    }

    public static void setPreco(double preco) {
        Produto.preco = preco;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.id + " - Nome: " + this.nome + " - Preço: " + this.preco;
    }
}
