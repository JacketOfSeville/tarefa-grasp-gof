// Classe que representa uma Revista, implementando a interface Midia
public class Revista implements Midia {
    private String titulo;
    private int edicao;

    // Construtor da Revista
    public Revista(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    // Retorna as informações da revista implementando o método da interface Midia
    @Override
    public String getInformacoes() {
        return "Revista: " + titulo + ", Edição: " + edicao;
    }
}