package com.aewinformatica.scev.desktop.view;

import org.springframework.stereotype.Component;

/**
 *
 * @author Jessica
 */
@Component
public class ViewLogin extends javax.swing.JFrame {
        
    public ViewLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCabecalho = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelNameSetor = new javax.swing.JLabel();
        jLabelFaixaInfeior = new javax.swing.JLabel();
        jLabelEntrar = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelfundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle de Estoque e Vendas");
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jLabelCabecalho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCabecalho.setForeground(new java.awt.Color(255, 102, 51));
        jLabelCabecalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCabecalho.setText("SISTEMA DE CONTROLE DE ESTOQUE E VENDAS");
        getContentPane().add(jLabelCabecalho);
        jLabelCabecalho.setBounds(250, 110, 280, 20);

        jTextFieldUser.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(255, 102, 51));
        jTextFieldUser.setText("admin");
        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUser);
        jTextFieldUser.setBounds(250, 170, 280, 30);

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(250, 230, 280, 30);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 102, 51));
        jLabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelUsuario.setText("INTRANET");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(350, 410, 80, 20);

        jLabelNameSetor.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabelNameSetor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNameSetor.setText("Todos os direitos reservados a Aewinformatica");
        getContentPane().add(jLabelNameSetor);
        jLabelNameSetor.setBounds(520, 430, 310, 30);

        jLabelFaixaInfeior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_FaixaInferior.png"))); // NOI18N
        getContentPane().add(jLabelFaixaInfeior);
        jLabelFaixaInfeior.setBounds(-320, 410, 1240, 60);

        jLabelEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Entrar.png"))); // NOI18N
        jLabelEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEntrarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelEntrar);
        jLabelEntrar.setBounds(480, 270, 51, 30);

        jLabelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/loguinfb.png"))); // NOI18N
        getContentPane().add(jLabelLogin);
        jLabelLogin.setBounds(230, 90, 320, 220);

        jLabelfundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ameba2.png"))); // NOI18N
        getContentPane().add(jLabelfundoLogin);
        jLabelfundoLogin.setBounds(-20, -10, 790, 470);

        setSize(new java.awt.Dimension(775, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEntrarMouseClicked
       
    }//GEN-LAST:event_jLabelEntrarMouseClicked

    private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed
      

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCabecalho;
    private javax.swing.JLabel jLabelEntrar;
    private javax.swing.JLabel jLabelFaixaInfeior;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNameSetor;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelfundoLogin;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}