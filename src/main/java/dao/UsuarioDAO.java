package dao;

import model.Conexao;
import model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void inserir(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.executeUpdate();

            System.out.println("Usuário inserido com sucesso!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarEmail(Usuario usuario) {
        String sql = "UPDATE usuarios SET email = ? WHERE nome = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getNome());
            stmt.executeUpdate();

            System.out.println("Email atualizado com sucesso!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarNome(Usuario usuario) {
        String sql = "UPDATE usuarios SET nome = ? WHERE email = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());

            System.out.println("Nome atualizado com sucesso!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
