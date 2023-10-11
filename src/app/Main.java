package app;

import br.com.biblioteca.Biblioteca;
import br.com.biblioteca.Livro;
import br.com.biblioteca.Usuario;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal");
        Livro livro2 = new Livro("Senhor dos Anéis");
        Livro livro3 = new Livro("Dom Quixote");
        Livro livro4 = new Livro("1984");
        Livro livro5 = new Livro("O Pequeno Príncipe");

        Usuario usuario1 = new Usuario("João");
        Usuario usuario2 = new Usuario("Maria");
        Usuario usuario3 = new Usuario("Renato");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);
        biblioteca.registrarUsuario(usuario3);

        // Um livro é emprestado, então notificamos os usuários
        biblioteca.removerLivro(livro1);
    }
}
