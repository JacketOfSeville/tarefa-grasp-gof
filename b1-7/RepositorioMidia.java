// Interface que abstrai o repositório de mídias

import java.util.List;

public interface RepositorioMidia {
    void adicionarMidia(Midia midia);
    List<Midia> listarMidias();
}