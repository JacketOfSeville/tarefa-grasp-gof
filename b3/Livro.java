// Classe que representa um livro
public class Livro {
    private String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    // override para trazer o titulo ao inves de uma string comum
    @Override
    public String toString() {
        return titulo;
    }
}