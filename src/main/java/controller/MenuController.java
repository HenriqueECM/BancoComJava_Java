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

    }

    private void atualizarProduto(){

    }

    private void atualizarPedido(){

    }

    private void atualizarLivro(){

    }

    private void atualizarFuncionario(){

    }

}

//package controller;
//import java.util.Scanner;
//import service.Gerenciamento;
//public class MenuControllerr {
//
//    private static Scanner sc = new Scanner(System.in);
//    Gerenciamento gerenciamento = new Gerenciamento();
//
//    public void menu(){
//        int opcao;
//
//        do {
//            System.out.println("""
//                    === MENU DO SISTEMA ===
//
//                    1. CADASTRO
//                    2. CONSULTAR
//                    3. ATUALIZAR
//                    4. DELETAR
//                    5. SAIR
//
//                    Escolha uma opção:
//                    """);
//            opcao = sc.nextInt();
//
//            switch (opcao) {
//                case 1:
//                    menuCadastrar();
//                    break;
//                case 2:
//                    listarCadastro();
//                    break;
//                case 3:
//                    atualizarCadastro();
//                    break;
//                case 4:
//                    deletarCadastro();
//                    break;
//                case 5:
//                    System.out.println("Saindo do sistema...");
//                    System.out.println("Sistema Encerrado!");
//                    break;
//                default:
//                    System.out.println("Opção Inválida! Tente Novamente.");
//            }
//        } while (opcao != 5);
//    }
//
//    private void atualizarFuncionario() {
//        int opcao;
//        do {
//            System.out.println("""
//                    === MENU DE ATUALIZAR FUNCIONARIO ===
//
//                    1. Atualizar sálario
//                    2. Sair
//
//                    Escolha uma opção:
//                    """);
//            opcao = sc.nextInt();
//            switch (opcao){
//                case 1: gerenciamento.atualizarFuncionarioSalario(sc); break;
//                case 2:
//                    System.out.println("Retornando...");
//                    break;
//                default:
//                    System.out.println("Opção Inválida! Tente Novamente.");
//                    break;
//            }
//        } while (opcao != 2);
//    }
//
//    private void atualizarLivros() {
//        int opcao;
//        do {
//            System.out.println("""
//                    === MENU DE ATUALIZAR LIVRO ===
//
//                    1. Atualizar autor
//                    2. Sair
//
//                    Escolha uma opção:
//                    """);
//            opcao = sc.nextInt();
//            switch (opcao){
//                case 1: gerenciamento.atualizarLivroAutor(sc); break;
//                case 2:
//                    System.out.println("Retornando...");
//                    break;
//                default:
//                    System.out.println("Opção Inválida! Tente Novamente.");
//            }
//        }while(opcao != 2);
//    }
//
//    private void atualizarPedidos() {
//        int opcao;
//        do {
//            System.out.println("""
//                    === MENU DE ATUALIZAR PEDIDO ===
//
//                    1. Atualizar valor total
//                    2. Sair
//
//                    Escolha uma opção:
//                    """);
//            opcao = sc.nextInt();
//            switch (opcao){
//                case 1: gerenciamento.atualizarPedidosValor(sc); break;
//                case 2:
//                    System.out.println("Retornando...");
//                    break;
//                default:
//                    System.out.println("Opção inválida. Tente Novamente.");
//                    break;
//            }
//        } while(opcao != 2);
//    }
//
//    private void atualizarProdutos() {
//        int opcao;
//        do {
//            System.out.println("""
//                    === MENU DE ATUALIZAR PRODUTO ===
//
//                    1. Atualizar preço
//                    2. Sair
//
//                    Escolha uma opção:
//                    """);
//            opcao = sc.nextInt();
//
//            switch (opcao) {
//                case 1: gerenciamento.atualizarProdutoPreco(sc); break;
//                case 2:
//                    System.out.println("Retornando...");
//                    break;
//                default:
//                    System.out.println("Opção Inválida! Tente Novamente.");
//            }
//        } while(opcao != 2);
//    }
//
//    private void atualizarAluno() {
//        int opcao;
//        do {
//            System.out.println("""
//                    === MENU DE ATUALIZAR ALUNO ===
//
//                    1. Atualizar curso
//                    2. Sair
//
//                    Escolha uma opção:
//                    """);
//            opcao = sc.nextInt();
//
//            switch (opcao){
//                case 1: gerenciamento.atualizarAlunoCurso(sc); break;
//                case 2:
//                    System.out.println("Retornando...");
//                    break;
//                default:
//                    System.out.println("Opção Inválida! Tente Novamente.");
//            }
//        } while (opcao != 2);
//    }
//
//    private void atualizarUsuario() {
//        int opcao;
//
//        do {
//            System.out.println("""
//                    === MENU DE ATUALIZAR USUÁRIO ===
//
//                    1. Atualizar email
//                    2. Sair
//
//                    Escolha uma opção:
//                    """);
//            opcao = sc.nextInt();
//
//            switch (opcao){
//                case 1: gerenciamento.atualizarUsuarioEmail(sc); break;
//                case 2:
//                    System.out.println("Retornando...");
//                    break;
//                default:
//                    System.out.println("Opção Inválida! Tente Novamente.");
//            }
//        }while(opcao != 2);
//    }
//
//    private void menuCadastrar() {
//        int opcao;
//
//        do {
//            System.out.println("""
//                    === MENU DE CADASTRO ===
//
//                    1. Cadastrar Usuario
//                    2. Cadastrar Aluno
//                    3. Cadastrar Funcionario
//                    4. Cadastrar Produtos
//                    5. Cadastrar Pedidos
//                    6. Cadastrar Livros
//                    7. Sair
//
//                    Escolha uma opção:
//                    """);
//            opcao = sc.nextInt();
//
//            switch (opcao) {
//                case 1: gerenciamento.cadastroUsuario(sc); break;
//                case 2: gerenciamento.cadastroAluno(sc); break;
//                case 3: gerenciamento.cadastroFuncionario(sc); break;
//                case 4: gerenciamento.cadastroProduto(sc); break;
//                case 5: gerenciamento.cadastroPedido(sc); break;
//                case 6: gerenciamento.cadastroLivro(sc); break;
//                case 7:
//                    System.out.println("Retornando...");
//                    break;
//                default:
//                    System.out.println("Opção Inválida! Tente Novamente.");
//            }
//        }while(opcao != 7);
//    }
//
//    private void listarCadastro() {
//        int opcao;
//        do{
//            System.out.println("""
//                    === MENU DE BUSCA ===
//
//                    1.
//                    """);
//            opcao = sc.nextInt();
//        } while(opcao != 0);
//    }
//
//    private void atualizarCadastro() {
//        int opcao;
//
//        do {
//            System.out.println("""
//                    === MENU DE ATUALIZAR CADASTROS ===
//
//                    1. Atualizar Usuário
//                    2. Atualizar Aluno
//                    3. Atualizar Funcionario
//                    4. Atualizar Produtos
//                    5. Atualizar Pedidos
//                    6. Atualizar Livros
//                    7. Sair
//
//                    Escolha uma opção:
//                    """);
//            opcao = sc.nextInt();
//
//            switch (opcao){
//                case 1: atualizarUsuario(); break;
//                case 2: atualizarAluno(); break;
//                case 3: atualizarFuncionario(); break;
//                case 4: atualizarProdutos(); break;
//                case 5: atualizarPedidos(); break;
//                case 6: atualizarLivros(); break;
//                case 7:
//                    System.out.println("Retornando...");
//                    break;
//                default:
//                    System.out.println("Opção inválida! Tente Novamente.");
//            }
//        } while(opcao != 7);
//    }
//
//    private void deletarCadastro() {
//        int opcao;
//        do {
//            System.out.println("""
//                    === MENU DE DELETAR CADASTROS ===
//
//                    1. Deletar Usuário
//                    2. Deletar Aluno
//                    3. Deletar Produto
//                    4. Deletar Pedido
//                    5. Deletar Livro
//                    6. Deletar Funcionario
//                    7. Sair
//
//                    Escolha uma opção:
//                    """);
//            opcao = sc.nextInt();
//
//            switch (opcao){
//                case 1: gerenciamento.deletarUsuarioNome(sc); break;
//                case 2: gerenciamento.deletarAlunoMatricula(sc); break;
//                case 3: gerenciamento.deletarProdutoNome(sc); break;
//                case 4: gerenciamento.deletarPedidoId(sc); break;
//                case 5: gerenciamento.deletarLivroTitulo(sc); break;
//                case 6: gerenciamento.deletarFuncionarioNome(sc); break;
//                case 7:
//                    System.out.println("Retornando...");
//                    break;
//                default:
//                    System.out.println("Opção Inválida! Tente Novamente.");
//                    break;
//            }
//        } while (opcao != 7);
//    }
//}