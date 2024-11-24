// Implementação do repositório de mídias em memória

import java.util.ArrayList;
import java.util.List;

public class RepositorioMemoria implements RepositorioMidia {
    private List<Midia> midias;

    // Construtor que inicializa a lista de mídias
    public RepositorioMemoria() {
        this.midias = new ArrayList<>();
    }

    // Adiciona uma mídia ao repositório em memória
    @Override
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    // Retorna todas as mídias armazenadas
    @Override
    public List<Midia> listarMidias() {
        return midias;
    }
}