package dao;

import model.Conexao;
import model.Pedidos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public void deletePedido(Pedidos pedidos) {
        String sql = "DELETE FROM pedidos WHERE id = ?";

        try (Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, pedidos.getId());
            stmt.executeUpdate();

            System.out.println("Pedido " + pedidos.getId() + " deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Pedidos> listar(){
        String sql = "SELECT id, cliente, data_pedido, total FROM pedidos";
        List<Pedidos> pedidos = new ArrayList<>();

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String cliente = rs.getString("cliente");
                String dataPedido = rs.getString("data_pedido");
                double total = rs.getDouble("total");

                Pedidos pedido = new Pedidos(id, cliente, dataPedido, total);
                pedidos.add(pedido);

            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        return  pedidos;
    }

    public static Pedidos listarPorId(int id){
        String sql = "SELECT id, cliente, data_pedido, total FROM pedidos WHERE id = ?";
        int newId = 0;
        String cliente = "";
        String dataPedido = "";
        double total = 0;

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()){
                newId = rs.getInt("id");
                cliente = rs.getString("cliente");
                dataPedido = rs.getString("data_pedido");
                total = rs.getDouble("total");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return new Pedidos(newId, cliente, dataPedido, total);
    }
}
