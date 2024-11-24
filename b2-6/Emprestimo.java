// Classe Emprestimo

import java.time.LocalDate;

class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;

    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    @Override
    public String toString() {
        return "Empréstimo do livro '" + livro.getTitulo() + "' para " + nomeDoUsuario;
    }
}