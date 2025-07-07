package service;

import dao.UsuarioDAO;
import model.Usuario;

import java.util.Scanner;

public class Gerenciamento {

    private UsuarioDAO user = new UsuarioDAO();

    public void cadastroUsuario(Scanner sc){

        sc.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu email: ");
        String email = sc.nextLine();

        Usuario usuario = new Usuario(nome, email);
        user.inserir(usuario);
    }
}
