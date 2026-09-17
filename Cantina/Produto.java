package Cantina;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        double total = preco * quantidade;
        if (total > 100) {
            total = total * 0.9;
        }
        return total;
    }
}
