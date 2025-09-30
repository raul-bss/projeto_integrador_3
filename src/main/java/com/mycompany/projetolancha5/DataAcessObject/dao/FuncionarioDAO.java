/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolancha5.DataAcessObject.dao;

import com.mycompany.projetolancha5.DataAcessObject.servico.FuncionarioServico;
import com.mycompany.projetolancha5.modelos.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raul_
 */
public class FuncionarioDAO {
    private FuncionarioServico service;

    public FuncionarioDAO() {
        this.service = new FuncionarioServico();
    }
    
    public boolean inserir(Funcionario funcionario){
        try {
            return service.inserir(funcionario);
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
    
    public Funcionario buscar(int id){
        try {
            return service.buscar(id);
        } catch (Exception e) {
            return new Funcionario();
        }
    }
    
    public List<Funcionario> listar(){
        try {
            return service.listar();
        } catch (Exception e) {
            return new ArrayList<Funcionario>();
        }
    }
}
