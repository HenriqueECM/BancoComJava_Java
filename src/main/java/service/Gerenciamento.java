package service;

import dao.*;
import model.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Gerenciamento {

    private UsuarioDAO user = new UsuarioDAO();
    private AlunoDAO alunos = new AlunoDAO();
    private ProdutosDAO produtos = new ProdutosDAO();
    private PedidosDAO pedidos = new PedidosDAO();
    private LivrosDAO livros = new LivrosDAO();
    private FuncionarioDAO funcionarios = new FuncionarioDAO();

    public void cadastroUsuario(Scanner sc){

        sc.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu email: ");
        String email = sc.nextLine();

        Usuario usuario = new Usuario(nome, email);
        user.inserir(usuario);
    }

    public void cadastroAluno(Scanner sc) {

        sc.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua matricula: ");
        String matricula = sc.nextLine();

        System.out.println("Digite seu curso: ");
        String curso = sc.nextLine();

        Aluno aluno = new Aluno(nome, matricula, curso);
        alunos.inserir(aluno);
    }

    public void cadastroProduto(Scanner sc){
        sc.nextLine();

        System.out.println("Digite nome do produto: ");
        String nome = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();

        Produtos produto = new Produtos(nome, preco, quantidade);
        produtos.inserir(produto);
    }

    public  void cadastroPedido (Scanner sc){
        sc.nextLine();

        System.out.println("Digite o cliente do pedido: ");
        String cliente = sc.nextLine();

        System.out.println("Digite a data do pedido (dd/mm/yyyy): ");
        String data = sc.nextLine();

        System.out.println("Digite o total do pedido: ");
        double total = sc.nextDouble();

        Pedidos pedido = new Pedidos(cliente, data, total);
        pedidos.inserir(pedido);
    }

    public void cadastroLivro (Scanner sc) {
        sc.nextLine();

        System.out.println("Digite titulo do livro: ");
        String titulo = sc.nextLine();

        System.out.println("Digite autor do livro: ");
        String autor = sc.nextLine();

        System.out.println("Digite ano da publicação do livro: ");
        int ano = sc.nextInt();

        Livros livro = new Livros(titulo, autor, ano);
        livros.inserir(livro);
    }

    public void cadastroFuncionario (Scanner sc) {
        sc.nextLine();

        System.out.println("Digite nome do funcionario: ");
        String nome = sc.nextLine();

        System.out.println("Digite cargo do funcionario: ");
        String cargo = sc.nextLine();

        System.out.println("Digite salario do funcionario: ");
        double salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, cargo, salario);
        funcionarios.inserir(funcionario);
    }

    public void atualizarUsuarioEmail(Scanner sc){
        sc.nextLine();

        System.out.println("Digite nome do usuario que quer atualizar: ");
        String nome = sc.nextLine();

        System.out.println("Digite novo email: ");
        String email = sc.nextLine();

        Usuario usuario = new Usuario(nome, email);

        user.atualizarEmail(usuario);
    }

    public void atualizarAlunoCurso(Scanner sc){
        sc.nextLine();

        System.out.println("Digite a matrícula do aluno que quer atualizar: ");
        String matricula = sc.nextLine();

        System.out.println("Digite novo curso: ");
        String curso = sc.nextLine();

        Aluno aluno = new Aluno("",matricula, curso);

        alunos.atualizarCurso(aluno);
    }

    public void atualizarProdutoPreco(Scanner sc){
        sc.nextLine();

        System.out.println("Digite nome do produto que quer atualizar: ");
        String nome = sc.nextLine();

        System.out.println("Digite novo preço do produto: ");
        double preco = sc.nextDouble();

        Produtos produto = new Produtos(nome, preco, 0);

        produtos.atualizarPreco(produto);
    }

    public void atualizarPedidosValor(Scanner sc){
        sc.nextLine();

        System.out.println("Digite id do pedido que quer atualizar: ");
        int id = sc.nextInt();

        System.out.println("Digite novo valor total do pedido: ");
        double valor = sc.nextDouble();

        Pedidos pedido = new Pedidos(id, "", "", valor);
        pedidos.atualizarValor(pedido);
    }

    public void atualizarLivroAutor(Scanner sc){
        sc.nextLine();

        System.out.println("Digite o titulo que quer atualizar: ");
        String titulo = sc.nextLine();

        System.out.println("Digite novo autor do livro: ");
        String autor = sc.nextLine();

        Livros livro = new Livros(titulo, autor, 0);
        livros.atualizarAutor(livro);
    }

    public void atualizarFuncionarioSalario(Scanner sc){
        sc.nextLine();

        System.out.println("Digite o nome que quer atualizar: ");
        String nome = sc.nextLine();

        System.out.println("Digite novo salario do funcionario " + nome + ": ");
        double salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, "", salario);
        funcionarios.atualizarSalario(funcionario);
    }

    public void deletarUsuarioNome(Scanner sc){
        sc.nextLine();

        System.out.println("Digite nome do usuario que deseja deletar: ");
        String nome = sc.nextLine();

        Usuario usuario = new Usuario(nome, "");
        user.deletarUserNome(usuario);
    }

    public void deletarAlunoMatricula(Scanner sc){
        sc.nextLine();

        System.out.println("Digite matricula do aluno que deseja deletar: ");
        String matricula = sc.nextLine();

        Aluno aluno = new Aluno("", matricula, "");
        alunos.deletarAluno(aluno);
    }

    public void deletarProdutoNome(Scanner sc){
        sc.nextLine();

        System.out.println("Digite nome do produto que deseja deletar: ");
        String nome = sc.nextLine();

        Produtos produto = new Produtos(nome, 0, 0);
        produtos.deletarProduto(produto);
    }

    public void deletarPedidoId(Scanner sc){

    }

    public void deletarLivroTitulo(Scanner sc){

    }

    public void deletarFuncionarioNome(Scanner sc){

    }
}
