
package com.mycompany.projetolancha5.views;
import com.mycompany.projetolancha5.DataAcessObject.dao.UsuarioDAO;
import com.mycompany.projetolancha5.modelos.Usuario;
import com.mycompany.projetolancha5.util.Configuracoes;
import com.mycompany.projetolancha5.util.Mensagens;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class TelaLogin extends javax.swing.JFrame {

    private UsuarioDAO dao;
    private boolean loginConcluido;
    public TelaLogin() {
        dao = new UsuarioDAO();
        initComponents();
        JPasswordField txtSenha = new JPasswordField(15);
        txtSenha.setEchoChar('•');
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 234));
        jPanel2.setName("Raul o Foda"); // NOI18N
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 103, 75));
        jLabel2.setText("Usuario");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(411, 197, 87, 32);

        campoLogin.setBackground(new java.awt.Color(255, 255, 234));
        campoLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        campoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoginActionPerformed(evt);
            }
        });
        jPanel2.add(campoLogin);
        campoLogin.setBounds(325, 235, 259, 30);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 103, 75));
        jLabel3.setText("Nome Estabelecimento");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(210, 120, 480, 60);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 103, 75));
        jLabel4.setText("Senha");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(419, 303, 71, 32);

        campoSenha.setBackground(new java.awt.Color(255, 255, 234));
        campoSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(campoSenha);
        campoSenha.setBounds(325, 341, 259, 31);

        btnEntrar.setBackground(new java.awt.Color(255, 103, 75));
        btnEntrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEntrar);
        btnEntrar.setBounds(403, 432, 104, 49);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(322, 266, 263, 10);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(323, 374, 263, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        jPanel2.getAccessibleContext().setAccessibleName("Raul o Foda");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        sbEntrar();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void campoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLoginActionPerformed

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER ){
            sbEntrar();
        }
    }//GEN-LAST:event_jPanel2KeyPressed
    private void sbEntrar(){
        if (!validacao()){
            return;
        }
        try{
            sbLogin();
            sbCarregaTelaMenu();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void sbCarregaTelaMenu(){
        if(!loginConcluido){
            return;
        }
        
        TelaMenu telaMenu = new TelaMenu(this);
        telaMenu.setVisible(true);
        dispose();
        JOptionPane.showMessageDialog(null, "Olá " + Configuracoes.getUsuario().getLogin() + " , sua permissão é de " + Configuracoes.getUsuario().getTipoConta().toString() + ". Seja bem-vindo");
        limparTela();
    }
    private void sbLogin(){
        String usuario,senha;
        Usuario user;
        
        loginConcluido = false;
        usuario = campoLogin.getText();
        senha = campoSenha.getText();

        user = dao.fazerLogin(usuario, senha);
        
        if (user != null) {
            
            Configuracoes.setUsuario(user);
            loginConcluido = true;
            
        } else {
            JOptionPane.showMessageDialog(null, "Usuario não encontrado.");
            loginConcluido = false;
            limparTela();
        }
    }    
    
    private boolean validacao(){
        if(campoLogin.getText().isBlank()){
            Mensagens.mostraMensagem(rootPane, "Campo LOGIN vazio.");
            campoLogin.requestFocus();
            return false;
        }
        
        if(campoSenha.getText().isBlank()){
            Mensagens.mostraMensagem(rootPane, "Campo SENHA vazio.");
            campoSenha.requestFocus();
            return false;
        }
        
        return true;
    }
    
    private void limparTela(){
        campoLogin.setText("");
        campoSenha.setText("");
        loginConcluido = false;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
