package Lanchonete;

public class Pedido {
    String nomeDoCliente, produto;
    int quantidade;
    double preco;

    public Pedido(String nomeDoCliente, String produto, int quantidade, double preco) {
        this.nomeDoCliente = nomeDoCliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double calcularSubtotal() {
        double valor = preco * quantidade;
        return valor;
    }

    public double calcularDesconto() {
        double porcentagem = 1;
        double subTotal = calcularSubtotal();
        if (subTotal < 50) {
            porcentagem = 1;
        } else if (subTotal >= 50 && subTotal <= 99.99) {
            porcentagem = 0.95;
        } else {
            porcentagem = 0.90;
        }

        return porcentagem;
    }

    public double calcularTotal() {
        double total = calcularSubtotal() * calcularDesconto();
        return total;
    }
}
