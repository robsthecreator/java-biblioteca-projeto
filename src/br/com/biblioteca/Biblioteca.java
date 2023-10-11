package br.com.biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Biblioteca {
    private Set<Observer> observers = new HashSet<>();
    private Set<Livro> livrosDisponiveis = new HashSet<>();

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
        notificarUsuarios();
    }

    public void removerLivro(Livro livro) {
        livrosDisponiveis.remove(livro);
        notificarUsuarios();
    }

    public void registrarUsuario(Observer observer) {
        observers.add(observer);
    }

    public void removerUsuario(Observer observer) {
        observers.remove(observer);
    }

    private void notificarUsuarios() {
        for (Observer observer : observers) {
            observer.atualizar(livrosDisponiveis);
        }
    }
}
