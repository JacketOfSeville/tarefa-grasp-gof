// Classe de teste para o sistema com o padrão Controller aplicado
import java.time.LocalDate;

public class TesteBibliotecaController {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        BibliotecaController controlador = new BibliotecaController(biblioteca);

        // Registrar empréstimos usando o controlador
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");
        controlador.registrarEmprestimo(livro1, "João", LocalDate.now().minusDays(5));
        controlador.registrarEmprestimo(livro2, "Maria", LocalDate.now().minusDays(10));

        // Exibir multas
        controlador.exibirMultas();

        // Devolver um livro
        System.out.println("\nDevolvendo livro 1984...");
        controlador.devolverLivro(livro2);

        // Exibir multas após a devolução
        controlador.exibirMultas();

        // Consultar livros em atraso
        controlador.consultarLivrosEmAtraso();
    }
    // Saída esperada:
    // Empréstimo registrado para o livro: O Senhor dos Anéis
    // Empréstimo registrado para o livro: 1984

    // Multas registradas:
    // Usuário: João, Livro: O Senhor dos Anéis, Multa: R$ 10.0
    // Usuário: Maria, Livro: 1984, Multa: R$ 20.0

    // Devolvendo livro 1984...
    // Livro 1984 devolvido com sucesso.

    // Multas registradas:
    // Usuário: João, Livro: O Senhor dos Anéis, Multa: R$ 10.0

    // Livros em atraso:
    // Livro: O Senhor dos Anéis, Usuário: João, Data de Devolução: 2024-11-13
}