import java.util.ArrayList;
import java.util.List;

// Classeda biblioteca
public class Biblioteca {
    private List<Livro> livros;
    
    // Cria um array para os livros 
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Adiciona um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Método para registrar um empréstimo, delegando a criação para o Livro
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario) {
        livro.criarEmprestimo(nomeDoUsuario);
    }

    // Exibir todos os empréstimos de todos os livros da biblioteca
    public void exibirEmprestimos() {
        for (Livro livro : livros) {
            livro.exibirEmprestimos();
        }
    }
}