package BibliotecaEscolar;

public class Livro {
    String titulo, autor;
    int codigo;
    boolean disponivel;

    public Livro(String titulo, String autor, int codigo, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponivel = disponivel;
    }

    public boolean emprestar() {
        if (!disponivel) {
            throw new Error("O livro não esta disponivel para emprestimo");
        }

        return disponivel = false;
    }

    public boolean devolver() {
        if (disponivel) {
            throw new Error("O livro ja esta na coleção e não pode ser devolvido");
        }
        return disponivel = true;
    }

    public void mostrarDados() {
        System.out.println("\n --- Dados do livro ---");
        if (disponivel) {
            System.out.println("Disponivel para emprestimo: Sim");
        } else {
            System.out.println("Disponivel para emprestimo: Não");
        }
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Codigo: " + codigo);
    }
}
