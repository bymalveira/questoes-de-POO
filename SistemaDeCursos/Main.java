package SistemaDeCursos;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Desenvolvimento de Sistemas", 100);
        Aluno aluno1 = new Aluno("Marcus", 2212, curso1);

        aluno1.mostrarDados();
    }
}
