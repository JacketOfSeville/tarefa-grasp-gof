// Classe Biblioteca melhorada com Polimorfismo

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Midia> midias; // Lista de mídias usando a interface Midia

    // Construtor da Biblioteca
    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    // Adiciona uma mídia à lista
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
        System.out.println("Mídia adicionada: " + midia.getInformacoes());
    }

    // Exibe informações de todas as mídias usando Polimorfismo
    public void exibirMidias() {
        for (Midia midia : midias) {
            System.out.println(midia.getInformacoes()); // Chamada polimórfica
        }
    }
}