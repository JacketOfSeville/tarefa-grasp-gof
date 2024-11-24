// Implementação concreta para a classe ColecaoDeMidias, que também é um MidiaComponente

import java.util.ArrayList;
import java.util.List;

class ColecaoDeMidias implements MidiaComponente {
    private String nome;
    private List<MidiaComponente> midias;

    public ColecaoDeMidias(String nome) {
        this.nome = nome;
        this.midias = new ArrayList<>();
    }

    // Adiciona um MidiaComponente à coleção (pode ser um Livro, Revista ou outra Coleção)
    public void adicionarMidia(MidiaComponente midia) {
        midias.add(midia);
    }

    @Override
    public void exibir() {
        System.out.println("Coleção: " + nome);
        for (MidiaComponente midia : midias) {
            midia.exibir();
        }
    }
}