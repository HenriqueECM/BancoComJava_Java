package service;

import dao.*;
import model.*;

import java.util.List;
import java.util.Scanner;

public class Gerenciamento {

    private UsuarioDAO user = new UsuarioDAO();
    private AlunoDAO alunos = new AlunoDAO();
    private ProdutosDAO produtos = new ProdutosDAO();
    private PedidosDAO pedidos = new PedidosDAO();
    private LivrosDAO livros = new LivrosDAO();
    private FuncionarioDAO funcionarios = new FuncionarioDAO();

    public void cadastroUsuario(Scanner sc) {

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

    public void cadastroProduto(Scanner sc) {
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

    public void cadastroPedido(Scanner sc) {
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

    public void cadastroLivro(Scanner sc) {
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

    public void cadastroFuncionario(Scanner sc) {
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

    public void atualizarUsuarioEmail(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite nome do usuario que quer atualizar: ");
        String nome = sc.nextLine();

        System.out.println("Digite novo email: ");
        String email = sc.nextLine();

        Usuario usuario = new Usuario(nome, email);

        user.atualizarEmail(usuario);
    }

    public void atualizarAlunoCurso(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite a matrícula do aluno que quer atualizar: ");
        String matricula = sc.nextLine();

        System.out.println("Digite novo curso: ");
        String curso = sc.nextLine();

        Aluno aluno = new Aluno("", matricula, curso);

        alunos.atualizarCurso(aluno);
    }

    public void atualizarProdutoPreco(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite nome do produto que quer atualizar: ");
        String nome = sc.nextLine();

        System.out.println("Digite novo preço do produto: ");
        double preco = sc.nextDouble();

        Produtos produto = new Produtos(nome, preco, 0);

        produtos.atualizarPreco(produto);
    }

    public void atualizarPedidosValor(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite id do pedido que quer atualizar: ");
        int id = sc.nextInt();

        System.out.println("Digite novo valor total do pedido: ");
        double valor = sc.nextDouble();

        Pedidos pedido = new Pedidos(id, "", "", valor);
        pedidos.atualizarValor(pedido);
    }

    public void atualizarLivroAutor(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite o titulo que quer atualizar: ");
        String titulo = sc.nextLine();

        System.out.println("Digite novo autor do livro: ");
        String autor = sc.nextLine();

        Livros livro = new Livros(titulo, autor, 0);
        livros.atualizarAutor(livro);
    }

    public void atualizarFuncionarioSalario(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite o nome que quer atualizar: ");
        String nome = sc.nextLine();

        System.out.println("Digite novo salario do funcionario " + nome + ": ");
        double salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, "", salario);
        funcionarios.atualizarSalario(funcionario);
    }

    public void deletarUsuarioNome(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite nome do usuario que deseja deletar: ");
        String nome = sc.nextLine();

        Usuario usuario = new Usuario(nome, "");
        user.deletarUserNome(usuario);
    }

    public void deletarAlunoMatricula(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite matricula do aluno que deseja deletar: ");
        String matricula = sc.nextLine();

        Aluno aluno = new Aluno("", matricula, "");
        alunos.deletarAluno(aluno);
    }

    public void deletarProdutoNome(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite nome do produto que deseja deletar: ");
        String nome = sc.nextLine();

        Produtos produto = new Produtos(nome, 0, 0);
        produtos.deletarProduto(produto);
    }

    public void deletarPedidoId(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite id do pedido que deseja deletar: ");
        int id = sc.nextInt();

        Pedidos pedido = new Pedidos(id, "", "", 0);
        pedidos.deletePedido(pedido);
    }

    public void deletarLivroTitulo(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite o titulo do livro que deseja deletar: ");
        String titulo = sc.nextLine();

        Livros livro = new Livros(titulo, "", 0);
        livros.deleteLivro(livro);
    }

    public void deletarFuncionarioNome(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite nome do funcionario que deseja deletar: ");
        String nome = sc.nextLine();

        Funcionario funcionario = new Funcionario(nome, "", 0);
        funcionarios.deleteFuncionario(funcionario);
    }

    public void listarTodosUsuario() {
        List<Usuario> lista = UsuarioDAO.listar();
        for (Usuario usuario : lista) {
            System.out.println("ID: " + usuario.getId() + " | NOME: " + usuario.getNome()
                    + " | EMAIL: " + usuario.getEmail());
        }
    }

    public void buscarIdUsuario(Scanner sc) {
        System.out.println("Digite o ID do usuário que deseja buscar: ");
        int id = sc.nextInt();

        Usuario usuario = UsuarioDAO.listarPorId(id);
        System.out.println("\nID: " + usuario.getId() + " | NOME: " + usuario.getNome() + " | EMAIL: " + usuario.getEmail());
    }

    public void listarTodosAlunos() {
        List<Aluno> lista = AlunoDAO.listar();
        for (Aluno aluno : lista) {
            System.out.println("ID: " + aluno.getId() + " | NOME: " + aluno.getNome() + " | MATRICULA: " + aluno.getMatricula() + " | CURSO: " + aluno.getCurso());
        }
    }

    public void buscarIdAluno(Scanner sc) {
        System.out.println("Digite o ID do aluno que deseja buscar: ");
        int id = sc.nextInt();

        Aluno aluno = AlunoDAO.listarPorId(id);

        System.out.println("\nID: " + aluno.getId() + " | NOME: " + aluno.getNome() + " | MATRICULA: " + aluno.getMatricula() + " | CURSO: " + aluno.getCurso());
    }

    public void listarTodosProduto() {
        List<Produtos> lista = ProdutosDAO.listar();

        for (Produtos produto : lista) {
            System.out.println("ID: " + produto.getId() + " | NOME: " + produto.getNome() + " | PREÇO: " + produto.getPreco() + " | QUANTIDADE: " + produto.getQuantidade());
        }
    }

    public void buscarIdProduto(Scanner sc) {
        System.out.println("Digite o ID do produto que deseja buscar: ");
        int id = sc.nextInt();

        Produtos produto = ProdutosDAO.listarPorId(id);

        System.out.println("\nID: " + produto.getId() + " | NOME: " + produto.getNome() + " | PREÇO: " + produto.getPreco() + " | QUANTIDADE: " + produto.getQuantidade());
    }

    public void listarTodosPedido() {
        List<Pedidos> lista = PedidosDAO.listar();
        for (Pedidos pedido : lista) {
            System.out.println("ID: " + pedido.getId() + " | NOME: " + pedido.getCliente() + " | DATA PEDIDO: " + pedido.getDataPedido() + " | TOTAL: " + pedido.getTotal());
        }
    }

    public void buscarIdPedido(Scanner sc) {
        System.out.println("Digite o ID do pedido que deseja buscar: ");
        int id = sc.nextInt();

        Pedidos pedido = PedidosDAO.listarPorId(id);

        System.out.println("\nID: " + pedido.getId() + " | NOME: " + pedido.getCliente() + " | DATA PEDIDO: " + pedido.getDataPedido() + " | TOTAL: " + pedido.getTotal());
    }

    public void listarTodosFuncionario() {
        List<Funcionario> lista = FuncionarioDAO.listar();
        for (Funcionario funcionario : lista) {
            System.out.println("ID: " + funcionario.getId() + " | NOME: " + funcionario.getNome() + " | CARGO: " + funcionario.getCargp() + " | SALÁRIO: " + funcionario.getSalario());
        }
    }

    public void buscarIdFuncionario(Scanner sc){
        System.out.println("Digite ID do funcionário que deseja buscar: ");
        int id = sc.nextInt();

        Funcionario funcionario = FuncionarioDAO.listarPorId(id);

        System.out.println("\nID: " + funcionario.getId() + " | NOME: " + funcionario.getNome() + " | CARGO: " + funcionario.getCargp() + " | SALÁRIO: " + funcionario.getSalario());
    }

    public void listarTodosLivro(){
        List<Livros> lista = LivrosDAO.listar();
        for (Livros livro : lista){
            System.out.println("ID: " + livro.getId() + " | TITULO: " + livro.getTitulo() + " | AUTOR: " + livro.getAutor() + " | ANO DE PUBLICAÇÃO: " + livro.getAnoPublicacao());
        }
    }

    public void buscarIdLivro(Scanner sc){
        System.out.println("Digite ID do livro que deseja buscar: ");
        int id = sc.nextInt();

        Livros livro = LivrosDAO.listarPorId(id);
        System.out.println("ID: " + livro.getId() + " | TITULO: " + livro.getTitulo() + " | AUTOR: " + livro.getAutor() + " | ANO DE PUBLICAÇÃO: " + livro.getAnoPublicacao());
    }
}