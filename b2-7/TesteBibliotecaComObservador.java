// Classe de Teste usando o padrão Observador

import java.time.LocalDate;

public class TesteBibliotecaComObservador {
    public static void main(String[] args) {
        GerenciadorDeEmprestimos gerenciador = new GerenciadorDeEmprestimos();

        // Adicionando Observadores (notificações por e-mail e SMS)
        gerenciador.adicionarObservador(new NotificacaoPorEmail());
        gerenciador.adicionarObservador(new NotificacaoPorSMS());

        // Criando um livro e usuário
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Usuario usuario = new Usuario("João", "joao@email.com");

        // Registrando o empréstimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario, LocalDate.now().plusDays(3));
        gerenciador.registrarEmprestimo(emprestimo);

        // Verificar e enviar notificações através dos observadores
        System.out.println("\nVerificando notificações:");
        gerenciador.verificarEEnviarNotificacoes();
    }
    // Saída esperada:
    // Empr�stimo registrado para: Jo�o

    // Verificando notifica��es:
}