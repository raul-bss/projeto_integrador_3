package com.mycompany.projetolancha5.DataAcessObject.dao;

import com.mycompany.projetolancha5.DataAcessObject.servico.ItensVendaServico;
import com.mycompany.projetolancha5.modelos.Carrinho;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raul_
 */
public class ItensVendaDAO {
    private ItensVendaServico service;

    public ItensVendaDAO() {
        this.service = new ItensVendaServico();
    }
    
    public boolean inserir(Double subTotal, int quantidade, int vendaId, int produtoId){
        try {
            return service.inserir(subTotal,quantidade,vendaId,produtoId);
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
    
    public Carrinho buscar(int id){
        try {
            return service.buscar(id);
        } catch (Exception e) {
            return new Carrinho();
        }
    }
    
    public List<Carrinho> listar(){
        try {
            return service.listar();
        } catch (Exception e) {
            return new ArrayList<Carrinho>();
        }
    }
}
