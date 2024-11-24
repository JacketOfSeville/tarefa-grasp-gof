// Implementação concreta de um notificador que envia e-mails
public class NotificadorEmail implements Notificador {
    @Override
    public void enviarNotificacao(String destinatario, String assunto, String mensagem) {
        // Simula o envio de um e-mail
        System.out.println("Enviando e-mail para: " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }
}