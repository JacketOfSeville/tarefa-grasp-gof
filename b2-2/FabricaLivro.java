// Fábrica específica para criar Livros
public class FabricaLivro implements FabricaMidia {
    @Override
    public Midia criarMidia(String titulo, String autor) {
        return new Livro(titulo, autor);
    }
}