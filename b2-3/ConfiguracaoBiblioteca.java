// Classe que gerencia configurações da biblioteca usando o Padrão Singleton
public class ConfiguracaoBiblioteca {
    private String horariosDeFuncionamento;
    private double valorMultaDiaria;

    // Instância única da ConfiguracaoBiblioteca
    private static ConfiguracaoBiblioteca instanciaUnica;

    // Construtor privado para evitar criação direta
    private ConfiguracaoBiblioteca(String horariosDeFuncionamento, double valorMultaDiaria) {
        this.horariosDeFuncionamento = horariosDeFuncionamento;
        this.valorMultaDiaria = valorMultaDiaria;
    }

    // Método para obter a instância única da configuração
    public static ConfiguracaoBiblioteca getInstancia() {
        if (instanciaUnica == null) {
            // Inicialização padrão caso não tenha sido configurada
            instanciaUnica = new ConfiguracaoBiblioteca("08:00 - 18:00", 2.0);
        }
        return instanciaUnica;
    }

    // Método para configurar a instância única (pode ser chamado uma vez no início)
    public static void configurar(String horariosDeFuncionamento, double valorMultaDiaria) {
        if (instanciaUnica == null) {
            instanciaUnica = new ConfiguracaoBiblioteca(horariosDeFuncionamento, valorMultaDiaria);
        }
    }

    public String getHorariosDeFuncionamento() {
        return horariosDeFuncionamento;
    }

    public double getValorMultaDiaria() {
        return valorMultaDiaria;
    }

    @Override
    public String toString() {
        return "Horários: " + horariosDeFuncionamento + ", Multa Diária: R$ " + valorMultaDiaria;
    }
}