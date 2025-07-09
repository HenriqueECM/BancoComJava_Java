package dao;

import model.Conexao;
import model.Funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {
    public void inserir(Funcionario funcionario){
        String sql = "INSERT INTO funcionarios (nome, cargo, salario) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1,funcionario.getNome());
            stmt.setString(2, funcionario.getCargp());
            stmt.setDouble(3, funcionario.getSalario());
            stmt.executeUpdate();

            System.out.println("Funcionario inserido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarSalario(Funcionario funcionario){
        String sql = "UPDATE funcionarios SET salario = ? WHERE nome = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setDouble(1, funcionario.getSalario());
            stmt.setString(2, funcionario.getNome());
            stmt.executeUpdate();

            System.out.println("Salario atualizado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteFuncionario(Funcionario funcionario){
        String sql = "DELETE FROM funcionarios WHERE nome = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, funcionario.getNome());
            stmt.executeUpdate();

            System.out.println("Funcionario " + funcionario.getNome() + " deletado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
