package br.com.biblioteca;

import java.util.Set;

public class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(Set<Livro> livrosDisponiveis) {
        System.out.println(nome + ", os seguintes livros estão disponíveis para empréstimo:");
        for (Livro livro : livrosDisponiveis) {
            System.out.println(livro.getTitulo());
        }
    }
}
