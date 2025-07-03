package dao;

import model.Conexao;
import model.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutosDAO {
    public void inserir (Produtos produtos) throws SQLException {
        String sql = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produtos.getNome());
            stmt.setDouble(2, produtos.getPreco());
            stmt.setInt(3, produtos.getQuantidade());

            System.out.println("Produtos inseridos com sucesso!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
