// Implementação concreta de um notificador que envia SMS (pode ser usado no futuro)
public class NotificadorSMS implements Notificador {
    @Override
    public void enviarNotificacao(String destinatario, String assunto, String mensagem) {
        // Simula o envio de um SMS
        System.out.println("Enviando SMS para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}