package CadastroDeFuncionario;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public double calcularAumento(double porcentagem) {
        salario = salario + (salario*porcentagem/100);
        return salario;
    }
    
    public double calcularSalarioAnual() {
        return salario * 12;
    }
    
    public void mostrarDados() {
        System.out.println("\n --- Dados do funcionario ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Salario anual: " + calcularSalarioAnual());
    }
}
