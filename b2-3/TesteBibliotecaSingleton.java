// Classe de Teste utilizando o Padrão Singleton
public class TesteBibliotecaSingleton {
    public static void main(String[] args) {
        // Configuração inicial global (apenas uma vez)
        ConfiguracaoBiblioteca.configurar("09:00 - 17:00", 1.5);

        // Duas bibliotecas que compartilham as mesmas configurações
        Biblioteca biblioteca1 = new Biblioteca();
        Biblioteca biblioteca2 = new Biblioteca();

        biblioteca1.adicionarLivro("O Senhor dos Anéis");
        biblioteca2.adicionarLivro("1984");

        System.out.println("\nConfigurações da Biblioteca 1:");
        biblioteca1.exibirConfiguracoes();
        System.out.println("\nConfigurações da Biblioteca 2:");
        biblioteca2.exibirConfiguracoes();
    }
    // Saída esperada
    // Livro adicionado: O Senhor dos An�is
    // Livro adicionado: 1984

    // Configura��es da Biblioteca 1:
    // Hor�rios: 09:00 - 17:00, Multa Di�ria: R$ 1.5

    // Configura��es da Biblioteca 2:
    // Hor�rios: 09:00 - 17:00, Multa Di�ria: R$ 1.5
}