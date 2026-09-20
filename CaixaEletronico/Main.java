package CaixaEletronico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Malveira", 200);
        Scanner input = new Scanner(System.in);
        int opcao;
        double valor;

        do {
            System.out.println("\n --- Sistema de Caixa Eletrônico ---");
            System.out.println("Olá, " + conta1.titular + "!");
            System.out.println("1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Consultar Saldo");
            System.out.println("4-Sair");
            System.out.print("Digite a sua opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n -- Depositar --");
                    do {
                        System.out.print("Digite o valor para o deposito: ");
                        valor = input.nextDouble();

                        if (valor <= 0) {
                            System.out.println("Valor invalido! O valor do deposito tem que ser maior que 0.");
                        }
                    } while (valor <= 0);

                    conta1.depositar(valor);
                    break;

                case 2:
                    System.out.println("\n -- Sacar --");
                    do {
                        System.out.print("Digite o valor para o saque: ");
                        valor = input.nextDouble();

                        if (valor <= 0) {
                            System.out.println("Valor invalido! O valor do saque tem que ser maior que 0.");
                        }
                    } while (valor <= 0);

                    conta1.sacar(valor);
                    break;

                case 3:
                    System.out.println("\n -- Consultar Saldo --");
                    System.out.println("Saldo atual: R$ " + conta1.consultarSaldo());
                    break;

                case 4:
                    System.out.println("Programa finalizado!!!");
                    break;

                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }
        } while (opcao != 4);
        
        input.close();
    }
}
