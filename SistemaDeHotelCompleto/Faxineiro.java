package SistemaDeHotelCompleto;

public class Faxineiro {
    String nome;
    int numero;

    public Faxineiro(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void limparQuarto(Quarto quarto) {
        if (quarto == null) {
            System.out.println("Nenhum quarto informado.");
            return;
        }

        if (quarto.limpo) {
            System.out.println("O quarto " + quarto.numero + " já estava limpo antes.");
            return;
        }

        quarto.limpo = true;
        System.out.println("O quarto " + quarto.numero + " foi limpo com sucesso pelo(a) faxineiro(a) " + this.nome);
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Número: " + numero);
    }
}
