// Implementação do Gerenciador de Livros

import java.util.List;
import java.util.ArrayList;

public class GerenciadorDeLivrosImpl implements GerenciadorDeLivros {
    private List<Livro> livros;

    public GerenciadorDeLivrosImpl() {
        this.livros = new ArrayList<>();
    }

    @Override
    public void adicionarLivro(String titulo) {
        Livro livro = new Livro(titulo);
        livros.add(livro);
        System.out.println("Livro \"" + titulo + "\" adicionado à biblioteca.");
    }

    @Override
    public Livro encontrarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
}