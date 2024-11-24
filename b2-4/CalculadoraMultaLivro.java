// Implementação de cálculo de multas para livros
class CalculadoraMultaLivro implements CalculadoraMulta {
    @Override
    public double calcularMulta(long diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0; // Multa de R$ 2.00 por dia de atraso
    }
}