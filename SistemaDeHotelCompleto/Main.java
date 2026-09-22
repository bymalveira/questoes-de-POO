package SistemaDeHotelCompleto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Quarto quarto = null;
        Hospede hospede = null;
        Faxineiro faxineiro = null;

        int opcao;

        do {
            System.out.println("\n--- Sistema de Hotel ---");
            System.out.println("1 - Cadastrar quarto");
            System.out.println("2 - Cadastrar hóspede");
            System.out.println("3 - Cadastrar faxineiro");
            System.out.println("4 - Mostrar quarto");
            System.out.println("5 - Mostrar hóspede");
            System.out.println("6 - Mostrar faxineiro");
            System.out.println("7 - Vincular hóspede ao quarto");
            System.out.println("8 - Limpar quarto");
            System.out.println("9 - Liberar quarto");
            System.out.println("10 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    quarto = cadastrarQuarto(scanner);
                    break;

                case 2:
                    hospede = cadastrarHospede(scanner, quarto);
                    break;

                case 3:
                    faxineiro = cadastrarFaxineiro(scanner);
                    break;

                case 4:
                    mostrarQuarto(quarto);
                    break;

                case 5:
                    mostrarHospede(hospede);
                    break;

                case 6:
                    mostrarFaxineiro(faxineiro);
                    break;

                case 7:
                    vincularQuartoHospede(hospede, quarto, scanner);
                    break;

                case 8:
                    limparQuarto(faxineiro, quarto);
                    break;

                case 9:
                    liberarQuarto(hospede, quarto);
                    break;

                case 10:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 10);

        scanner.close();
    }

    public static Quarto cadastrarQuarto(Scanner scanner) {
        System.out.print("Nome do quarto: ");
        String nome = scanner.nextLine();

        System.out.print("Número do quarto: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Valor por hora: R$ ");
        double valorPorHora = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Quarto cadastrado com sucesso!");
        return new Quarto(nome, numero, valorPorHora);
    }

    public static Hospede cadastrarHospede(Scanner scanner, Quarto quarto) {
        System.out.print("Nome do hóspede: ");
        String nome = scanner.nextLine();

        System.out.print("Horas de hospedagem: ");
        double horasHospedado = scanner.nextDouble();
        scanner.nextLine();

        if (quarto == null) {
            System.out.println("Nenhum quarto cadastrado ainda. Hóspede será registrado sem quarto vinculado.");
            return new Hospede(nome, null, horasHospedado);
        }

        Hospede hospede = new Hospede(nome, quarto, horasHospedado);
        System.out.println("Hóspede cadastrado com sucesso!");
        return hospede;
    }

    public static Faxineiro cadastrarFaxineiro(Scanner scanner) {
        System.out.print("Nome do faxineiro: ");
        String nome = scanner.nextLine();

        System.out.print("Número do funcionário: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Faxineiro cadastrado com sucesso!");
        return new Faxineiro(nome, numero);
    }

    public static void vincularQuartoHospede(Hospede hospede, Quarto quarto, Scanner scanner) {
        if (hospede == null) {
            System.out.println("Nenhum hóspede cadastrado.");
            return;
        }

        if (quarto == null) {
            System.out.println("Nenhum quarto cadastrado.");
            return;
        }

        hospede.setQuarto(quarto);
        System.out.println("Quarto vinculado ao hóspede com sucesso!");
    }

    public static void limparQuarto(Faxineiro faxineiro, Quarto quarto) {
        if (faxineiro == null) {
            System.out.println("Nenhum faxineiro cadastrado.");
            return;
        }

        if (quarto == null) {
            System.out.println("Nenhum quarto cadastrado.");
            return;
        }

        faxineiro.limparQuarto(quarto);
    }

    public static void liberarQuarto(Hospede hospede, Quarto quarto) {
        if (hospede == null) {
            System.out.println("Nenhum hóspede cadastrado.");
            return;
        }

        if (quarto == null) {
            System.out.println("Nenhum quarto cadastrado.");
            return;
        }

        hospede.sair(quarto);
    }

    public static void mostrarQuarto(Quarto quarto) {
        if (quarto == null) {
            System.out.println("Nenhum quarto cadastrado.");
            return;
        }

        quarto.mostrarDados();
    }

    public static void mostrarHospede(Hospede hospede) {
        if (hospede == null) {
            System.out.println("Nenhum hóspede cadastrado.");
            return;
        }

        hospede.mostrarDados();
    }

    public static void mostrarFaxineiro(Faxineiro faxineiro) {
        if (faxineiro == null) {
            System.out.println("Nenhum faxineiro cadastrado.");
            return;
        }

        faxineiro.mostrarDados();
    }
}
