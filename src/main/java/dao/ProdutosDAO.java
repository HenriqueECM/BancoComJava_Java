package dao;

import model.Conexao;
import model.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
