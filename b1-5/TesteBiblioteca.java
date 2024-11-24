// Classe de teste para verificar a implementação de Baixo Acoplamento
import java.time.LocalDate;

public class TesteBiblioteca {
    public static void main(String[] args) {
        // Criando gerenciadores especializados
        GerenciadorDeLivros gerenciadorDeLivros = new GerenciadorDeLivrosImpl();
        GerenciadorDeEmprestimos gerenciadorDeEmprestimos = new GerenciadorDeEmprestimosImpl();

        // Injetando dependências na Biblioteca
        Biblioteca biblioteca = new Biblioteca(gerenciadorDeLivros, gerenciadorDeEmprestimos);

        // Adicionando livros
        biblioteca.adicionarLivro("O Hobbit");
        biblioteca.adicionarLivro("Cem Anos de Solidão");

        // Registrando empréstimos
        biblioteca.registrarEmprestimo("O Hobbit", "Alice", LocalDate.now().minusDays(7));
        biblioteca.registrarEmprestimo("Cem Anos de Solidão", "Carlos", LocalDate.now().minusDays(3));

        // Calculando multas
        System.out.println("\nMultas:");
        biblioteca.calcularMultas();

        // Devolvendo livro
        System.out.println("\nDevolvendo livro O Hobbit...");
        biblioteca.devolverLivro("O Hobbit");

        // Calculando multas após devolução
        System.out.println("\nMultas após devolução:");
        biblioteca.calcularMultas();
    }
    // Saída esperada
    //
    // Livro "O Hobbit" adicionado � biblioteca.
    // Livro "Cem Anos de Solid�o" adicionado � biblioteca.
    // Empr�stimo registrado: Livro "O Hobbit" para Alice
    // Empr�stimo registrado: Livro "Cem Anos de Solid�o" para Carlos

    // Multas:
    // Usu�rio: Alice, Multa: R$ 14.0
    // Usu�rio: Carlos, Multa: R$ 6.0

    // Devolvendo livro O Hobbit...
    // Livro "O Hobbit" devolvido com sucesso.

    // Multas ap�s devolu��o:
    // Usu�rio: Carlos, Multa: R$ 6.0
}