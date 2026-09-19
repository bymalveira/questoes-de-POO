package BibliotecaEscolar;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Quarto de Despejo", "Carolina Maria de Jesus", 1783, true);

        livro1.emprestar();
        livro1.mostrarDados();
    }
}
