// Classe de teste com a nova implementação usando Polimorfismo
public class TesteBibliotecaPolimorfismo {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando mídias
        biblioteca.adicionarMidia(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"));
        biblioteca.adicionarMidia(new Revista("National Geographic", 202));
        biblioteca.adicionarMidia(new Livro("1984", "George Orwell"));

        // Exibindo mídias
        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
    }

    // Saída esperada
    //
    // �dia adicionada: Livro: O Senhor dos An�is, Autor: J.R.R. Tolkien
    // M�dia adicionada: Revista: National Geographic, Edi��o: 202
    // M�dia adicionada: Livro: 1984, Autor: George Orwell

    // M�dias na biblioteca:
    // Livro: O Senhor dos An�is, Autor: J.R.R. Tolkien
    // Revista: National Geographic, Edi��o: 202
    // Livro: 1984, Autor: George Orwell
}