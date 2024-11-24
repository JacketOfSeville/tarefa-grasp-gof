// Interface para gerenciar livros
public interface GerenciadorDeLivros {
    void adicionarLivro(String titulo);
    Livro encontrarLivro(String titulo);
}