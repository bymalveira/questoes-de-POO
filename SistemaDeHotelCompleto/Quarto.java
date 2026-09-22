package SistemaDeHotelCompleto;

public class Quarto {
    String nome;
    int numero;
    boolean limpo;
    boolean disponivel;
    double valorPorHora;

    public Quarto(String nome, int numero, double valorPorHora) {
        this.nome = nome;
        this.numero = numero;
        this.limpo = true;
        this.disponivel = true;
        this.valorPorHora = valorPorHora;
    }

    public void mostrarDados() {
        System.out.println("Quarto: " + nome);
        System.out.println("Número: " + numero);
        System.out.println("Valor por hora: R$ " + valorPorHora);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println("Limpo: " + (limpo ? "Sim" : "Não"));
    }
}
