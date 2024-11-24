// Classe Observador para futuras notificações por SMS (exemplo de extensão)
class NotificacaoPorSMS implements Observador {
    @Override
    public void atualizar(Emprestimo emprestimo) {
        System.out.println("Enviando SMS para: " +
                emprestimo.getUsuario().getNome() +
                " - Lembrete: devolução do livro \"" +
                emprestimo.getLivro().getTitulo() + "\" em breve.");
    }
}