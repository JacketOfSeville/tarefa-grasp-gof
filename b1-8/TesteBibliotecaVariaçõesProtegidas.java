// Classe de teste usando a solução com Variações Protegidas
import java.time.LocalDate;

public class TesteBibliotecaVariaçõesProtegidas {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");

        // Registrando empréstimos com diferentes estratégias de cálculo de multa
        biblioteca.registrarEmprestimo(livro1, "João", LocalDate.now().minusDays(5), new MultaPadrao());
        biblioteca.registrarEmprestimo(livro2, "Maria", LocalDate.now().minusDays(10), new MultaRevista());

        System.out.println("\nMultas registradas:");
        biblioteca.calcularMultas();

        System.out.println("\nDevolvendo livro 1984...");
        biblioteca.devolverLivro("1984");

        System.out.println("\nMultas após devolução:");
        biblioteca.calcularMultas();
    }
    // Saida esperada:
    // Empr�stimo registrado: Livro "O Senhor dos An�is" para Jo�o
    // Empr�stimo registrado: Livro "1984" para Maria

    // Multas registradas:
    // Usu�rio: Jo�o, Multa: R$ 10.0
    // Usu�rio: Maria, Multa: R$ 15.0

    // Devolvendo livro 1984...
    // Livro "1984" devolvido com sucesso.

    // Multas ap�s devolu��o:
    // Usu�rio: Jo�o, Multa: R$ 10.0
}