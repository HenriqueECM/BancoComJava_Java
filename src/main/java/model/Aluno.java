package model;

public class Aluno {
    private String nome, matricula, curso;
    private int id;

    public Aluno(String nome, String matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(int id, String nome, String matricula, String curso){
        this.curso = curso;
        this.nome = nome;
        this.matricula = matricula;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}
