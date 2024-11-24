// Interface que define o comportamento de processamento de pagamentos
public interface ProcessadorDePagamento {
    void processarPagamento(String usuario, double valor);
}