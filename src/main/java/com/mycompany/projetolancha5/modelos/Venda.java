package com.mycompany.projetolancha5.modelos;

import com.mycompany.projetolancha5.modelos.enums.CategoriaVenda;
import com.mycompany.projetolancha5.modelos.enums.Status;

public class Venda {
    private int id;
    private Double total;
    private Double troco;
    private Status status;
    private String data;
    private Double valorEntrega;
    private Double desconto;
    private CategoriaVenda categoriaVenda;
    
    private VendaInfo vendaInfo;
    private Usuario usuario;




    public Venda() {
    }

    public Venda(Double total, Double troco, Status status, String data, Double valorEntrega, Double desconto, CategoriaVenda categoriaVenda, VendaInfo vendaInfo, Usuario usuario) {
        this.total = total;
        this.troco = troco;
        this.status = status;
        this.data = data;
        this.valorEntrega = valorEntrega;
        this.desconto = desconto;
        this.categoriaVenda = categoriaVenda;
        this.vendaInfo = vendaInfo;
        this.usuario = usuario;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTroco() {
        return troco;
    }

    public void setTroco(Double troco) {
        this.troco = troco;
    }

    public Double getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(Double valorEntrega) {
        this.valorEntrega = valorEntrega;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public VendaInfo getVendaInfo() {
        return vendaInfo;
    }

    public void setVendaInfo(VendaInfo vendaInfo) {
        this.vendaInfo = vendaInfo;
    }

    public CategoriaVenda getCategoriaVenda() {
        return categoriaVenda;
    }

    public void setCategoriaVenda(CategoriaVenda categoriaVenda) {
        this.categoriaVenda = categoriaVenda;
    }
    
}
