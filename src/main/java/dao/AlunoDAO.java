package dao;

import model.Aluno;
import model.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public void inserir (Aluno aluno) {
        String sql = "INSERT INTO alunos (nome, matricula, curso) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getMatricula());
            stmt.setString(3, aluno.getCurso());
            stmt.executeUpdate();

            System.out.println("Aluno inserido com sucesso!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarCurso(Aluno aluno) {
        String sql = "UPDATE alunos SET curso = ? WHERE matricula = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getCurso());
            stmt.setString(2, aluno.getMatricula());
            stmt.executeUpdate();

            System.out.println("Curso atualizado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deletarAluno(Aluno aluno){
        String sql = "DELETE FROM alunos WHERE matricula = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getMatricula());
            stmt.executeUpdate();

            System.out.println("Aluno " + aluno.getNome() + " deletado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static List<Aluno> listar(){
        String sql = "SELECT id, nome, matricula, curso FROM alunos";

        List<Aluno> alunos = new ArrayList<>();

        try (Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String matricula = rs.getString("matricula");
                String curso = rs.getString("curso");

                Aluno aluno = new Aluno(id, nome, matricula, curso);
                alunos.add(aluno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    public static Aluno listarPorId(int id){
        String sql = "SELECT id, nome, matricula, curso FROM alunos WHERE id = ?";
        int newId = 0;
        String nome = "";
        String matricula = "";
        String curso = "";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()){
                newId = rs.getInt("id");
                nome = rs.getString("nome");
                matricula = rs.getString("matricula");
                curso = rs.getString("curso");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return new Aluno(newId, nome, matricula, curso);
    }
}
