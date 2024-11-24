// Classe Revista que implementa Midia
public class Revista implements Midia {
    private String titulo;
    private int edicao;

    // Construtor da Revista
    public Revista(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    // Implementação do método getTitulo da interface Midia
    @Override
    public String getTitulo() {
        return titulo;
    }

    // Implementação do método exibirDetalhes da interface Midia
    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: " + titulo + ", Edição: " + edicao);
    }
}