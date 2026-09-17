package Boletim;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ryan Soares", 67, 10, 10, 1);

        System.out.println("Media: " + aluno1.calcularMedia());
        aluno1.verificarAprovacao();
        aluno1.mostrarDados();
    }
}
