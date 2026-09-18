package SistemasDeNotas;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Caique Breno", 20261);
        Aluno aluno2 = new Aluno("Marcus Emanuel", 20262);
        Aluno aluno3 = new Aluno("Ryan Soares", 20263);
        Aluno aluno4 = new Aluno("Guilherme Savio", 20264);
        Aluno aluno5 = new Aluno("Ruan Kelvin", 20265);


       System.out.println("Aluno: " + aluno1.nome + " --- Média: " + aluno1.calcularMedia(6, 6, 6, 6));
       System.out.println("Aluno: " + aluno2.nome + " --- Média: " + aluno2.calcularMedia(7, 4, 8, 9));
       System.out.println("Aluno: " + aluno3.nome + " --- Média: " + aluno3.calcularMedia(9, 1, 10, 8));
       System.out.println("Aluno: " + aluno4.nome + " --- Média: " + aluno4.calcularMedia(1, 3, 7, 10));
       System.out.println("Aluno: " + aluno5.nome + " --- Média: " + aluno5.calcularMedia(2, 4, 10, 10));
    }
}
