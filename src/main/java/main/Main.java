package main;

import dao.UsuarioDAO;
import model.Usuario;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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

    public void menu(){

    }

}