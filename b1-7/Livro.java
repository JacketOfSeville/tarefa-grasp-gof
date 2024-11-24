// Classe Livro que implementa Midia
public class Livro implements Midia {
    private String titulo;
    private String autor;

    // Construtor do Livro
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Implementação do método getTitulo da interface Midia
    @Override
    public String getTitulo() {
        return titulo;
    }

    // Implementação do método exibirDetalhes da interface Midia
    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + ", Autor: " + autor);
    }
}