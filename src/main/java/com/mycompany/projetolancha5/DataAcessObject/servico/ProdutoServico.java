/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolancha5.DataAcessObject.servico;

import com.mycompany.projetolancha5.Database.Conexao;
import com.mycompany.projetolancha5.DataAcessObject.interfaces.ProdutoInterface;
import com.mycompany.projetolancha5.modelos.Produto;
import com.mycompany.projetolancha5.modelos.ProdutoInfo;
import com.mycompany.projetolancha5.modelos.enums.CategoriaProduto;
import com.mycompany.projetolancha5.modelos.enums.TipoConta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raul_
 */
public class ProdutoServico implements ProdutoInterface {
    private Connection connection;
    
    public ProdutoServico(){
        this.connection = Conexao.conectar();
    }
    @Override
    public boolean inserir(Produto produto) {
        PreparedStatement stProduto = null;
        PreparedStatement stInfo = null;
        ResultSet rs = null;
        int linhasAfetadas = 0;

        try {

            String sqlProduto = "INSERT INTO produto (nome, valor) VALUES (?, ?)";
            stProduto = connection.prepareStatement(sqlProduto, Statement.RETURN_GENERATED_KEYS);
            stProduto.setString(1, produto.getNome());
            stProduto.setDouble(2, produto.getValor());

            linhasAfetadas = stProduto.executeUpdate();

            if (linhasAfetadas == 0) {
                throw new SQLException("Falha ao inserir produto, nenhuma linha afetada.");
            }

            rs = stProduto.getGeneratedKeys();
            int produtoId = 0;
            if (rs.next()) {
                produtoId = rs.getInt(1);
            } else {
                throw new SQLException("Falha ao obter o ID do produto inserido.");
            }

            String sqlInfo = "INSERT INTO produtoinfo (categoria, descricao, produto_id) VALUES (?, ?, ?)";
            stInfo = connection.prepareStatement(sqlInfo);
            stInfo.setString(1, produto.getInformacoes().getCategoria().toString());
            stInfo.setString(2, produto.getInformacoes().getDescricao());
            stInfo.setInt(3, produtoId);

            int linhasInfo = stInfo.executeUpdate();

            return linhasInfo > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stProduto != null) stProduto.close();
                if (stInfo != null) stInfo.close();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return false;
}


