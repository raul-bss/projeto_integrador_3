package com.mycompany.projetolancha5.DataAcessObject.servico;


import com.mycompany.projetolancha5.DataAcessObject.interfaces.VendaInterface;
import com.mycompany.projetolancha5.Database.Conexao;
import com.mycompany.projetolancha5.modelos.Venda;
import com.mycompany.projetolancha5.modelos.VendaInfo;
import com.mycompany.projetolancha5.modelos.enums.CategoriaVenda;
import com.mycompany.projetolancha5.modelos.enums.Status;
import com.mycompany.projetolancha5.modelos.enums.TipoTransacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class VendaServico implements VendaInterface {

    private Connection connection;
    
    public VendaServico(){
        this.connection = Conexao.conectar();
    }
    
    @Override
    public Venda inserir(Venda venda, VendaInfo vendaInfo) {
    String sqlVenda = """
        INSERT INTO Venda 
        (total, troco, status, modoVenda, dataVenda, valorEntrega, desconto, Usuario_id) 
        VALUES (?, ?, ?, ?, ?, ?, ?, ?)
        """;

    String sqlVendaInfo = """
        INSERT INTO VendaInfo 
        (tipoTransacao, dataVenda, horarioVenda, enderecoEntrega, nomeCliente, Venda_id) 
        VALUES (?, ?, ?, ?, ?, ?)
        """;

    try {
        connection.setAutoCommit(false);

        // --- Inserindo Venda ---
        try (PreparedStatement stmt = connection.prepareStatement(sqlVenda, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setDouble(1, venda.getTotal());
            stmt.setDouble(2, venda.getTroco());
            stmt.setString(3, venda.getStatus().toString());
            stmt.setString(4, venda.getCategoriaVenda().toString());
            stmt.setString(5, venda.getData());
            stmt.setDouble(6, venda.getValorEntrega());
            stmt.setDouble(7, venda.getDesconto());
            stmt.setInt(8, venda.getUsuario().getId());

            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    venda.setId(rs.getInt(1));
                }
            }
        }
        
        try (PreparedStatement stmtInfo = connection.prepareStatement(sqlVendaInfo, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmtInfo.setString(1, vendaInfo.getTransacao().toString());
            stmtInfo.setString(2, vendaInfo.getData().toString());
            stmtInfo.setString(3, vendaInfo.getHorario());
            stmtInfo.setString(4, vendaInfo.getEndereço());
            stmtInfo.setString(5, vendaInfo.getNomeCliente());
            stmtInfo.setInt(6, venda.getId()); 

            stmtInfo.executeUpdate();

            try (ResultSet rs = stmtInfo.getGeneratedKeys()) {
                if (rs.next()) {
                    vendaInfo.setId(rs.getInt(1));
                }
            }
        }

        connection.commit();
        return venda;

    } catch (SQLException e) {
        try {
            connection.rollback();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fazer rollback: " + ex.getMessage(), ex);
        }
        throw new RuntimeException("Erro ao inserir Venda e VendaInfo: " + e.getMessage(), e);

    } finally {
        try {
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
    public List<Venda> listar() {
        List<Venda> lista = new ArrayList<>();
        
        String sql = """
        SELECT v.id AS venda_id, v.total, v.troco, v.status, v.modoVenda, v.dataVenda, 
               v.valorEntrega, v.desconto, v.Usuario_id,
               vi.id AS info_id, vi.tipoTransacao, vi.dataVenda AS info_dataVenda, 
               vi.horarioVenda, vi.enderecoEntrega, vi.nomeCliente
        FROM Venda v
        LEFT JOIN VendaInfo vi ON v.id = vi.Venda_id
        ORDER BY v.id DESC
        """;

        try (PreparedStatement stmt = connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                VendaInfo info = new VendaInfo();
                info.setId(rs.getInt("info_id"));
                info.setTransacao(Enum.valueOf(TipoTransacao.class, rs.getString("tipoTransacao")));
                info.setData(rs.getString("info_dataVenda"));
                info.setHorario(rs.getString("horarioVenda"));
                info.setEndereço(rs.getString("enderecoEntrega"));
                info.setNomeCliente(rs.getString("nomeCliente"));

                Venda venda = new Venda();
                venda.setId(rs.getInt("venda_id"));
                venda.setTotal(rs.getDouble("total"));
                venda.setTroco(rs.getDouble("troco"));
                venda.setStatus(Enum.valueOf(Status.class, rs.getString("status")));
                venda.setCategoriaVenda(Enum.valueOf(CategoriaVenda.class, rs.getString("modoVenda")));
                venda.setData(rs.getString("dataVenda"));
                venda.setValorEntrega(rs.getDouble("valorEntrega"));
                venda.setDesconto(rs.getDouble("desconto"));

                venda.setVendaInfo(info);

                lista.add(venda);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }


    @Override
    public Venda buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
