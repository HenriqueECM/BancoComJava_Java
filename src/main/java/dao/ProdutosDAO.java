package dao;

import model.Conexao;
import model.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutosDAO {

    public void inserir (Produtos produtos) {
        String sql = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produtos.getNome());
            stmt.setDouble(2, produtos.getPreco());
            stmt.setInt(3, produtos.getQuantidade());
            stmt.executeUpdate();

            System.out.println("Produtos inseridos com sucesso!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarPreco(Produtos produtos) {
        String sql = "UPDATE produtos SET preco = ? WHERE nome = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, produtos.getPreco());
            stmt.setString(2, produtos.getNome());
            stmt.executeUpdate();

            System.out.println("Preço atualizado com sucesso");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deletarProduto(Produtos produtos){
        String sql = "DELETE FROM produtos WHERE nome = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, produtos.getNome());
            stmt.executeUpdate();

            System.out.println("Produto " + produtos.getNome() + " deletado com sucesso!");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static List<Produtos> listar(){
        String sql = "SELECT id, nome, preco, quantidade FROM produtos";
        List<Produtos> produtos = new ArrayList<>();

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double preco = rs.getDouble("preco");
                int quantidade = rs.getInt("quantidade");

                Produtos produto = new Produtos(id, nome, preco, quantidade);
                produtos.add(produto);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return  produtos;
    }

    public static Produtos listarPorId(int id){
        String sql = "SELECT id, nome, preco, quantidade FROM produtos WHERE id = ?";
        int newId = 0;
        String nome = "";
        double preco = 0;
        int quantidade = 0;

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                newId = rs.getInt("id");
                nome = rs.getString("nome");
                preco = rs.getDouble("preco");
                quantidade = rs.getInt("quantidade");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return new Produtos(newId, nome, preco, quantidade);
    }
}
