// Classe principal que utiliza a Fachada

import java.time.LocalDate;

public class SistemaDeBiblioteca {
    public static void main(String[] args) {
        BibliotecaFacade bibliotecaFacade = new BibliotecaFacade();

        // Adicionando livros e revistas através da Fachada
        bibliotecaFacade.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien");
        bibliotecaFacade.adicionarRevista("National Geographic", 202);

        // Registrando um empréstimo através da Fachada
        bibliotecaFacade.registrarEmprestimo("O Senhor dos Anéis", "João", LocalDate.now().minusDays(5));

        // Calculando a multa através da Fachada
        double multa = bibliotecaFacade.calcularMulta("João");
        System.out.println("Multa para João: R$ " + multa);
    }
    // SAída esperada
    // Livro adicionado: O Senhor dos An�is
    // Revista adicionada: National Geographic
    // Empr�stimo registrado para: Jo�o
    // Multa para Jo�o: R$ 10.0
}