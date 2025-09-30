/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolancha5.DataAcessObject.dao;

import com.mycompany.projetolancha5.DataAcessObject.servico.ProdutoInfoServico;
import com.mycompany.projetolancha5.modelos.ProdutoInfo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raul_
 */
public class ProdutoInfoDAO {
    private ProdutoInfoServico service;

    public ProdutoInfoDAO() {
        this.service = new ProdutoInfoServico();
    }
    
    public boolean inserir(ProdutoInfo produtoInfo){
        try {
            return service.inserir(produtoInfo);
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
    
    public ProdutoInfo buscar(int id){
        try {
            return service.buscar(id);
        } catch (Exception e) {
            return new ProdutoInfo();
        }
    }
    
    public List<ProdutoInfo> listar(){
        try {
            return service.listar();
        } catch (Exception e) {
            return new ArrayList<ProdutoInfo>();
        }
    }
}
