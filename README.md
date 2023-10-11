# Gerenciamento de Biblioteca

Este é um projeto de sistema de gerenciamento de biblioteca que utiliza o padrão de projeto Observer para notificar os usuários sobre a disponibilidade de livros na biblioteca.

## Funcionalidades

- Adicionar livros à biblioteca.
- Remover livros da biblioteca.
- Registrar usuários.
- Notificar usuários quando um livro está disponível para empréstimo.

## Padrão de Projeto

O projeto utiliza o padrão Observer, onde a classe `Biblioteca` é o objeto observado (Subject) e os usuários (classe `Usuario`) são os observadores (Observers). Quando um livro é adicionado ou removido da biblioteca, os usuários são notificados sobre a disponibilidade atualizada de livros.

## Como Usar

1. Compile os arquivos Java no diretório `src` usando o comando `javac`. Certifique-se de ter o JDK instalado.

   javac src/br/com/biblioteca/*.java src/app/*.java

2.   Siga as instruções no terminal para interagir com o sistema de gerenciamento de biblioteca.


## CONTRIBUIÇÕES
Contribuições são bem-vindas! Se deseja contribuir para o projeto, sinta-se à vontade para abrir um problema ou enviar um pull request.

### Licença
Este projeto está licenciado sob a MIT License.