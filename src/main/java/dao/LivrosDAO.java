package dao;

import model.Conexao;
import model.Livros;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class LivrosDAO {

    public void inserir(Livros livros){
        String sql = "INSERT INTO livros (titulo, autor, ano_publicacao) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livros.getTitulo());
            stmt.setString(2, livros.getAutor());
            stmt.setInt(3, livros.getAnoPublicacao());
            stmt.executeUpdate();

            System.out.println("Livro inserido com sucesso!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarAutor(Livros livros){
        String sql = "UPDATE livros SET autor = ? WHERE titulo = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, livros.getAutor());
            stmt.setString(2, livros.getTitulo());
            stmt.executeUpdate();

            System.out.println("Autor atualizado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteLivro(Livros livros){
        String sql = "DELETE FROM livros WHERE titulo = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, livros.getTitulo());
            stmt.executeUpdate();

            System.out.println("Livro " + livros.getTitulo() + " deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Livros> listar(){
        String sql = "SELECT id, titulo, autor, ano_publicacao FROM livros";
        List<Livros> livros = new ArrayList<>();

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                int anoPublicacao = rs.getInt("ano_publicacao");

                Livros livro = new Livros(id, titulo, autor, anoPublicacao);
                livros.add(livro);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return livros;
    }

    public static Livros listarPorId(int id){
        String sql = "SELECT id, titulo, autor, ano_publicacao FROM livros WHERE id = ?";
        int newId = 0;
        String titulo = "";
        String autor = "";
        int anoPublicacao = 0;

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()){
                newId = rs.getInt("id");
                titulo = rs.getString("titulo");
                autor = rs.getString("autor");
                anoPublicacao = rs.getInt("ano_publicacao");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return new Livros(newId, titulo, autor, anoPublicacao);
    }
}
