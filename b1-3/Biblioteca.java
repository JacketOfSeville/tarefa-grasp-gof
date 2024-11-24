
import java.util.ArrayList;
import java.util.List;

// Classe que gerencia a biblioteca
public class Biblioteca {
    private List<Emprestimo> emprestimos;

    // construtor da biblioteca
    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    // método para adicionar um empréstimo
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }
    
    // getter dos emprestimos da biblioteca
    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    // Método para encontrar um empréstimo baseado no livro
    public Emprestimo encontrarEmprestimoPorLivro(Livro livro) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().equals(livro) && !emprestimo.isDevolvido()) {
                return emprestimo;
            }
        }
        return null;
    }
}