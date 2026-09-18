package LojaDeEletronicos;

public class Produto {
    int codigo;
    String nome;
    double preco;
    int estoque;

    public Produto(int codigo, String nome, double preco, int estoque) {
        if (estoque < 0 || preco < 0) {
            throw new Error("Valores de preço ou do estoque não podem ser negativos.");
        }
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int adicionarEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new Error("Quantidade invalida");
        }
        return estoque += quantidade;
    }

    public int vender(int quantidade) {
        if (quantidade < 0) {
            throw new Error("Quantidade invalida");
        }

        if (quantidade > estoque) {
            throw new Error("A quantidade é maior que o estoque, consulte o estoque para mais duvidas");
        }

        return estoque -= quantidade;
    }

    public int consultarEstoque() {
        return estoque;
    }

    public double calcularValorEstoque() {
        return preco*estoque;
    }
}
