// Classe Fachada que simplifica a interação com o sistema da biblioteca

import java.time.LocalDate;

class BibliotecaFacade {
    private GerenciadorDeLivros gerenciadorDeLivros;
    private GerenciadorDeRevistas gerenciadorDeRevistas;
    private GerenciadorDeEmprestimos gerenciadorDeEmprestimos;
    private CalculadoraDeMultas calculadoraDeMultas;

    public BibliotecaFacade() {
        this.gerenciadorDeLivros = new GerenciadorDeLivros();
        this.gerenciadorDeRevistas = new GerenciadorDeRevistas();
        this.gerenciadorDeEmprestimos = new GerenciadorDeEmprestimos();
        this.calculadoraDeMultas = new CalculadoraDeMultas();
    }

    // Método para adicionar um livro através da Fachada
    public void adicionarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        gerenciadorDeLivros.adicionarLivro(livro);
    }

    // Método para adicionar uma revista através da Fachada
    public void adicionarRevista(String titulo, int edicao) {
        Revista revista = new Revista(titulo, edicao);
        gerenciadorDeRevistas.adicionarRevista(revista);
    }

    // Método para registrar um empréstimo através da Fachada
    public void registrarEmprestimo(String tituloLivro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        // Busca pelo livro entre os livros registrados
        for (Livro livro : gerenciadorDeLivros.getLivros()) {
            if (livro.getTitulo().equals(tituloLivro)) {
                Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
                gerenciadorDeEmprestimos.registrarEmprestimo(emprestimo);
                return;
            }
        }
        System.out.println("Livro não encontrado: " + tituloLivro);
    }

    // Método para calcular multa de um empréstimo através da Fachada
    public double calcularMulta(String nomeDoUsuario) {
        for (Emprestimo emprestimo : gerenciadorDeEmprestimos.getEmprestimos()) {
            if (emprestimo.getNomeDoUsuario().equals(nomeDoUsuario)) {
                return calculadoraDeMultas.calcularMulta(emprestimo);
            }
        }
        System.out.println("Empréstimo não encontrado para usuário: " + nomeDoUsuario);
        return 0.0;
    }
}