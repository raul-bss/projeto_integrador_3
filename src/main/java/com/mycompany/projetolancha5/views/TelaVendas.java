
package com.mycompany.projetolancha5.views;


import com.mycompany.projetolancha5.DataAcessObject.dao.VendaDAO;
import com.mycompany.projetolancha5.modelos.Venda;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
   
public class TelaVendas extends javax.swing.JFrame {
    protected TelaMenu telaMenu;
    private List<Venda> listaDeVenda;
    private DefaultTableModel tableModel;
    
    private VendaDAO dao;
    
    protected String comandoSqlFiltrado;
    
    
   
    public TelaVendas(TelaMenu telaMenu ) {
        
        try {
            this.telaMenu = telaMenu;
            this.dao = new VendaDAO();
        } catch (Exception ex) {
            
        }
        
        initComponents();
        tabela.getSelectionModel().addListSelectionListener(e -> {
            btnAtualizarListener();
        });
        tabela.getSelectionModel().addListSelectionListener(e -> {
            btnDeletarListener();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        VENDAS = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        jButton2.setText("jButton2");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(11, 25, 44));
        jPanel1.setForeground(new java.awt.Color(219, 0, 0));

        VENDAS.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        VENDAS.setForeground(new java.awt.Color(255, 255, 255));
        VENDAS.setText("VENDAS");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        scrollPane.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                scrollPaneFocusLost(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Total", "Troco", "Status", "Modo Venda", "Data Venda", "Valor Entrega", "Transacao", "Data", "Hora", "Endereco", "Cliente"
            }
        ));
        tabela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabelaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tabelaFocusLost(evt);
            }
        });
        scrollPane.setViewportView(tabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(295, 295, 295)
                        .addComponent(VENDAS)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(VENDAS))
                .addGap(20, 20, 20)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        popularTabela(dao.listar());
    }//GEN-LAST:event_formWindowOpened

    private void scrollPaneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scrollPaneFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_scrollPaneFocusLost

    private void tabelaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaFocusLost
        btnAtualizarListener();
    }//GEN-LAST:event_tabelaFocusLost

    private void tabelaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaFocusGained
        btnAtualizarListener();
    }//GEN-LAST:event_tabelaFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        telaMenu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    private void btnAtualizarListener() {
        
    }
    
    private void btnDeletarListener() {
        
    }
    
    protected void popularTabela(List<Venda> lista) {

        tableModel = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "Total", "Troco", "Status", "Modo Venda",
                    "Data Venda", "Valor Entrega", "Transacao",
                    "Data", "Hora", "Endereco", "Cliente"}
        ) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        listaDeVenda = lista;

        for (Venda venda : listaDeVenda) {
            Object[] linha = new Object[]{
                venda.getId(),
                venda.getTotal(),
                venda.getTroco(),
                venda.getStatus().toString(),
                venda.getCategoriaVenda().toString(),
                venda.getData(),
                venda.getValorEntrega(),
                venda.getVendaInfo().getTransacao().toString(),
                venda.getVendaInfo().getData(),
                venda.getVendaInfo().getHorario(),
                venda.getVendaInfo().getEndereço(),
                venda.getVendaInfo().getNomeCliente()
            };

            tableModel.addRow(linha);
        }

        tabela.setModel(tableModel);
        scrollPane.setViewportView(tabela);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VENDAS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
