package com.mycompany.projetolancha5.views;


import com.mycompany.projetolancha5.DataAcessObject.dao.ProdutoDAO;
import com.mycompany.projetolancha5.modelos.Produto;
import com.mycompany.projetolancha5.modelos.enums.TipoConta;
import com.mycompany.projetolancha5.util.Configuracoes;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
   
public class TelaProdutos extends javax.swing.JFrame {
    private TelaMenu telaMenu;
    private TelaAtualizarProdutos atualizarProdutos;
    private TelaCadastroProduto cadastroProduto;
    
    private List<Produto> listaDeProduto;
    
    private ProdutoDAO dao;
    
    private DefaultTableModel tableModel;
    private final String[] colunas = {"ID", "Nome", "Valor", "Categoria", "Descricao"};
         
    public TelaProdutos(TelaMenu telaMenu ) {
        
        initComponents();
        try {
            tableModel = new DefaultTableModel(colunas,0);
            this.telaMenu = telaMenu;
            this.dao = new ProdutoDAO();
            popularTabela(dao.listar());    
        } catch (Exception ex) {
            
        }
        
        
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
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnInserir = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 234));
        jPanel1.setForeground(new java.awt.Color(219, 0, 0));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 103, 75));
        jLabel5.setText("PRODUTOS");
        jLabel5.setBorder(javax.swing.BorderFactory.createCompoundBorder());

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
                {},
                {},
                {},
                {}
            },
            new String [] {

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

        btnInserir.setBackground(new java.awt.Color(255, 103, 75));
        btnInserir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(255, 255, 255));
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(255, 103, 75));
        btnDeletar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(255, 103, 75));
        btnAtualizar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(258, 258, 258)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
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
        aplicarPermissoes();
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
        telaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        cadastroProduto = new TelaCadastroProduto(this);
        cadastroProduto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
        dispose();
        
        try {            

            if (tabela.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(null,"Nenhuma linha selecionada");
                return;
            }

            int id, linha;
            boolean resultado;

            linha = tabela.getSelectedRow();
            id = Integer.parseInt(tabela.getValueAt(linha, 0).toString());
            
            
            Produto produto = dao.buscar(id);
            if (produto != null) {
                atualizarProdutos = new TelaAtualizarProdutos(this,produto);
                atualizarProdutos.setVisible(true);
            } else {
                mensagemTela("deu erro no listarPorID");
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if(tabela.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null,"Nenhuma linha selecionada");
            return;
        }
        try{
            String nomeDoProduto;
            int id, linha;
            boolean resultado;

            linha = tabela.getSelectedRow();

            id = Integer.parseInt(tabela.getValueAt(linha, 0).toString());
            nomeDoProduto = tabela.getValueAt(linha, 1).toString();

            int escolha = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o produto "+ nomeDoProduto + " ?" );
           
            
            if(escolha == 0){
                resultado = dao.deletar(id);
                if(resultado){
                    mensagemTela("Produto "+ nomeDoProduto + " excluido com sucesso.");
                    popularTabela(dao.listar());
                }
            }
            

        }catch(Exception e){

        }
    }//GEN-LAST:event_btnDeletarActionPerformed
   
    private void mensagemTela(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    private void btnAtualizarListener() {
        btnAtualizar.setEnabled(tabela.getSelectedRow() != -1);
    }
    
    private void btnDeletarListener() {
        btnDeletar.setEnabled(tabela.getSelectedRow() != -1);
    }
    
    protected void popularTabela(List<Produto> lista){
        tableModel.setRowCount(0);
        listaDeProduto = lista;    
        listaDeProduto = dao.listar();
        Produto produto;
        
        for(Produto item: listaDeProduto){
            String[] linha = {
                String.valueOf(item.getId()),
                item.getNome(),
                String.valueOf(item.getValor()),
                item.getInformacoes().getCategoria().toString(),
                item.getInformacoes().getDescricao()
            };
            
            tableModel.addRow(linha);
        }
        
        tabela.setModel(tableModel);
        scrollPane.setViewportView(tabela);
    }
    
    private void aplicarPermissoes(){
        switch(Configuracoes.getUsuario().getTipoConta()){
            case TipoConta.ADM:
                btnAtualizar.setEnabled(true);
                btnDeletar.setEnabled(true);
                btnInserir.setEnabled(true);

                break;
            case TipoConta.USER:
                btnAtualizar.setEnabled(true);

                btnDeletar.setEnabled(false);
                btnInserir.setEnabled(false);

                break;
        }       
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