    @Override
    public boolean deletar(int id) {
        PreparedStatement stInfo = null;
        PreparedStatement stProduto = null;
        PreparedStatement stCarrinho = null;
        boolean sucesso = false;

        try {
            connection.setAutoCommit(false);
            String sqlCarrinho = "DELETE FROM carrinho WHERE Produto_id = ?";
            stCarrinho = connection.prepareStatement(sqlCarrinho);
            stCarrinho.setInt(1, id);
            stCarrinho.executeUpdate();
            
            
            String sqlInfo = "DELETE FROM ProdutoInfo WHERE Produto_id = ?";
            stInfo = connection.prepareStatement(sqlInfo);
            stInfo.setInt(1, id);
            stInfo.executeUpdate();

            String sqlProduto = "DELETE FROM Produto WHERE id = ?";
            stProduto = connection.prepareStatement(sqlProduto);
            stProduto.setInt(1, id);
            int linhasAfetadas = stProduto.executeUpdate();

            sucesso = linhasAfetadas > 0;


            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (stInfo != null) stInfo.close();
                if (stProduto != null) stProduto.close();
                connection.setAutoCommit(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return sucesso;
}


    @Override
    public boolean atualizar(Produto produto) {
        PreparedStatement stProduto = null;
        PreparedStatement stInfo = null;
        boolean sucesso = false;

        try {
            connection.setAutoCommit(false);

            String sqlProduto = "UPDATE produto SET nome = ?, valor = ? WHERE id = ?";
            stProduto = connection.prepareStatement(sqlProduto);
            stProduto.setString(1, produto.getNome());
            stProduto.setDouble(2, produto.getValor());
            stProduto.setInt(3, produto.getId());

            int linhasProduto = stProduto.executeUpdate();

            String sqlInfo = "UPDATE produtoinfo SET categoria = ?, descricao = ? WHERE produto_id = ?";
            stInfo = connection.prepareStatement(sqlInfo);
            stInfo.setString(1, produto.getInformacoes().getCategoria().toString());
            stInfo.setString(2, produto.getInformacoes().getDescricao());
            stInfo.setInt(3, produto.getId());

            int linhasInfo = stInfo.executeUpdate();

            connection.commit();

            sucesso = (linhasProduto > 0 && linhasInfo > 0);

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (stProduto != null) {
                    stProduto.close();
                }
                if (stInfo != null) {
                    stInfo.close();
                }
                connection.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return sucesso;
    }


    @Override
    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String comandoSQL;
        
        sb.append("SELECT ");
        sb.append("p.id AS produto_id, ");
        sb.append("p.nome AS produto_nome, ");
        sb.append("p.valor AS produto_valor, ");
        sb.append("pi.id AS info_id, ");
        sb.append("pi.descricao AS info_descricao, ");
        sb.append("pi.categoria AS categoria_nome ");
        sb.append("FROM Produto p ");
        sb.append("JOIN ProdutoInfo pi ON p.id = pi.Produto_id");
            
        comandoSQL = sb.toString();
        
        try (PreparedStatement st = connection.prepareStatement(comandoSQL);
             ResultSet rs = st.executeQuery()) {

            while (rs.next()) {

                ProdutoInfo info = new ProdutoInfo();
                CategoriaProduto categoria;
                String categoriaNome = rs.getString("categoria_nome");

                switch (rs.getString("categoria_nome").toUpperCase()) {
                    case "DOCE":
                       info.setCategoria(CategoriaProduto.DOCE);
                        break;
                    case "BEBIDA":
                        info.setCategoria(CategoriaProduto.BEBIDA);
                        break;
                    case "SALGADO":
                        info.setCategoria(CategoriaProduto.SALGADO);
                        break;
                    case "LANCHE":
                        info.setCategoria(CategoriaProduto.LANCHE);
                        break;
                    case "ACOMPANHAMENTO":
                        info.setCategoria(CategoriaProduto.ACOMPANHAMENTO);
                    break;
                }
                
                info.setId(rs.getInt("info_id"));
                info.setDescricao(rs.getString("info_descricao"));


                Produto produto = new Produto();
                produto.setId(rs.getInt("produto_id"));
                produto.setNome(rs.getString("produto_nome"));
                produto.setValor(rs.getDouble("produto_valor"));
                produto.setInformacoes(info);

                lista.add(produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    

    @Override

    public Produto buscar(int id) {
        Produto produto = null;
        String sql = """
        SELECT 
            p.id AS produto_id, 
            p.nome AS produto_nome, 
            p.valor AS produto_valor, 
            pi.id AS info_id, 
            pi.descricao AS info_descricao, 
            pi.categoria AS categoria_nome
        FROM Produto p
        JOIN ProdutoInfo pi ON p.id = pi.Produto_id
        WHERE p.id = ?
    """;

        try (PreparedStatement st = connection.prepareStatement(sql)) {
            st.setInt(1, id);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    ProdutoInfo info = new ProdutoInfo();
                    String categoriaNome = rs.getString("categoria_nome");

                    switch (categoriaNome.toUpperCase()) {
                        case "DOCE":
                            info.setCategoria(CategoriaProduto.DOCE);
                            break;
                        case "BEBIDA":
                            info.setCategoria(CategoriaProduto.BEBIDA);
                            break;
                        case "SALGADO":
                            info.setCategoria(CategoriaProduto.SALGADO);
                            break;
                        case "LANCHE":
                            info.setCategoria(CategoriaProduto.LANCHE);
                            break;
                        case "ACOMPANHAMENTO":
                            info.setCategoria(CategoriaProduto.ACOMPANHAMENTO);
                            break;
                    }

                    info.setId(rs.getInt("info_id"));
                    info.setDescricao(rs.getString("info_descricao"));

                    produto = new Produto();
                    produto.setId(rs.getInt("produto_id"));
                    produto.setNome(rs.getString("produto_nome"));
                    produto.setValor(rs.getDouble("produto_valor"));
                    produto.setInformacoes(info);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produto;
    }
    
}
