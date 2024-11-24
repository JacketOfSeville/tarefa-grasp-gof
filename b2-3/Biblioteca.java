// Classe Biblioteca que agora utiliza a configuração compartilhada

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<String> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Adiciona um livro à biblioteca
    public void adicionarLivro(String livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    // Exibe as configurações da biblioteca
    public void exibirConfiguracoes() {
        System.out.println(ConfiguracaoBiblioteca.getInstancia().toString());
    }
}