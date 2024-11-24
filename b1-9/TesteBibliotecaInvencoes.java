// Classe de teste utilizando o padrão Invenções Puras
import java.time.LocalDate;

public class TesteBibliotecaInvencoes {
    public static void main(String[] args) {
        // Criação de um notificador (pode ser facilmente trocado para outro tipo)
        Notificador notificadorEmail = new NotificadorEmail();
        Biblioteca biblioteca = new Biblioteca(notificadorEmail); // Injeta o notificador na biblioteca

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");

        biblioteca.registrarEmprestimo(livro1, "João", "joao@email.com", LocalDate.now().minusDays(5));
        biblioteca.registrarEmprestimo(livro2, "Maria", "maria@email.com", LocalDate.now().minusDays(10));

        System.out.println("\nNotificando usuários com atraso:");
        biblioteca.notificarUsuariosComAtraso();
    }
    // Saída esperada:
    // Empr�stimo registrado: Livro "O Senhor dos An�is" para Jo�o
    // Empr�stimo registrado: Livro "1984" para Maria

    // Notificando usu�rios com atraso:
    // Enviando e-mail para: joao@email.com
    // Assunto: Multa
    // Mensagem: Voc� tem uma multa de R$ 10.0 pelo livro "O Senhor dos An�is".
    // Enviando e-mail para: maria@email.com
    // Assunto: Multa
    // Mensagem: Voc� tem uma multa de R$ 20.0 pelo livro "1984".

}