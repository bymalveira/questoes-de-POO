package AppDeTransporte;

public class Main {
    public static void main(String[] args) {
        Corrida corrida1 = new Corrida("Baggio", 5);
        System.out.println("Valor da corrida: R$ " + corrida1.calcularValor());
    }
}
