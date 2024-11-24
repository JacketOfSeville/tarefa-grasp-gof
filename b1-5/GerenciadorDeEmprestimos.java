import java.time.LocalDate;

// Interface para gerenciar empréstimos
public interface GerenciadorDeEmprestimos {
    void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao);
    void devolverLivro(String tituloDoLivro);
    void calcularMultas();
}