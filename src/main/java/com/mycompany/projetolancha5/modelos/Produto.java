/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolancha5.modelos;

import com.mycompany.projetolancha5.modelos.enums.CategoriaProduto;

public class Produto {
    private int id;
    private String nome;
    private Double valor;
    private ProdutoInfo informacoes;

    public Produto() {
    }

    public Produto(String nome, ProdutoInfo informacoes, Double valor) {
        this.nome = nome;
        this.informacoes = informacoes;
        this.valor = valor;
    }

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

   

    public ProdutoInfo getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(ProdutoInfo informacoes) {
        this.informacoes = informacoes;
    }    
}
