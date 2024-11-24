// Classe Biblioteca utilizando o Padrão Composto

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<MidiaComponente> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    // Adiciona uma mídia ou coleção à biblioteca
    public void adicionarMidia(MidiaComponente midia) {
        midias.add(midia);
    }

    // Exibe todas as mídias (incluindo coleções) na biblioteca
    public void exibirBiblioteca() {
        System.out.println("Biblioteca:");
        for (MidiaComponente midia : midias) {
            midia.exibir();
        }
    }
}