package Lanchonete;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Livia Valeria", "Açai", 2, 30);

        System.out.println("Total: " + pedido1.calcularTotal());
    }
}
