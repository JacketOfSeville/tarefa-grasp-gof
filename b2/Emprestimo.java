import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private LocalDate dataDeEmprestimo;
    private LocalDate dataDeDevolucao;

    // Construtor do emprestimo
    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeEmprestimo, LocalDate dataDeDevolucao) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataDeDevolucao = dataDeDevolucao;
    }

    // getter da data de devolução
    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    // getter do nome do usuario que pegou o livro emprestado
    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    // getter do livro emprestado
    public Livro getLivro() {
        return livro;
    }

    // override para imprimir as informações do emprestimo no lugar de uma string normal
    @Override
    public String toString() {
        return "Livro emprestado: " + livro.getTitulo() + " para " + nomeDoUsuario + ", Data de Devolução: " + dataDeDevolucao;
    }

    // método que calcula a multa, implementando o padrão Especialista
    public double calcularMulta() {
        long diasAtraso = ChronoUnit.DAYS.between(dataDeDevolucao, LocalDate.now());
        double multaPorDia = 2.0;
        if (diasAtraso > 0) {
            return diasAtraso * multaPorDia;
        }
        return 0.0;
    }
}