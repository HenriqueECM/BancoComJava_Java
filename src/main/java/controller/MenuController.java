package controller;

import dao.UsuarioDAO;

import java.util.Scanner;
import service.Gerenciamento;

public class MenuController {

    private static Scanner sc = new Scanner(System.in);
    Gerenciamento gerenciamento = new Gerenciamento();

    public void menu(){
        int opcao;

        do {
            System.out.println("""
                    === MENU DO SISTEMA ===
                    
                    1. CADASTRO
                    2. LISTAR CADASTRO
                    3. SAIR
                    
                    Escolha uma opção: 
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
                    System.out.println("Sistema Encerrado!");
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
                    
                    Escolha uma opção: 
                    """);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: gerenciamento.cadastroUsuario(sc); break;
                case 2:  break;
                case 3:  break;
                case 4:  break;
                case 5:  break;
                case 6:  break;
                case 7:
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        }while(opcao != 7);
    }
}
