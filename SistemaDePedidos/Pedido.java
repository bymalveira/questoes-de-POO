package SistemaDePedidos;

public class Pedido {
    int numero;
    int quantidade;
    String cliente;
    Produto produto;

    public Pedido(int numero, String cliente, Produto produto, int quantidade) {
        this.numero = numero;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return produto.preco * quantidade;
    }

    public double calcularDesconto() {
        double desconto = 1;
        if (calcularSubtotal() < 100) {
            desconto = 1.0;
        } else if (calcularSubtotal() >= 100 && calcularSubtotal() <= 199.99) {
            desconto = 0.95;
        } else if (calcularSubtotal() >= 200) {
            desconto = 0.90;
        }

        return desconto;
    }

    public double calcularTotal() {
        return calcularSubtotal() * calcularDesconto();
    }
}
