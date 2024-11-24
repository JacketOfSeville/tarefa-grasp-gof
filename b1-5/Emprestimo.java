import java.time.LocalDate;

// Classe que representa um empréstimo de livro
public class Emprestimo {
    private Livro livro;                // Livro associado ao empréstimo
    private String nomeDoUsuario;       // Nome do usuário que pegou o livro emprestado
    private LocalDate dataDeDevolucao;  // Data prevista para a devolução do livro
    private boolean devolvido;          // Estado do empréstimo (devolvido ou não)

    // Construtor da classe Emprestimo
    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
    }

    // Retorna se o livro foi devolvido
    public boolean isDevolvido() {
        return devolvido;
    }

    // Marca o livro como devolvido
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    // Retorna a data de devolução
    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    // Retorna o nome do usuário
    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    // Retorna o livro associado ao empréstimo
    public Livro getLivro() {
        return livro;
    }

    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() + ", Usuário: " + nomeDoUsuario + ", Data de Devolução: " + dataDeDevolucao;
    }
}
