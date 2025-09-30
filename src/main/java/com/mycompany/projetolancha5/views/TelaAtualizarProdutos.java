/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetolancha5.views;

import com.mycompany.projetolancha5.DataAcessObject.dao.ProdutoDAO;
import com.mycompany.projetolancha5.modelos.Produto;
import com.mycompany.projetolancha5.modelos.ProdutoInfo;
import com.mycompany.projetolancha5.modelos.enums.CategoriaProduto;
import javax.swing.JOptionPane;

/**
 *
 * @author raul_
 */
public class TelaAtualizarProdutos extends javax.swing.JFrame {
    
    private TelaProdutos telaProdutos;
    private Produto produto;
    private ProdutoDAO produtoDAO;
    
    public TelaAtualizarProdutos(TelaProdutos telaProdutos, Produto produto) {
        initComponents();
        this.telaProdutos = telaProdutos;
        this.produto = produto;
        this.produtoDAO = new ProdutoDAO();
        preencheTela();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbCategorias = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 234));
        jPanel1.setForeground(new java.awt.Color(219, 0, 0));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnInserir.setBackground(new java.awt.Color(255, 103, 75));
        btnInserir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(255, 255, 255));
        btnInserir.setText("Atualizar");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 103, 75));
        jLabel1.setText("NOME");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 103, 75));
        jLabel2.setText("VALOR");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 103, 75));
        jLabel3.setText("CATEGORIA");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 103, 75));
        jLabel4.setText("DESCRICAO");

        cmbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOCE", "SALGADO", "BEBIDA", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
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

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        if (!validaTela()) {
            return;
        }

        try {
            Produto obj = new Produto();
            ProdutoInfo produtoInfo = new ProdutoInfo();
            
            obj.setId(produto.getId());
            obj.setNome(campoNome.getText());
            obj.setValor(Double.valueOf(campoValor.getText()));
            
            produtoInfo.setId(produto.getInformacoes().getId());
            produtoInfo.setDescricao(campoDescricao.getText());
            produtoInfo.setCategoria(CategoriaProduto.valueOf(cmbCategorias.getSelectedItem().toString()));

            obj.setInformacoes(produtoInfo);

            boolean resultado = produtoDAO.atualizar(obj);

            if (resultado) {
                JOptionPane.showMessageDialog(rootPane, "Produto cadastrado!");
                telaProdutos.popularTabela(produtoDAO.listar());
                limpaTela();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Deu erro!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnInserirActionPerformed
    
    private void limpaTela(){
        campoDescricao.setText("");
        campoNome.setText("");
        campoValor.setText("");
    }
    
    private boolean validaTela() {
        if (campoNome.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Informe o nome do produto!");
            campoNome.requestFocus();
            return false;
        }

        if (campoValor.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Informe o valor do produto!");
            campoValor.requestFocus();
            return false;
        }

        double valor;
        try {
            valor = Double.parseDouble(campoValor.getText().replace(",", "."));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valor inválido! Use apenas números e ponto ou vírgula.");
            campoValor.requestFocus();
            return false;
        }

        if (valor <= 0) {
            JOptionPane.showMessageDialog(this, "O valor deve ser maior que 0.");
            campoValor.requestFocus();
            return false;
        }

        if (campoDescricao.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Informe a descrição do produto!");
            campoDescricao.requestFocus();
            return false;
        }

        return true;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        telaProdutos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void preencheTela(){
        campoNome.setText(produto.getNome());
        campoDescricao.setText(produto.getInformacoes().getDescricao());
        campoValor.setText(String.valueOf(produto.getValor()));
        cmbCategorias.setSelectedItem(produto.getInformacoes().getCategoria().toString().toUpperCase());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserir;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoValor;
    private javax.swing.JComboBox<String> cmbCategorias;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
