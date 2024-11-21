
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe que gerencia a biblioteca, agora sem a responsabilidade de calcular multas
public class Biblioteca {
    // lista de emprestimos dessa biblioteca
    private List<Emprestimo> emprestimos;

    // Construtor da classe, criando um array
    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    // método para registrar emprestimos na biblioteca
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataEmprestimo, dataDevolucao);
        emprestimos.add(emprestimo);
    }

    // Método atualizado para exibir multas, chamando o cálculo do Emprestimo
    public void exibirMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            // Delegando o cálculo da multa para o objeto Emprestimo
            double multa = emprestimo.calcularMulta();
            System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
        }
    }
}