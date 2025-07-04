package controller;

import dao.UsuarioDAO;

import java.util.Scanner;

public class MenuController {

    private static Scanner sc = new Scanner(System.in);
    private

    public void menu(){
        int opcao;

        do {
            System.out.println("""
                    === MENU DO SISTEMA ===
                    
                    1. CADASTRO
                    2. LISTAR CADASTRO
                    3. SAIR
                    """);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    menuCadastrar();
                    break;
                case 2:
                    listarCadastro();
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        } while (opcao != 3);
    }

    private void listarCadastro() {
    }

    private void menuCadastrar() {
        int opcao;

        do {
            System.out.println("""
                    === MENU DE CADASTRO ===
                    
                    1. Cadastrar Usuario
                    2. Cadastrar Aluno
                    3. Cadastrar Funcionario
                    4. Cadastrar Produtos
                    5. Cadastrar Pedidos
                    6. Cadastrar Livros
                    7. Sair
                    """);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: cadastroUsuario(); break;
                case 2: cadastroAluno(); break;
                case 3: cadastroFuncionario(); break;
                case 4: cadastroProduto(); break;
                case 5: cadastrarPedido(); break;
                case 6: cadastrarLivro(); break;
                case 7:
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        }while(opcao != 7);
    }
}
