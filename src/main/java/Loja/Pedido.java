/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loja;

/**
 *
 * @author dcarv
 */
import java.util.ArrayList;
public class Pedido {
    private String dataDeCriacao;
    private String status;
    private double total;
    private Cliente cliente;
    private ArrayList<PedidoItem> ListaDeProdutos = new ArrayList();
    
    public void addItens(PedidoItem pedidoItem){
        this.ListaDeProdutos.add(pedidoItem);
    }
    
    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Produto removeItens(PedidoItem pedidoItem) throws Exception {
        int id = this.ListaDeProdutos.indexOf(pedidoItem);
        PedidoItem produtoRemovido = this.ListaDeProdutos.get(id);
        this.ListaDeProdutos.remove(id);
        return produtoRemovido.getProduto();
    }
    
    public double CalcularValorTotal(PedidoItem pedidoItem){
        int id = this.ListaDeProdutos.indexOf(pedidoItem);
        PedidoItem valorTotal = this.ListaDeProdutos.get(id);
        for (int i = 0; i <= this.ListaDeProdutos.size(); i++) {
           total = total + valorTotal.getSubtotal();
        }
        return total;
    }
}
