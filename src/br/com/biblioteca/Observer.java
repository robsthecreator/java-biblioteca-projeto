package br.com.biblioteca;

import java.util.Set;

public interface Observer {
    void atualizar(Set<Livro> livrosDisponiveis);
}
