// Classe de teste utilizando o padrão Adaptador
import java.time.LocalDate;

public class TesteBibliotecaAdaptador {
    public static void main(String[] args) {
        // Criação do adaptador para o serviço de pagamento externo
        ProcessadorDePagamento adaptadorPagamento = new AdaptadorServicoPagamento();
        Biblioteca biblioteca = new Biblioteca(adaptadorPagamento); // Injeta o adaptador na biblioteca

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");

        biblioteca.registrarEmprestimo(livro1, "João", LocalDate.now().minusDays(5));
        biblioteca.registrarEmprestimo(livro2, "Maria", LocalDate.now().minusDays(10));

        System.out.println("\nProcessando pagamentos de multas:");
        biblioteca.processarPagamentosDeMultas();
    }
    // Saida esperada
    // Empr�stimo registrado: Livro "O Senhor dos An�is" para Jo�o
    // Empr�stimo registrado: Livro "1984" para Maria

    // Processando pagamentos de multas:
    // Pagamento de R$ 10.0 processado para o identificador: Jo�o
    // Pagamento de R$ 20.0 processado para o identificador: Maria
}