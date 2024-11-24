// Classe que representa um empréstimo de livro, utilizando a estratégia de cálculo de multa

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;
    private EstrategiaCalculoMulta estrategiaCalculoMulta; // Estratégia de cálculo de multa

    // Construtor do Emprestimo com uma estratégia de cálculo de multa
    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao, EstrategiaCalculoMulta estrategiaCalculoMulta) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
        this.estrategiaCalculoMulta = estrategiaCalculoMulta;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public Livro getLivro() {
        return livro;
    }

    // Utiliza a estratégia de cálculo de multa configurada para calcular a multa
    public double calcularMulta() {
        return estrategiaCalculoMulta.calcularMulta(dataDeDevolucao);
    }

    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() + ", Usuário: " + nomeDoUsuario + ", Data de Devolução: " + dataDeDevolucao;
    }
}