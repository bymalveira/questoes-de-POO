package SistemaDeEstacionamentoCompleto;

public class Estacionamento {
    Veiculo veiculo;

    public void registrarEntrada(String placa, String modelo, String horaEntrada) {
        veiculo = new Veiculo(placa, modelo, horaEntrada);
        System.out.println("Entrada registrada com sucesso!");
    }

    public void registrarSaida(String horaSaida) {
        if (veiculo == null) {
            System.out.println("Nenhum veículo registrado.");
            return;
        }

        veiculo.registrarSaida(horaSaida);
        System.out.println("Saída registrada com sucesso!");
    }

    public void consultarVeiculo() {
        if (veiculo == null) {
            System.out.println("Nenhum veículo no estacionamento.");
            return;
        }

        veiculo.mostrarDados();
    }

    public double calcularValor() {
        if (veiculo == null) {
            return 0;
        }

        return veiculo.calcularValor();
    }
}
