// Classe que gerencia livros

import java.util.ArrayList;
import java.util.List;

class GerenciadorDeLivros {
    private List<Livro> livros;

    public GerenciadorDeLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public List<Livro> getLivros() {
        return livros;
    }
}