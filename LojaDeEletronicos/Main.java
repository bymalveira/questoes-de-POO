package LojaDeEletronicos;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(12367, "Mouse", 20, 2);
        System.out.println("O valor do produto " + produto1.nome + " em estoque é: " + produto1.calcularValorEstoque());
    }
}
