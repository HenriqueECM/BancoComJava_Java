package model;

public class Funcionario {
    private String nome, cargp;
    private double salario;

    public Funcionario(double salario, String cargp, String nome) {
        this.salario = salario;
        this.cargp = cargp;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargp() {
        return cargp;
    }

    public void setCargp(String cargp) {
        this.cargp = cargp;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
