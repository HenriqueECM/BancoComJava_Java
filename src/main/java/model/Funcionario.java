package model;

public class Funcionario {
    private String nome, cargo;
    private double salario;
    private int id;

    public Funcionario(int id, String nome, String cargo, double salario) {
        this.salario = salario;
        this.cargo = cargo;
        this.nome = nome;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargp() {
        return cargo;
    }

    public void setCargp(String cargp) {
        this.cargo = cargp;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
