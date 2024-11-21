
import java.time.LocalDate;

// Classe Controlador que gerencia a lógica do sistema
public class BibliotecaController {
    private Biblioteca biblioteca;

    // construtor do controller
    public BibliotecaController(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    // Registra um novo empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        biblioteca.adicionarEmprestimo(emprestimo);
        System.out.println("Empréstimo registrado para o livro: " + livro.getTitulo());
    }

    // Processa a devolução de um livro
    public void devolverLivro(Livro livro) {
        Emprestimo emprestimo = biblioteca.encontrarEmprestimoPorLivro(livro);
        // se não houver empréstimos
        if (emprestimo != null) {
            emprestimo.setDevolvido(true);
            System.out.println("Livro " + livro.getTitulo() + " devolvido com sucesso.");
        } else {
            System.out.println("Erro: Livro não encontrado ou já devolvido.");
        }
    }

    // Exibe as multas dos empréstimos não devolvidos
    public void exibirMultas() {
        System.out.println("\nMultas registradas:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            // se não foi devolvido
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Livro: " + emprestimo.getLivro().getTitulo() + ", Multa: R$ " + multa);
            }
        }
    }

    // Consulta e exibe livros em atraso
    public void consultarLivrosEmAtraso() {
        System.out.println("\nLivros em atraso:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (emprestimo.estaAtrasado()) {
                System.out.println(emprestimo);
            }
        }
    }
}