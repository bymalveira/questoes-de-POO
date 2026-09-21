package SistemaEscolarCompleto;

public class Professor {
    String nome, especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void mostrarDados() {
        System.out.println("Professor: " + nome);
        System.out.println("Especialidade: " + especialidade);
    }
}
