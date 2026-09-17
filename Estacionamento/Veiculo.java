package Estacionamento;

public class Veiculo {
    String placa;
    String modelo;
    double horas;

    public Veiculo(String placa, String modelo, double horas) {
        this.placa = placa;
        this.modelo = modelo;
        this.horas = horas;
    }

    public double calcularValor() {
        double tarifa;
        if (horas > 8) {
            tarifa = 50;
        } else {
            tarifa = 10 + (horas - 1) * 5;
        }
        return tarifa;
    }
}
