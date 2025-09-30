/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolancha5.modelos;

import com.mycompany.projetolancha5.modelos.enums.TipoTransacao;

/**
 *
 * @author administrator
 */
public class VendaInfo {
    private int id;
    private TipoTransacao transacao;
    private String data;
    private String horario;
    private String endereço;
    private String nomeCliente;
    private Venda venda;

    public VendaInfo() {
    }

    public VendaInfo(int id, TipoTransacao transacao, String data, String horario, String endereço, String nomeCliente, Venda venda) {
        this.id = id;
        this.transacao = transacao;
        this.data = data;
        this.horario = horario;
        this.endereço = endereço;
        this.nomeCliente = nomeCliente;
        this.venda = venda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoTransacao getTransacao() {
        return transacao;
    }

    public void setTransacao(TipoTransacao transacao) {
        this.transacao = transacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    
}
