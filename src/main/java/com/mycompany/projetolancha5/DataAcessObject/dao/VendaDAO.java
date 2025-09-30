/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolancha5.DataAcessObject.dao;


import com.mycompany.projetolancha5.DataAcessObject.servico.VendaServico;
import com.mycompany.projetolancha5.modelos.Venda;
import com.mycompany.projetolancha5.modelos.VendaInfo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raul_
 */
public class VendaDAO {
    private VendaServico service;

    public VendaDAO() {
        this.service = new VendaServico();
    }
    
    public Venda inserir(Venda venda, VendaInfo vendaInfo){
        try {
            return service.inserir(venda,vendaInfo);
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean deletar(int id){
        try {
            return service.deletar(id);
        } catch (Exception e) {
            return false;
        }
    }
    
    public Venda buscar(int id){
        try {
            return service.buscar(id);
        } catch (Exception e) {
            return new Venda();
        }
    }
    
    public List<Venda> listar(){
        try {
            return service.listar();
        } catch (Exception e) {
            return new ArrayList<Venda>();
        }
    }
}
