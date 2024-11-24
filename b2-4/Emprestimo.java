// Classe que representa um empréstimo

import java.time.LocalDate;

public class Emprestimo {
    private Midia midia;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;

    public Emprestimo(Midia midia, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        this.midia = midia;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public long calcularDiasAtraso() {
        return LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay();
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public Midia getMidia() {
        return midia;
    }
}