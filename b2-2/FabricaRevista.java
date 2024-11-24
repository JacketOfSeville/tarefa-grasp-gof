// Fábrica específica para criar Revistas
public class FabricaRevista implements FabricaMidia {
    @Override
    public Midia criarMidia(String titulo, String edicao) {
        return new Revista(titulo, Integer.parseInt(edicao));
    }
}