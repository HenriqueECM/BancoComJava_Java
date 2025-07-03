package org.example;

public class Usuario {
    private String nome, email;

    public Usuario(String nome, String email) {
        this.email = email;
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

}