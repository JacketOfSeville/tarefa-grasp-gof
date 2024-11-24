// Classe que representa um livro
public class Livro {
    private String titulo;

    // Construtor da classe Livro
    public Livro(String titulo) {
        this.titulo = titulo;
    }

    // Retorna o título do livro
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
