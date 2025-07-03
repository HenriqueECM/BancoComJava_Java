package model;

public class Pedidos {
    private String cliente;
    private double total;
    private String dataPedido;

    public Pedidos (String cliente, String dataPedido, double total){
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

    public String getCliente(){
        return this.cliente;
    }

    public String getDataPedido(){
        return this.dataPedido;
    }

    public double getTotal(){
        return this.total;
    }
}