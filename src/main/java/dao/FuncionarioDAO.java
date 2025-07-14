package dao;

import model.Conexao;
import model.Funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public void atualizarSalario(Funcionario funcionario){
        String sql = "UPDATE funcionarios SET salario = ? WHERE nome = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setDouble(1, funcionario.getSalario());
            stmt.setString(2, funcionario.getNome());
            stmt.executeUpdate();

            System.out.println("Salario atualizado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteFuncionario(Funcionario funcionario){
        String sql = "DELETE FROM funcionarios WHERE nome = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, funcionario.getNome());
            stmt.executeUpdate();

            System.out.println("Funcionario " + funcionario.getNome() + " deletado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static List<Funcionario> listar(){
        String sql = "SELECT id, nome, cargo, salario FROM funcionarios";
        List<Funcionario> funcionarios = new ArrayList<>();

        try (Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cargo = rs.getString("cargo");
                double salario = rs.getDouble("salario");

                Funcionario funcionario = new Funcionario(id, nome, cargo, salario);
                funcionarios.add(funcionario);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return funcionarios;
    }

    public static Funcionario listarPorId(int id){
        String sql = "SELECT id, nome, cargo, salario FROM funcionarios WHERE id = ?";
        int newId = 0;
        String nome = "";
        String cargo = "";
        double salario = 0;

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()){
                newId = rs.getInt("id");
                nome = rs.getString("nome");
                cargo = rs.getString("cargo");
                salario = rs.getDouble("salario");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return new Funcionario(newId, nome, cargo, salario);
    }
}
