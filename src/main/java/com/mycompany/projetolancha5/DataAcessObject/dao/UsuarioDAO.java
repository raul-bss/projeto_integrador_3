package com.mycompany.projetolancha5.DataAcessObject.dao;

import com.mycompany.projetolancha5.DataAcessObject.servico.UsuarioServico;
import com.mycompany.projetolancha5.modelos.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    private UsuarioServico service;

    public UsuarioDAO() {
        this.service = new UsuarioServico();
    }
    
    public boolean inserir(Usuario usuario){
        try {
            return service.inserir(usuario);
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
    
    public Usuario buscar(int id){
        try {
            return service.buscar(id);
        } catch (Exception e) {
            return new Usuario();
        }
    }
    
    public List<Usuario> listar(){
        try {
            return service.listar();
        } catch (Exception e) {
            return new ArrayList<Usuario>();
        }
    }
    
    public Usuario fazerLogin(String login, String senha){
        try {
            return service.fazerLogin(login, senha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    
    
}
