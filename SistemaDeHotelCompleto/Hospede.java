package SistemaDeHotelCompleto;

public class Hospede {
    String nome;
    Quarto quarto;
    double horasHospedado;
    boolean hospedado;

    public Hospede(String nome, Quarto quarto, double horasHospedado) {
        this.nome = nome;
        this.horasHospedado = horasHospedado;
        this.hospedado = false;

        if (quarto == null) {
            this.quarto = null;
            return;
        }

        if (!quarto.disponivel) {
            System.out.println("O quarto de número " + quarto.numero + " já está ocupado.");
            return;
        }

        if (!quarto.limpo) {
            System.out.println("O quarto de número " + quarto.numero + " está sujo. Limpe antes de hospedar.");
            return;
        }

        this.quarto = quarto;
        this.hospedado = true;
        quarto.disponivel = false;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        if (quarto == null) {
            this.quarto = null;
            this.hospedado = false;
            return;
        }

        if (!quarto.disponivel) {
            System.out.println("O quarto de número " + quarto.numero + " já está ocupado.");
            return;
        }

        if (!quarto.limpo) {
            System.out.println("O quarto de número " + quarto.numero + " está sujo. Limpe antes de hospedar.");
            return;
        }

        this.quarto = quarto;
        this.hospedado = true;
        quarto.disponivel = false;
    }

    public void sair(Quarto quarto) {
        if (!hospedado || this.quarto == null) {
            System.out.println("O hóspede " + this.nome + " já saiu.");
            return;
        }

        double total = calcularTotal();
        System.out.println("O hóspede " + this.nome + " saiu do quarto " + this.quarto.numero + ".");
        System.out.println("Total a pagar: R$ " + total);
        this.hospedado = false;
        this.quarto.disponivel = true;
        this.quarto.limpo = false;
        this.quarto = null;
    }

    public double calcularTotal() {
        if (quarto == null) {
            return 0;
        }

        return horasHospedado * quarto.valorPorHora;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Tempo de hospedagem: " + horasHospedado + " horas");

        if (quarto != null) {
            System.out.println("Quarto: " + quarto.numero + " - " + quarto.nome);
            System.out.println("Status: " + (hospedado ? "Hospedado" : "Não hospedado"));
            System.out.println("Total a pagar: R$ " + calcularTotal());
        } else {
            System.out.println("Quarto: não vinculado");
            System.out.println("Total a pagar: R$ 0.0");
        }
    }
}
