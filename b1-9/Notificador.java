// Interface que define o comportamento para notificação de usuários
public interface Notificador {
    void enviarNotificacao(String destinatario, String assunto, String mensagem);
}