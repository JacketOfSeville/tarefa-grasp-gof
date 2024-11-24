// Classe Biblioteca que usa a Fábrica para criar mídias

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Midia> midias;
    private FabricaMidia fabricaMidia;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    // Método para definir a fábrica a ser usada
    public void setFabricaMidia(FabricaMidia fabricaMidia) {
        this.fabricaMidia = fabricaMidia;
    }

    // Método para adicionar mídia usando a fábrica
    public void adicionarMidia(String titulo, String autorOuEdicao) {
        if (fabricaMidia != null) {
            Midia midia = fabricaMidia.criarMidia(titulo, autorOuEdicao); // Criação delegada à fábrica
            midias.add(midia);
            System.out.println("Mídia adicionada: " + midia.getTitulo());
        } else {
            System.out.println("Erro: Fábrica de Mídia não definida.");
        }
    }

    // Exibe todas as mídias
    public void exibirMidias() {
        for (Midia midia : midias) {
            System.out.println(midia.toString());
        }
    }
}