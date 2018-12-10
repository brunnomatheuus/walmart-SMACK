package walmart;

import java.io.Serializable;

public class Produto implements Serializable {
    private int id;
    private String nome;
    private double preco;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    private int quantidade;

    public Produto(){

    }

    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.id + " - Nome: " + this.nome + " - Preço: " + this.preco + " - Quantidade: " + this.quantidade;
    }
}
