package Cantina;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 5, 20);

        System.out.println(produto1.calcularTotal());
    }
}
