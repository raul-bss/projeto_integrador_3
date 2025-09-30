/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolancha5.modelos;

import com.mycompany.projetolancha5.modelos.enums.TipoTransacao;

/**
 *
 * @author raul_
 */
public class Pagamento {
    
    private int id;
    private double valorTotal;
    private double totalPago;
    private double troco;
    private int tipoPagamento; // 0 = UNICO | 1 == MULTIPLO
    private double valorCredito;
    private double valorDebito;
    private double valorDinheiro;
    private double valorPix;

    public Pagamento(double valorTotal, double totalPago, double troco, int tipoPagamento, double valorCredito, double valorDebito, double valorDinheiro, double valorPix) {
        this.valorTotal = valorTotal;
        this.totalPago = totalPago;
        this.troco = troco;
        this.tipoPagamento = tipoPagamento;
        this.valorCredito = valorCredito;
        this.valorDebito = valorDebito;
        this.valorDinheiro = valorDinheiro;
        this.valorPix = valorPix;
    }

    public Pagamento() {
        
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public int getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDebito() {
        return valorDebito;
    }

    public void setValorDebito(double valorDebito) {
        this.valorDebito = valorDebito;
    }

    public double getValorDinheiro() {
        return valorDinheiro;
    }

    public void setValorDinheiro(double valorDinheiro) {
        this.valorDinheiro = valorDinheiro;
    }

    public double getValorPix() {
        return valorPix;
    }

    public void setValorPix(double valorPix) {
        this.valorPix = valorPix;
    }
    
    
}
