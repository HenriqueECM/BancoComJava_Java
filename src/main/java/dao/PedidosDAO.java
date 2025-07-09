package dao;

import model.Conexao;
import model.Pedidos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidosDAO {
    public void inserir(Pedidos pedidos){
        String sql = "INSERT INTO pedidos (cliente, data_pedido, total) VALUES (?,?,?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pedidos.getCliente());
            stmt.setString(2, pedidos.getDataPedido());
            stmt.setDouble(3, pedidos.getTotal());
            stmt.executeUpdate();

            System.out.println("Pedido inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarValor(Pedidos pedidos) {
        String sql = "UPDATE pedidos SET total = ? WHERE id = ?";

        try (Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setDouble(1, pedidos.getTotal());
            stmt.setInt(2, pedidos.getId());
            stmt.executeUpdate();

            System.out.println("Valor total atualizado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
