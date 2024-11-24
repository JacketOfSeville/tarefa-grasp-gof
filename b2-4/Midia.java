// Classe abstrata para mídias que inclui uma referência para a Calculadora de Multa
abstract class Midia {
    protected String titulo;
    protected CalculadoraMulta calculadoraMulta;

    public Midia(String titulo, CalculadoraMulta calculadoraMulta) {
        this.titulo = titulo;
        this.calculadoraMulta = calculadoraMulta;
    }

    // Método para obter o título da mídia
    public String getTitulo() {
        return titulo;
    }

    // Método abstrato para obter a calculadora de multa específica
    public CalculadoraMulta getCalculadoraMulta() {
        return calculadoraMulta;
    }
}