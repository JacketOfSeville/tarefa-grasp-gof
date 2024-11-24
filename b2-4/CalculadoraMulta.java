// Interface para cálculo de multas (Estratégia)
interface CalculadoraMulta {
    // Método para calcular a multa com base no número de dias de atraso
    double calcularMulta(long diasAtraso);
}