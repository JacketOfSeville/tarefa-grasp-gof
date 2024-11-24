public class Emprestimo {
    // O Livro a ser emprestado
    private Livro livro;
    // Nome do usuario que ira retirar o livro
    private String nomeDoUsuario;

    // Construtor de Emprestimo agora está protegido e não é mais criado diretamente pela Biblioteca
    protected Emprestimo(Livro livro, String nomeDoUsuario) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
    }

    // Override para imprimir o estado do emprestimo no lugar da STring
    @Override
    public String toString() {
        return "Livro emprestado: " + livro.getTitulo() + " para " + nomeDoUsuario;
    }
}