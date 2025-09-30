package com.mycompany.projetolancha5.modelos;

import java.util.List;

public class Carrinho {
    
    private int id;
    private List<Produto> produtos;
    private Double subTotal;
    private int quantidade;
    private Venda venda;

    public Carrinho() {
    }
    
    

    public Carrinho(List<Produto> produtos, Double subTotal, int quantidade, Venda venda) {
        this.produtos = produtos;
        this.subTotal = subTotal;
        this.quantidade = quantidade;
        this.venda = venda;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
