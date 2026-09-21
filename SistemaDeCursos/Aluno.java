package SistemaDeCursos;

public class Aluno {
    String nome;
    int matricula;
    Curso curso;

    public Aluno(String nome, int matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void mostrarDados() {
        System.out.println("--- Dados do aluno e curso ---");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso.nome);
        System.out.println("Cargo horária: " + curso.cargaHoraria);
    }
}
