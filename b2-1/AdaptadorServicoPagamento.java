// Classe que adapta o ServicoPagamentoExterno para a interface do sistema
public class AdaptadorServicoPagamento implements ProcessadorDePagamento {
    private ServicoPagamentoExterno servicoPagamentoExterno;

    // Construtor que recebe o serviço de pagamento externo
    public AdaptadorServicoPagamento() {
        this.servicoPagamentoExterno = new ServicoPagamentoExterno();
    }

    @Override
    public void processarPagamento(String usuario, double valor) {
        // Adaptando a interface: o nome do usuário é tratado como identificador
        String identificador = usuario;
        servicoPagamentoExterno.pagarFatura(identificador, valor);
    }
}