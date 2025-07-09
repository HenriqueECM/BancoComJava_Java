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
}
