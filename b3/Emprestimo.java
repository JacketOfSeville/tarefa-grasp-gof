
import java.time.LocalDate;

// Classe que representa um empréstimo de livro
public class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;

    // construtor da classe
    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    // setter para devolver o livro
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
    
    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    // getter do nome do usuario que pegou emrpestado
    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    // getter do livro emprestado
    public Livro getLivro() {
        return livro;
    }

    // Método que calcula a multa, se houver atraso
    public double calcularMulta() {
        long diasAtraso = java.time.temporal.ChronoUnit.DAYS.between(dataDeDevolucao, LocalDate.now());
        double multaPorDia = 2.0;
        return diasAtraso > 0 ? diasAtraso * multaPorDia : 0.0;
    }

    // Verifica se o livro está em atraso
    public boolean estaAtrasado() {
        return LocalDate.now().isAfter(dataDeDevolucao) && !devolvido;
    }

    // Override para retornar informações do livro ao invés de uma string comum
    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() + ", Usuário: " + nomeDoUsuario + ", Data de Devolução: " + dataDeDevolucao;
    }
}