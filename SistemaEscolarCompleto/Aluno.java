package SistemaEscolarCompleto;

public class Aluno {
    String nome;
    int matricula;
    Curso curso;

    public Aluno(String nome, int matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);

        if (curso != null) {
            System.out.println("Curso: " + curso.nome);
        } else {
            System.out.println("Curso: não vinculado");
        }
    }
}
