package Boletim;

public class Aluno {
    String nome;
    int matricula;
    double nota1, nota2, nota3;

    public Aluno(
        String nome,
        int matricula, 
        double nota1,
        double nota2, 
        double nota3
    ) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public double calcularMedia() {
        double media = (nota1 + nota2 + nota3)/3;
        return media;
    }

    public void verificarAprovacao() {
        if (calcularMedia() >= 6) {
            System.out.println("Aprovado");
        } else if (calcularMedia() >= 4 && calcularMedia() <= 5.9) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    public void mostrarDados() {
        System.out.println("Nome do aluno(a): " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Terceira nota: " + nota3);
    }
}
