// Classe que representa um Livro, implementando a interface Midia
public class Livro implements Midia {
    private String titulo;
    private String autor;

    // Construtor do Livro
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Retorna as informações do livro implementando o método da interface Midia
    @Override
    public String getInformacoes() {
        return "Livro: " + titulo + ", Autor: " + autor;
    }
}