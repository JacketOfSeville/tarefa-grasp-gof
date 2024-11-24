// Classe Biblioteca que agora usa um adaptador para o serviço de pagamento

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Emprestimo> emprestimos;
    private ProcessadorDePagamento processadorDePagamento; // Usa interface em vez de classe específica

    // Construtor que recebe um processador de pagamento (injeção de dependência)
    public Biblioteca(ProcessadorDePagamento processadorDePagamento) {
        this.emprestimos = new ArrayList<>();
        this.processadorDePagamento = processadorDePagamento; // Pode ser qualquer implementação de ProcessadorDePagamento
    }

    // Registra um empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    // Processa as multas e paga através do processador de pagamento
    public void processarPagamentosDeMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido() && emprestimo.calcularDiasAtraso() > 0) {
                double multa = emprestimo.calcularMulta();
                // Agora usa o adaptador para processar o pagamento, sem saber sobre o serviço externo
                processadorDePagamento.processarPagamento(emprestimo.getNomeDoUsuario(), multa);
            }
        }
    }
}