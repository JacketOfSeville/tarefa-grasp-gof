// Classe de teste usando a solução com Indireção
public class TesteBibliotecaIndirecao {
    public static void main(String[] args) {
        // Criando um repositório de mídias em memória
        RepositorioMidia repositorioMemoria = new RepositorioMemoria();

        // Criando a biblioteca com o repositório
        Biblioteca biblioteca = new Biblioteca(repositorioMemoria);

        // Adicionando mídias à biblioteca
        Midia livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Midia revista1 = new Revista("National Geographic", 202);
        biblioteca.adicionarMidia(livro1);
        biblioteca.adicionarMidia(revista1);

        // Exibindo mídias da biblioteca
        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
    }

    // Saída esperada
    //
    // M�dia adicionada: O Senhor dos An�is
    // M�dia adicionada: National Geographic
    // 
    // M�dias na biblioteca:
    // Livro: O Senhor dos An�is, Autor: J.R.R. Tolkien
    // Revista: National Geographic, Edi��o: 202
}