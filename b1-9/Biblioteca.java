// Classe Biblioteca que não está mais diretamente acoplada ao sistema de notificação

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Emprestimo> emprestimos;
    private Notificador notificador; // Sistema de notificação é injetado

    // Construtor da Biblioteca que recebe um notificador
    public Biblioteca(Notificador notificador) {
        this.emprestimos = new ArrayList<>();
        this.notificador = notificador; // Biblioteca não sabe o tipo de notificador, apenas usa a interface
    }

    // Registra um empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, String emailDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, emailDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    // Calcula multas e notifica usuários com atrasos
    public void notificarUsuariosComAtraso() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                long diasAtraso = emprestimo.calcularDiasAtraso();
                if (diasAtraso > 0) {
                    // Biblioteca apenas usa o sistema de notificação sem se preocupar com o tipo
                    notificador.enviarNotificacao(
                        emprestimo.getEmailDoUsuario(),
                        "Multa",
                        "Você tem uma multa de R$ " + (diasAtraso * 2.0) + " pelo livro \"" + emprestimo.getLivro().getTitulo() + "\"."
                    );
                }
            }
        }
    }
}