package CadastroDeFuncionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Adriano Gomes", "Desenvolvedor", 10000);

        funcionario1.calcularAumento(100);
        funcionario1.calcularSalarioAnual();
        funcionario1.mostrarDados();
    }
}
