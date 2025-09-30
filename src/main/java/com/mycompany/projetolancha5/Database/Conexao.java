package com.mycompany.projetolancha5.Database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
* Conexao com banco de dados
* @author Raul
* @version 1.0
* @since 1.0
*/
public class Conexao {
    
    private static Connection conexao = null;
    private static final String username = "root";
    private static final String password = "";
    private static final String dburl = "jdbc:mysql://localhost:3306/raul";
    
    public static Connection conectar(){
        if(conexao == null){
            try{
                conexao = DriverManager.getConnection(dburl,username,password);  
                System.out.println("CONECTOU");
                return conexao;
            }catch(SQLException e){
                e.printStackTrace();
                e.getMessage();
            }   
        }
        return conexao;
    }
    
    public static void desconectar(){
        try{
            if(conexao != null){
                conexao.close();
            }
        }catch(SQLException e){
            
        }
    }
    
    
}
