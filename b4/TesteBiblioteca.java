// Classe de teste refatorada
import java.time.LocalDate;

public class TesteBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        GerenciadorEmprestimos gerenciadorEmprestimos = new GerenciadorEmprestimos();
        GerenciadorMultas gerenciadorMultas = new GerenciadorMultas();

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarLivro("1984");

        // Registrando empréstimos
        Livro livro1 = biblioteca.encontrarLivro("O Senhor dos Anéis");
        Livro livro2 = biblioteca.encontrarLivro("1984");

        if (livro1 != null) {
            gerenciadorEmprestimos.registrarEmprestimo(livro1, "João", LocalDate.now().minusDays(5));
        }
        if (livro2 != null) {
            gerenciadorEmprestimos.registrarEmprestimo(livro2, "Maria", LocalDate.now().minusDays(10));
        }

        // Calculando multas
        System.out.println("\nMultas:");
        gerenciadorMultas.calcularMultas(gerenciadorEmprestimos.getEmprestimos());

        // Devolvendo livro
        System.out.println("\nDevolvendo livro 1984...");
        gerenciadorEmprestimos.devolverLivro("1984");

        // Calculando multas após devolução
        System.out.println("\nMultas após devolução:");
        gerenciadorMultas.calcularMultas(gerenciadorEmprestimos.getEmprestimos());
    }
    // Saída esperada:
    // Livro "O Senhor dos Anéis" adicionado à biblioteca.
    // Livro "1984" adicionado à biblioteca.
    // Empréstimo registrado: Livro "O Senhor dos Anéis" para João
    // Empréstimo registrado: Livro "1984" para Maria

    // Multas:
    // Usuário: João, Multa: R$ 10.0
    // Usuário: Maria, Multa: R$ 20.0

    // Devolvendo livro 1984...
    // Livro "1984" devolvido com sucesso.

    // Multas após devolução:
    // Usuário: João, Multa: R$ 10.0
}