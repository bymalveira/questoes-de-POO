package SistemaDeEstacionamentoCompleto;

public class Veiculo {
    String placa;
    String modelo;
    String horaEntrada;
    String horaSaida;
    double horasEstacionadas;

    public Veiculo(String placa, String modelo, String horaEntrada) {
        this.placa = placa;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
        this.horaSaida = "";
        this.horasEstacionadas = 0;
    }

    public void registrarSaida(String horaSaida) {
        this.horaSaida = horaSaida;

        String[] entrada = horaEntrada.split(":");
        String[] saida = horaSaida.split(":");

        int minutosEntrada = Integer.parseInt(entrada[0]) * 60 + Integer.parseInt(entrada[1]);
        int minutosSaida = Integer.parseInt(saida[0]) * 60 + Integer.parseInt(saida[1]);

        int diferenca = minutosSaida - minutosEntrada;
        if (diferenca < 0) {
            diferenca += 24 * 60;
        }

        horasEstacionadas = diferenca / 60.0;
    }

    public double calcularValor() {
        if (horaSaida.equals("")) {
            return 0;
        }

        if (horasEstacionadas <= 2) {
            return 10.0;
        } else {
            return 10 + (horasEstacionadas - 2) * 5;
        }
    }

    public void mostrarDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Hora de entrada: " + horaEntrada);
        System.out.println("Hora de saída: " + horaSaida);
        System.out.println("Horas estacionadas: " + horasEstacionadas);
        System.out.println("Valor a pagar: R$ " + calcularValor());
    }
}
