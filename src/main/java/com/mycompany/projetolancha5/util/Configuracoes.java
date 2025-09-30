package com.mycompany.projetolancha5.util;

import com.mycompany.projetolancha5.modelos.Usuario;


/**
* Classe para salvar instancia de usuario logado
* @author Raul
* @version 1.0
* @since Primeira versão
*/
public class Configuracoes {
    private static Usuario usuario;
    
    public static void setUsuario(Usuario usr) {
        logoff();
        usuario = usr;
    }

    public static Usuario getUsuario() {
        return usuario;
    }
    
    public static void logoff(){
        usuario = null;
    }
    
    public boolean fnVerificaUsuarioLogado(){
        return usuario != null;
    }
    
    
        
}
