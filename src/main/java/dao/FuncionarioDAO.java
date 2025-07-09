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
}
