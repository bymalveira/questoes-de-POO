package SistemaDePedidos;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 2500.0);
        Pedido pedido1 = new Pedido(101, "Maria", produto1, 2);

        System.out.println("Subtotal: " + pedido1.calcularSubtotal());
        System.out.println("Desconto: " + pedido1.calcularDesconto());
        System.out.println("Total: " + pedido1.calcularTotal());
    }
}
