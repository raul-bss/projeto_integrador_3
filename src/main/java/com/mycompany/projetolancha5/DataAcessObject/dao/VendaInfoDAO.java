/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolancha5.DataAcessObject.dao;

import com.mycompany.projetolancha5.DataAcessObject.servico.VendaInfoServico;
import com.mycompany.projetolancha5.modelos.VendaInfo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raul_
 */
public class VendaInfoDAO {
    private VendaInfoServico service;

    public VendaInfoDAO() {
        this.service = new VendaInfoServico();
    }
    
    public boolean inserir(VendaInfo vendaInfo){
        try {
            return service.inserir(vendaInfo);
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
    
    public VendaInfo buscar(int id){
        try {
            return service.buscar(id);
        } catch (Exception e) {
            return new VendaInfo();
        }
    }
    
    public List<VendaInfo> listar(){
        try {
            return service.listar();
        } catch (Exception e) {
            return new ArrayList<VendaInfo>();
        }
    }
}
