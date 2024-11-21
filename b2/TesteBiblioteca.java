// Classe de teste para o sistema com design melhorado
import java.time.LocalDate;

public class TesteBiblioteca {
    public static void main(String[] args) {
        // cria a biblioteca
        Biblioteca biblioteca = new Biblioteca();
        // cria os livros
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");

        // registra os emprestimos
        biblioteca.registrarEmprestimo(livro1, "João", LocalDate.now().minusDays(10), LocalDate.now().minusDays(5));
        biblioteca.registrarEmprestimo(livro2, "Maria", LocalDate.now().minusDays(20), LocalDate.now().minusDays(15));

        System.out.println("Multas registradas:");
        biblioteca.exibirMultas();
    }
    // Saída esperada
    //
    // Multas registradas:
    // Usuário: João, Multa: R$ 10.0
    // Usuário: Maria, Multa: R$ 30.0
}