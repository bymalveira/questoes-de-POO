package SistemaEscolarCompleto;

public class Curso {
    String nome;
    double cargaHoraria;

    public Curso(String nome, double cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void mostrarDados() {
        System.out.println("Curso: " + nome);
        System.out.println("Cargo horária: " + cargaHoraria + "h");
    }
}
