package Estacionamento;

public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("67EO-EE01", "Civic", 7);
        System.out.println("O valor total a pagar é: " + carro1.calcularValor());
    }
}
