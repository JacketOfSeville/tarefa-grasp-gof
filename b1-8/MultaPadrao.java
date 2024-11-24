// Implementação da estratégia de cálculo de multa padrão (2 reais por dia de atraso)

import java.time.LocalDate;

public class MultaPadrao implements EstrategiaCalculoMulta {
    @Override
    public double calcularMulta(LocalDate dataDeDevolucao) {
        long diasAtraso = LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay();
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0; // Multa padrão de 2 reais por dia
    }
}