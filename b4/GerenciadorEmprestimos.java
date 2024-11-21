
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe responsável apenas por gerenciar empréstimos
public class GerenciadorEmprestimos {
    private List<Emprestimo> emprestimos;

    public GerenciadorEmprestimos() {
        this.emprestimos = new ArrayList<>();
    }

    // Função para registrar um empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    // Função para devolver um livro
    public void devolverLivro(String tituloDoLivro) {
        for (Emprestimo emprestimo : emprestimos) {
            // Se o titulo bater e não foi devolvido
            if (emprestimo.getLivro().getTitulo().equals(tituloDoLivro) && !emprestimo.isDevolvido()) {
                // devolver
                emprestimo.setDevolvido(true);
                System.out.println("Livro \"" + tituloDoLivro + "\" devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado ou já devolvido.");
    }

    // Função para obter todos os empréstimos
    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}