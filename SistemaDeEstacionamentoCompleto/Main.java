package SistemaDeEstacionamentoCompleto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento();
        int opcao;

        do {
            System.out.println("\n--- Sistema de Estacionamento ---");
            System.out.println("1 - Registrar entrada");
            System.out.println("2 - Registrar saída");
            System.out.println("3 - Consultar veículo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Placa: ");
                String placa = scanner.nextLine();

                System.out.print("Modelo: ");
                String modelo = scanner.nextLine();

                System.out.print("Hora de entrada (HH:mm): ");
                String horaEntrada = scanner.nextLine();

                estacionamento.registrarEntrada(placa, modelo, horaEntrada);
            } else if (opcao == 2) {
                System.out.print("Hora de saída (HH:mm): ");
                String horaSaida = scanner.nextLine();
                estacionamento.registrarSaida(horaSaida);
                System.out.println("Valor total: R$ " + estacionamento.calcularValor());
            } else if (opcao == 3) {
                estacionamento.consultarVeiculo();
            } else if (opcao == 4) {
                System.out.println("Encerrando sistema...");
            } else {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
