package model;

public class Usuario {
    private String nome, email;
    private int id;

    public Usuario(String nome, String email) {
        this.email = email;
        this.nome = nome;
    }

    public Usuario(int id, String nome, String email) {
        this.email = email;
        this.nome = nome;
        this.id = id;
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

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }
}