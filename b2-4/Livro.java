// Classe específica para livros
class Livro extends Midia {
    private String autor;

    public Livro(String titulo, String autor) {
        super(titulo, new CalculadoraMultaLivro()); // Associa a Calculadora de Multa específica para livros
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + ", Autor: " + autor;
    }
}