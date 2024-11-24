// Classe de teste utilizando o Padrão Fábrica
public class TesteBibliotecaFabrica {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Configurando a fábrica para criar livros
        biblioteca.setFabricaMidia(new FabricaLivro());
        biblioteca.adicionarMidia("O Senhor dos Anéis", "J.R.R. Tolkien");

        // Configurando a fábrica para criar revistas
        biblioteca.setFabricaMidia(new FabricaRevista());
        biblioteca.adicionarMidia("National Geographic", "202");

        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
    }
    // Saída esperada
    // M�dia adicionada: O Senhor dos An�is
    // M�dia adicionada: National Geographic

    // M�dias na biblioteca:
    // Livro: O Senhor dos An�is, Autor: J.R.R. Tolkien
    // Revista: National Geographic, Edi��o: 202
}