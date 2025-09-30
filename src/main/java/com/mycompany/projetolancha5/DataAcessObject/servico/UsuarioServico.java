package com.mycompany.projetolancha5.DataAcessObject.servico;

import com.mycompany.projetolancha5.Database.Conexao;
import com.mycompany.projetolancha5.DataAcessObject.interfaces.UsuarioInterface;
import com.mycompany.projetolancha5.modelos.Usuario;
import com.mycompany.projetolancha5.modelos.enums.TipoConta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author raul_
 */
public class UsuarioServico implements UsuarioInterface{
    private Connection connection;
    
    public UsuarioServico(){
        this.connection = Conexao.conectar();
    }
    @Override
    public boolean inserir(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deletar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean atualizar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario fazerLogin(String login, String senha) {
        Usuario usuario = null; 
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT * FROM usuario ");
        sb.append("WHERE login = ? ");
        sb.append("AND senha = ? ");

        String comandoSQL = sb.toString();

        try {
            connection = Conexao.conectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try (PreparedStatement st = connection.prepareStatement(comandoSQL)){
            st.setString(1, login);
            st.setString(2, senha);

            try (ResultSet rs = st.executeQuery()) { 
                if (rs.next()) { 
                    usuario = new Usuario();
                    usuario.setLogin(rs.getString("login"));

                    String tipoConta = rs.getString("tipoConta");
                    if ("ADM".equals(tipoConta)) {
                        usuario.setTipoConta(TipoConta.ADM);
                    } else if ("USER".equals(tipoConta)) {
                        usuario.setTipoConta(TipoConta.USER);
                    }
                    usuario.setEmail(rs.getString("email"));
                    usuario.setId(rs.getInt("id"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao realizar login: " + e.getMessage());
        }
        connection = null;
        return usuario;
    }
    
}
