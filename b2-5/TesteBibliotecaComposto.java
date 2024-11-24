// Classe de Teste utilizando o Padrão Composto
public class TesteBibliotecaComposto {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando mídias individuais
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Revista revista1 = new Revista("National Geographic", 202);

        biblioteca.adicionarMidia(livro1);
        biblioteca.adicionarMidia(revista1);

        // Criando uma coleção de mídias
        ColecaoDeMidias colecao = new ColecaoDeMidias("Coleção Fantasia");
        colecao.adicionarMidia(new Livro("Harry Potter", "J.K. Rowling"));
        colecao.adicionarMidia(new Revista("Comic Book", 1));

        biblioteca.adicionarMidia(colecao);

        // Exibindo a biblioteca
        biblioteca.exibirBiblioteca();
    }
    // Saída esperada:
    // Biblioteca:
    // Livro: O Senhor dos An�is, Autor: J.R.R. Tolkien
    // Revista: National Geographic, Edi��o: 202
    // Cole��o: Cole��o Fantasia
    // Livro: Harry Potter, Autor: J.K. Rowling
    // Revista: Comic Book, Edi��o: 1
}