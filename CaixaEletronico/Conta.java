package CaixaEletronico;

public class Conta {
    String titular;
    double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido! O valor do deposito tem que ser maior que 0.");
            return;
        }

        saldo += valor;
        System.out.println("Deposito de " + valor + " realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido! O valor do saque tem que ser maior que 0.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return;
        }

        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso!");
    }

}