package model;

public class Pedidos {
    private int id;
    private String cliente;
    private double total;
    private String dataPedido;

    public Pedidos (String cliente, String dataPedido, double total){
        this.dataPedido = dataPedido;
        this.total = total;
        this.cliente = cliente;
    }

    public Pedidos (int id, String cliente, String dataPedido, double total){
        this.id = id;
        this.dataPedido = dataPedido;
        this.total = total;
        this.cliente = cliente;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public void setTotal(double total){
        this.total = total;
    }

    public void setDataPedido(String dataPedido){
        this.dataPedido = dataPedido;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCliente(){
        return this.cliente;
    }

    public String getDataPedido(){
        return this.dataPedido;
    }

    public double getTotal(){
        return this.total;
    }

    public int getId(){
        return this.id;
    }
}