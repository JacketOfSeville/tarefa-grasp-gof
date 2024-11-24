import java.util.ArrayList;
import java.util.List;

// Classe representativa dos livros
public class Livro {
    private String titulo;

    // Lista de empréstimos associados a este livro
    private List<Emprestimo> emprestimos;

    // Construtor do livro
    public Livro(String titulo) {
        this.titulo = titulo;
        this.emprestimos = new ArrayList<>();
    }

    // Retorna o titulo do livro
    public String getTitulo() {
        return titulo;
    }

    // Método responsável por criar um empréstimo associado a este livro
    public Emprestimo criarEmprestimo(String nomeDoUsuario) {
        Emprestimo emprestimo = new Emprestimo(this, nomeDoUsuario);
        emprestimos.add(emprestimo);
        return emprestimo;
    }

    // Método para exibir todos os empréstimos deste livro
    public void exibirEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo);
        }
    }
}