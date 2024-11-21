
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

// Classe responsável apenas por calcular multas
public class GerenciadorMultas {
    private double multaPorDia = 2.0;

    // Função para calcular multas de todos os empréstimos
    public void calcularMultas(List<Emprestimo> emprestimos) {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                double multa = calcularMulta(emprestimo);
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
            }
        }
    }

    // Função para calcular a multa de um único empréstimo
    private double calcularMulta(Emprestimo emprestimo) {
        long diasAtraso = ChronoUnit.DAYS.between(emprestimo.getDataDeDevolucao(), LocalDate.now());
        return diasAtraso > 0 ? diasAtraso * multaPorDia : 0.0;
    }
}