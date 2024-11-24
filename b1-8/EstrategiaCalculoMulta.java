// Interface que define a estratégia de cálculo da multa

import java.time.LocalDate;

public interface EstrategiaCalculoMulta {
    double calcularMulta(LocalDate dataDeDevolucao);
}
