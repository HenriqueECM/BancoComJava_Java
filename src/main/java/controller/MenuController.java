package controller;
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
                    4. DELETAR CADASTRO
                    5. SAIR
                    
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
                    break;
                case 4:
                    deletarCadastro();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    System.out.println("Sistema Encerrado!");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        } while (opcao != 5);
    }

    private void atualizarFuncionario() {
        int opcao;
        do {
            System.out.println("""
                    === MENU DE ATUALIZAR FUNCIONARIO ===
                    
                    1. Atualizar sálario
                    2. Sair
                    
                    Escolha uma opção:
                    """);
            opcao = sc.nextInt();
            switch (opcao){
                case 1: gerenciamento.atualizarFuncionarioSalario(sc); break;
                case 2:
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
                    break;
            }
        } while (opcao != 2);
    }

    private void atualizarLivros() {
        int opcao;
        do {
            System.out.println("""
                    === MENU DE ATUALIZAR LIVRO ===
                    
                    1. Atualizar autor
                    2. Sair
                    
                    Escolha uma opção: 
                    """);
            opcao = sc.nextInt();
            switch (opcao){
                case 1: gerenciamento.atualizarLivroAutor(sc); break;
                case 2:
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        }while(opcao != 2);
    }

    private void atualizarPedidos() {
        int opcao;
        do {
            System.out.println("""
                    === MENU DE ATUALIZAR PEDIDO ===
                    
                    1. Atualizar valor total
                    2. Sair
                    
                    Escolha uma opção:
                    """);
            opcao = sc.nextInt();
            switch (opcao){
                case 1: gerenciamento.atualizarPedidosValor(sc); break;
                case 2:
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente Novamente.");
                    break;
            }
        } while(opcao != 2);
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

    private void listarCadastro() {

    }

    private void atualizarCadastro() {
        int opcao;

        do {
            System.out.println("""
                    === MENU DE ATUALIZAR CADASTROS ===
                    
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

    private void deletarCadastro() {
        int opcao;
        do {
            System.out.println("""
                    === MENU DE DELETAR CADASTROS ===
                    
                    1. Deletar Usuário
                    2. Deletar Aluno
                    3. Deletar Funcionario
                    4. Deletar Produtos
                    5. Deletar Pedidos
                    6. Deletar Livros
                    7. Sair
                    
                    Escolha uma opção:
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1: gerenciamento.deletarUsuarioNome(sc); break;
                case 2: gerenciamento.deletarAlunoMatricula(sc); break;
                case 3: gerenciamento.deletarProdutoNome(sc); break;
                case 4: gerenciamento.deletarPedidoId(sc); break;
                case 5: gerenciamento.deletarLivroTitulo(sc); break;
                case 6: gerenciamento.deletarFuncionarioNome(sc); break;
                case 7:
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
                    break;
            }
        } while (opcao != 2);
    }
}
