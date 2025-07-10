package controller;
import java.util.Scanner;
import service.Gerenciamento;

public class MenuController {

    private static Scanner sc = new Scanner(System.in);
    Gerenciamento gerenciamento = new Gerenciamento();

    public void menu(){
        int opcao;
        do{
            System.out.println("""
                    \n=== MENU DO SISTEMA ===
                    
                    1. USUÁRIO
                    2. ALUNO
                    3. PRODUTO
                    4. PEDIDO
                    5. LIVRO
                    6. FUNCIONARIO
                    7. SAIR
                    
                    ESCOLHA UMA ENTIDADE:
                    """);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: menuUsuario(); break;
                case 2: menuAluno(); break;
                case 3: menuProduto(); break;
                case 4: menuPedido(); break;
                case 5: menuLivro(); break;
                case 6: menuFuncionario(); break;
                case 7:
                    System.out.println("Encerrando o Sistema...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente Mais Tarde.");
                    break;
            }
        } while(opcao != 7);
    }

    private void menuUsuario() {
        int opcao;
        do {
            System.out.println("""
                    \n=== MENU USUÁRIO ===
                    
                    1. CADASTRAR
                    2. CONSULTAR
                    3. ATUALIZAR
                    4. DELETAR
                    5. VOLTAR
                    
                    ESCOLHA UMA OPERAÇÃO DO SISTEMA:
                    """);
            opcao = sc.nextInt();
            switch (opcao){
                case 1: gerenciamento.cadastroUsuario(sc); break;
                case 2: break;
                case 3: atualizarUsuario(); break;
                case 4: gerenciamento.deletarUsuarioNome(sc); break;
                case 5:
                    System.out.println("\nRETORNANDO...");
            }
        } while (opcao != 5);
    }

    private void menuAluno() {
        int opcao;
        do {
            System.out.println("""
                    \n=== MENU ALUNO ===
                    
                    1. CADASTRAR
                    2. CONSULTAR
                    3. ATUALIZAR
                    4. DELETAR
                    5. VOLTAR
                    
                    ESCOLHA UMA OPERAÇÃO DO SISTEMA:
                    """);
            opcao = sc.nextInt();
            switch (opcao){
                case 1: gerenciamento.cadastroAluno(sc); break;
                case 2: break;
                case 3: atualizarAluno(); break;
                case 4: gerenciamento.deletarAlunoMatricula(sc); break;
                case 5:
                    System.out.println("\nRETORNANDO...");
            }
        } while (opcao != 5);
    }

    private void menuProduto() {
        int opcao;
        do {
            System.out.println("""
                    \n=== MENU PRODUTO ===
                    
                    1. CADASTRAR
                    2. CONSULTAR
                    3. ATUALIZAR
                    4. DELETAR
                    5. VOLTAR
                    
                    ESCOLHA UMA OPERAÇÃO DO SISTEMA:
                    """);
            opcao = sc.nextInt();
            switch (opcao){
                case 1: gerenciamento.cadastroProduto(sc); break;
                case 2: break;
                case 3: atualizarProduto(); break;
                case 4: gerenciamento.deletarProdutoNome(sc); break;
                case 5:
                    System.out.println("\nRETORNANDO...");
            }
        } while (opcao != 5);
    }

    private void menuPedido() {
        int opcao;
        do {
            System.out.println("""
                    \n=== MENU PEDIDO ===
                    
                    1. CADASTRAR
                    2. CONSULTAR
                    3. ATUALIZAR
                    4. DELETAR
                    5. VOLTAR
                    
                    ESCOLHA UMA OPERAÇÃO DO SISTEMA:
                    """);
            opcao = sc.nextInt();
            switch (opcao){
                case 1: gerenciamento.cadastroUsuario(sc); break;
                case 2: break;
                case 3: atualizarPedido(); break;
                case 4: gerenciamento.deletarUsuarioNome(sc); break;
                case 5:
                    System.out.println("\nRETORNANDO...");
            }
        } while (opcao != 5);
    }

    private void menuLivro() {
        int opcao;
        do {
            System.out.println("""
                    \n=== MENU LIVRO ===
                    
                    1. CADASTRAR
                    2. CONSULTAR
                    3. ATUALIZAR
                    4. DELETAR
                    5. VOLTAR
                    
                    ESCOLHA UMA OPERAÇÃO DO SISTEMA:
                    """);
            opcao = sc.nextInt();
            switch (opcao){
                case 1: gerenciamento.cadastroLivro(sc); break;
                case 2: break;
                case 3: atualizarLivro(); break;
                case 4: gerenciamento.deletarLivroTitulo(sc); break;
                case 5:
                    System.out.println("\nRETORNANDO...");
            }
        } while (opcao != 5);
    }

    private void menuFuncionario() {
        int opcao;
        do {
            System.out.println("""
                    \n=== MENU USUÁRIO ===
                    
                    1. CADASTRAR
                    2. CONSULTAR
                    3. ATUALIZAR
                    4. DELETAR
                    5. VOLTAR
                    
                    ESCOLHA UMA OPERAÇÃO DO SISTEMA:
                    """);
            opcao = sc.nextInt();
            switch (opcao){
                case 1: gerenciamento.cadastroFuncionario(sc); break;
                case 2: break;
                case 3: atualizarFuncionario(); break;
                case 4: gerenciamento.deletarFuncionarioNome(sc); break;
                case 5:
                    System.out.println("\nRetornando...");
            }
        } while (opcao != 5);
    }

    private void atualizarUsuario() {
        int opcao;

        do {
            System.out.println("""
                    \n=== MENU DE ATUALIZAR USUÁRIO ===
                    
                    1. Atualizar email
                    2. Voltar
                    
                    ESCOLHA UMA OPERAÇÃO DO SISTEMA:
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1: gerenciamento.atualizarUsuarioEmail(sc); break;
                case 2: // colocar atualizar nome
                    System.out.println("RETORNANDO...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        }while(opcao != 2);
    }

    private void atualizarAluno(){
        int opcao;

        do {
            System.out.println("""
                    \n=== MENU ATUALIZAR ALUNO ===
                    
                    1. Atualizar curso
                    2. Voltar
                    
                    ESCOLHA UMA OPERAÇÃO DO SISTEMA:
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1: gerenciamento.atualizarAlunoCurso(sc); break;
                case 2: // colocar atualizar nome
                    System.out.println("RETORNANDO...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        }while(opcao != 2);
    }

    private void atualizarProduto(){
        int opcao;

        do {
            System.out.println("""
                    \n=== MENU ATUALIZAR PRODUTO ===
                    
                    1. Atualizar Preço
                    2. Voltar
                    
                    ESCOLHA UMA OPERAÇÃO DO SISTEMA:
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1: gerenciamento.atualizarProdutoPreco(sc); break;
                case 2: // colocar atualizar nome
                    System.out.println("RETORNANDO...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        }while(opcao != 2);
    }

    private void atualizarPedido(){
        int opcao;

        do {
            System.out.println("""
                    \n=== MENU ATUALIZAR PEDIDO ===
                    
                    1. Atualizar Valor Total
                    2. Voltar
                    
                    ESCOLHA UMA OPERAÇÃO DO SISTEMA:
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1: gerenciamento.atualizarPedidosValor(sc); break;
                case 2: // colocar atualizar nome
                    System.out.println("RETORNANDO...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        }while(opcao != 2);
    }

    private void atualizarLivro(){
        int opcao;

        do {
            System.out.println("""
                    \n=== MENU ATUALIZAR LIVRO ===
                    
                    1. Atualizar Autor
                    2. Voltar
                    
                    ESCOLHA UMA OPERAÇÃO DO SISTEMA:
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1: gerenciamento.atualizarLivroAutor(sc); break;
                case 2: // colocar atualizar nome
                    System.out.println("RETORNANDO...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        }while(opcao != 2);
    }

    private void atualizarFuncionario(){
        int opcao;

        do {
            System.out.println("""
                    \n=== MENU ATUALIZAR PRODUTO ===
                    
                    1. Atualizar Salario
                    2. Voltar
                    
                    ESCOLHA UMA OPERAÇÃO DO SISTEMA:
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1: gerenciamento.atualizarFuncionarioSalario(sc); break;
                case 2: // colocar atualizar nome
                    System.out.println("RETORNANDO...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        }while(opcao != 2);
    }
}