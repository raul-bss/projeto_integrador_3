/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolancha5.DataAcessObject.dao;

import com.mycompany.projetolancha5.DataAcessObject.servico.ProdutoServico;
import com.mycompany.projetolancha5.modelos.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raul_
 */
public class ProdutoDAO {
    private ProdutoServico service;

    public ProdutoDAO() {
        this.service = new ProdutoServico();
    }
    public boolean atualizar(Produto produto){
        try {
            return service.atualizar(produto);
        } catch (Exception e) {
            return false;
        }
    }
    public boolean inserir(Produto produto){
        try {
            return service.inserir(produto);
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean deletar(int id){
        try {
            return service.deletar(id);
        } catch (Exception e) {
            return false;
        }
    }
    
    public Produto buscar(int id){
        try {
            return service.buscar(id);
        } catch (Exception e) {
            return new Produto();
        }
    }
    
    public List<Produto> listar(){
        try {
            return service.listar();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<Produto>();
        }
    }
  
}
