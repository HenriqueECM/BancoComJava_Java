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
                    3. ATUALIZAR CADASTRO
                    4. SAIR
                    
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
                    atualizarCadastro();
                case 4:
                    System.out.println("Saindo do sistema...");
                    System.out.println("Sistema Encerrado!");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        } while (opcao != 4);
    }

    private void atualizarCadastro() {
        int opcao;

        do {
            System.out.println("""
                    === ATUALIZAR CADASTROS ===
                    
                    1. Atualizar Usuário
                    2. Atualizar Aluno
                    3. Atualizar Funcionario
                    4. Atualizar Produtos
                    5. Atualizar Pedidos
                    6. Atualizar Livros
                    7. Sair
                    
                    Escolha uma opção: 
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1: atualizarUsuario(); break;
                case 2: atualizarAluno(); break;
                case 3: atualizarFuncionario(); break;
                case 4: atualizarProdutos(); break;
                case 5: atualizarPedidos(); break;
                case 6: atualizarLivros(); break;
                case 7:
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente Novamente.");
            }
        } while(opcao != 7);
    }

    private void atualizarLivros() {
    }

    private void atualizarPedidos() {
    }

    private void atualizarFuncionario() {
    }

    private void atualizarProdutos() {
        int opcao;
        do {
            System.out.println("""
                    === MENU DE ATUALIZAR PRODUTO ===
                    
                    1. Atualizar preço
                    2. Sair
                    
                    Escolha uma opção:
                    """);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: gerenciamento.atualizarProdutoPreco(sc); break;
                case 2:
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        } while(opcao != 2);
    }

    private void atualizarAluno() {
        int opcao;
        do {
            System.out.println("""
                    === MENU DE ATUALIZAR ALUNO ===
                    
                    1. Atualizar curso
                    2. Sair
                    
                    Escolha uma opção:
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1: gerenciamento.atualizarAlunoCurso(sc); break;
                case 2:
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        } while (opcao != 2);
    }

    private void atualizarUsuario() {
        int opcao;

        do {
            System.out.println("""
                    === MENU DE ATUALIZAR USUÁRIO ===
                    
                    1. Atualizar email
                    2. Sair
                    
                    Escolha uma opção: 
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1: gerenciamento.atualizarUsuarioEmail(sc); break;
                case 2:
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        }while(opcao != 2);
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
                case 2: gerenciamento.cadastroAluno(sc); break;
                case 3: gerenciamento.cadastroFuncionario(sc); break;
                case 4: gerenciamento.cadastroProduto(sc); break;
                case 5: gerenciamento.cadastroPedido(sc); break;
                case 6: gerenciamento.cadastroLivro(sc); break;
                case 7:
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        }while(opcao != 7);
    }
}
