package dao;

import model.Conexao;
import model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

//    public void atualizarNome(Usuario usuario) {
//        String sql = "UPDATE usuarios SET nome = ? WHERE email = ?";
//
//        try (Connection conn = Conexao.conectar();
//             PreparedStatement stmt = conn.prepareStatement(sql)) {
//            stmt.setString(1, usuario.getNome());
//            stmt.setString(2, usuario.getEmail());
//
//            System.out.println("Nome atualizado com sucesso!");
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public void deletarUserNome(Usuario usuario){
        String sql = "DELETE FROM usuarios WHERE nome = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, usuario.getNome());
            stmt.executeUpdate();

            System.out.println("Usuário " + usuario.getNome() + " deletado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static List<Usuario> listar() {
        // SQL que será executado no banco de dados / fazendo que ele busque todos usuarios preenchidos
        String sql = "SELECT id,nome,email FROM usuarios WHERE nome IS NOT NULL AND email IS NOT NULL";

        // Lista onde serão armazenados os usuários retornados
        List<Usuario> usuarios = new ArrayList<>();

        // Bloco try-with-resources para garantir que a conexão e o statement sejam fechados corretamente
        try (Connection conn = Conexao.conectar(); // Abre conexão com o banco

             // Prepara o comando SQL para ser executado
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Executa a consulta e recebe os resultados em um ResultSet
            ResultSet rs = stmt.executeQuery();

            // Percorre cada linha retornada pelo SELECT
            while (rs.next()) {
                // Lê os dados da linha atual (valores das colunas)
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");

                Usuario usuario = new Usuario(id, nome, email); // Cria um objeto Usuario com os dados da linha
                usuarios.add(usuario); // Adiciona o usuário à lista
            }
        } catch (SQLException e) {
            // Em caso de erro na conexão ou na execução da query, imprime a stack trace
            e.printStackTrace();
        }
        return usuarios; // Retorna a lista de usuários obtida da consulta
    }

    public static Usuario listarPorId(int id) {
        String sql = "SELECT id, nome, email FROM usuarios WHERE id = ?";
        int newId = 0;
        String nome = "";
        String email = "";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                newId = rs.getInt("id");
                nome = rs.getString("nome");
                email = rs.getString("email");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new Usuario(newId, nome, email);
    }
}
