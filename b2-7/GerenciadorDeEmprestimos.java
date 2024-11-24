// Classe Sujeito que gerencia os empréstimos

import java.util.ArrayList;
import java.util.List;

class GerenciadorDeEmprestimos {
    private List<Emprestimo> emprestimos;
    private List<Observador> observadores;

    public GerenciadorDeEmprestimos() {
        this.emprestimos = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    // Método para registrar um empréstimo
    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " + emprestimo.getUsuario().getNome());
    }

    // Método para adicionar um observador
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    // Método para remover um observador
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    // Método para notificar observadores sobre a devolução
    public void verificarEEnviarNotificacoes() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido() && emprestimo.diasParaDevolucao() > 0) {
                notificarObservadores(emprestimo);
            }
        }
    }

    // Método privado que notifica todos os observadores inscritos
    private void notificarObservadores(Emprestimo emprestimo) {
        for (Observador observador : observadores) {
            observador.atualizar(emprestimo);
        }
    }
}