package AppDeTransporte;

public class Corrida {
    String passageiro;
    double distancia;

    public Corrida(String passageiro, double distancia) {
        this.passageiro = passageiro;
        this.distancia = distancia;
    }

    public double calcularValor() {
        double valor = 5 + (distancia * 2.5);
        if (distancia > 20) {
            valor = valor * 0.9;
        }
        return valor;
    }
}
