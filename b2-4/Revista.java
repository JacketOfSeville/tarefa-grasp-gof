// Classe específica para revistas
class Revista extends Midia {
    private int edicao;

    public Revista(String titulo, int edicao) {
        super(titulo, new CalculadoraMultaRevista()); // Associa a Calculadora de Multa específica para revistas
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public String toString() {
        return "Revista: " + titulo + ", Edição: " + edicao;
    }
}