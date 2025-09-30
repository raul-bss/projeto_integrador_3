package com.mycompany.projetolancha5.DataAcessObject.interfaces;

import com.mycompany.projetolancha5.modelos.Usuario;
import java.util.List;

public interface UsuarioInterface {
    boolean inserir(Usuario usuario);
    boolean deletar(int id);
    boolean atualizar(int id);
    List<Usuario> listar();
    Usuario buscar(int id);
    
    Usuario fazerLogin(String login, String senha);
    
    
}
