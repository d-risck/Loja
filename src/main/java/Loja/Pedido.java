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
    private ArrayList<PedidoItem> itens = new ArrayList();
    
    public void addItens(Produto produto, int quantidade){
        PedidoItem pi = new PedidoItem(produto, quantidade);
        this.itens.add(pi);
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
    
    public PedidoItem removeItens(Produto produto, int quantidade) {
        PedidoItem item = new PedidoItem(produto, 2);
        if (this.itens.contains(item)){
            this.itens.remove(item);
        }
        return item;
    }
    
    public double CalcularValorTotal(){
        double total = 0;
        for (PedidoItem item: itens) {
           total += item.getSubtotal() ;
        }
        return total;
    }
}
