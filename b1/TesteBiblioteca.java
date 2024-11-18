public class TesteBiblioteca {
    public static void main(String[] args) {
        // Instancia a biblioteca
        Biblioteca biblioteca = new Biblioteca();
        
        // Cria os livros
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");

        // Adiciona os livro na biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Empresta os livros para as pessoas
        biblioteca.registrarEmprestimo(livro1, "João");
        biblioteca.registrarEmprestimo(livro2, "Maria");

        // Exibe os resultados
        System.out.println("Empréstimos registrados:");
        biblioteca.exibirEmprestimos();
    }
    // Saida esperada
    // 
    // Empréstimos registrados:
    // Livro emprestado: O Senhor dos Anéis para João
    // Livro emprestado: 1984 para Maria
}