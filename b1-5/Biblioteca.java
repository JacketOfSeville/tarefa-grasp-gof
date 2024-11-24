import java.time.LocalDate;

// Classe principal Biblioteca com baixo acoplamento
public class Biblioteca {
    private GerenciadorDeLivros gerenciadorDeLivros;
    private GerenciadorDeEmprestimos gerenciadorDeEmprestimos;

    // Construtor usando injeção de dependências
    public Biblioteca(GerenciadorDeLivros gerenciadorDeLivros, GerenciadorDeEmprestimos gerenciadorDeEmprestimos) {
        this.gerenciadorDeLivros = gerenciadorDeLivros;
        this.gerenciadorDeEmprestimos = gerenciadorDeEmprestimos;
    }

    // Delegando a adição de livro ao GerenciadorDeLivros
    public void adicionarLivro(String titulo) {
        gerenciadorDeLivros.adicionarLivro(titulo);
    }

    // Delegando o registro de empréstimo ao GerenciadorDeEmprestimos
    public void registrarEmprestimo(String tituloDoLivro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Livro livro = gerenciadorDeLivros.encontrarLivro(tituloDoLivro);
        if (livro != null) {
            gerenciadorDeEmprestimos.registrarEmprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        } else {
            System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado.");
        }
    }

    // Delegando a devolução de livro ao GerenciadorDeEmprestimos
    public void devolverLivro(String tituloDoLivro) {
        gerenciadorDeEmprestimos.devolverLivro(tituloDoLivro);
    }

    // Delegando o cálculo de multas ao GerenciadorDeEmprestimos
    public void calcularMultas() {
        gerenciadorDeEmprestimos.calcularMultas();
    }
}