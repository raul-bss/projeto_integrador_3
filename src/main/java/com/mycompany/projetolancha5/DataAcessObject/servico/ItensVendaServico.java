/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolancha5.DataAcessObject.servico;

import com.mycompany.projetolancha5.DataAcessObject.interfaces.ItensVendaInterface;
import com.mycompany.projetolancha5.Database.Conexao;
import com.mycompany.projetolancha5.modelos.Carrinho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author raul_
 */
public class ItensVendaServico implements ItensVendaInterface {
    private Connection connection;
    
    public ItensVendaServico(){
        this.connection = Conexao.conectar();
    }
    
    @Override
    public boolean inserir(Double subTotal, int quantidade, int vendaId, int produtoId) {
        String sql = "INSERT INTO Carrinho (subTotal, quantidade, Venda_id, Produto_id) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setDouble(1, subTotal);
            stmt.setInt(2, quantidade);
            stmt.setInt(3, vendaId);
            stmt.setInt(4, produtoId);

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
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
    public List<Carrinho> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Carrinho buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
