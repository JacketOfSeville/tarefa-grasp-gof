// Classe de Teste utilizando o Padrão Estratégia
import java.time.LocalDate;

public class TesteBibliotecaEstrategia {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Revista revista = new Revista("National Geographic", 202);

        biblioteca.registrarEmprestimo(livro, "João", LocalDate.now().minusDays(5));
        biblioteca.registrarEmprestimo(revista, "Maria", LocalDate.now().minusDays(10));

        System.out.println("\nCalculando multas:");
        biblioteca.calcularMultas();
    }
    // Saída esperada
    // Empr�stimo registrado para: Jo�o
    // Empr�stimo registrado para: Maria

    // Calculando multas:
    // Usu�rio: Jo�o, Multa: R$ 10.0
    // Usu�rio: Maria, Multa: R$ 10.0
}