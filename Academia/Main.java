package Academia;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Emanuel", 17, 61, 1.75);

        aluno1.calcularIMC();
        System.out.println(aluno1.classificarIMC(aluno1.calcularIMC()));
    }
}
