package com.mycompany.projetolancha5.modelos;

import com.mycompany.projetolancha5.modelos.enums.CategoriaProduto;

public class ProdutoInfo {
    private int id;
    private String descricao;
    private CategoriaProduto categoria;

    public ProdutoInfo() {
        
    }

    public ProdutoInfo(String descricao, CategoriaProduto categoria, Produto produto) {
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }    
}
