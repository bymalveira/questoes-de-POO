package SistemaEscolarCompleto;

public class Disciplina {
    String nome;
    double cargaHoraria;

    public Disciplina(String nome, double cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void mostrarDados() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Carga horária: " + cargaHoraria + "h");
    }
}
