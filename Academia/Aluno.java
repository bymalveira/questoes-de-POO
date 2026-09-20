package Academia;

public class Aluno {
    String nome;
    int idade;
    double peso;
    double altura;

    public Aluno(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        double IMC = peso / (altura * altura);
        return IMC;
    }

    public String classificarIMC(double IMC) {
        if (IMC < 18.5) {
            return "Abaixo do peso";
        }

        if (IMC >= 18.5 && IMC <= 24.9) {
            return "Peso normal";
        }

        if (IMC >= 25 && IMC <= 29.9) {
            return "Sobrepeso";
        }

        if (IMC >= 30) {
            return "Obesidade";
        } else {
            return "IMC Invalido";
        }
    }
}
