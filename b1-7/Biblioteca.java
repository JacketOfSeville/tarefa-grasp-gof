// Classe Biblioteca usando Indireção para acessar o repositório de mídias
public class Biblioteca {
    private RepositorioMidia repositorio;

    // Construtor da Biblioteca que recebe um RepositorioMidia
    public Biblioteca(RepositorioMidia repositorio) {
        this.repositorio = repositorio;
    }

    // Adiciona uma mídia ao repositório através da interface RepositorioMidia
    public void adicionarMidia(Midia midia) {
        repositorio.adicionarMidia(midia);
        System.out.println("Mídia adicionada: " + midia.getTitulo());
    }

    // Exibe todas as mídias armazenadas no repositório através da interface RepositorioMidia
    public void exibirMidias() {
        for (Midia midia : repositorio.listarMidias()) {
            midia.exibirDetalhes();
        }
    }
}