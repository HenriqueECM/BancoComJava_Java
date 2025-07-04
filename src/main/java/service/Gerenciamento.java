package service;

import dao.UsuarioDAO;
import model.Usuario;

import java.util.Scanner;

public class Gerenciamento {

    UsuarioDAO user = new UsuarioDAO();

    private void cadastroUsuario(){
        Scanner sc = new Scanner(System.in);

        String nome, email;

        UsuarioDAO user = new UsuarioDAO();

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite seu email: ");
        email = sc.nextLine();

        Usuario usuario = new Usuario(nome, email);

        user.inserir(usuario);
    }
}
