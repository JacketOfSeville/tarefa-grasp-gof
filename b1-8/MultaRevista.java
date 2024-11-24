// Outra implementação de estratégia de multa para um tipo específico de mídia (ex: revistas)

import java.time.LocalDate;

public class MultaRevista implements EstrategiaCalculoMulta {
    @Override
    public double calcularMulta(LocalDate dataDeDevolucao) {
        long diasAtraso = LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay();
        return diasAtraso > 0 ? diasAtraso * 1.5 : 0.0; // Multa de 1,5 reais por dia para revistas
    }
}