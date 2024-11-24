// Implementação de cálculo de multas para revistas
class CalculadoraMultaRevista implements CalculadoraMulta {
    @Override
    public double calcularMulta(long diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 1.0 : 0.0; // Multa de R$ 1.00 por dia de atraso
    }
}