package ContaBancaria;

public class ContaBancaria {
    String titular;
    int numero;
    double saldo;

    public ContaBancaria(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }


    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valorDoDeposito) {
        if (valorDoDeposito <= 0) {
            System.out.println("Valor invalido! O valor do deposito tem que ser maior que 0.");
            return;
        }

        saldo += valorDoDeposito;
        System.out.println("Deposito de " + valorDoDeposito + " realizado com sucesso!");
    }

    public void sacar(double valorDoSaque) {
        if (valorDoSaque <= 0) {
            System.out.println("Valor invalido! O valor do saque tem que ser maior que 0.");
            return;
        }

        if (valorDoSaque > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return;
        }

        saldo -= valorDoSaque;
        System.out.println("Saque de " + valorDoSaque + " realizado com sucesso!");
    }
}
