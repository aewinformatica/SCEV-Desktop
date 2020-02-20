package com.aewinformatica.scev.desktop.view;

import javax.swing.JFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jessica
 */
@Component
public class ViewPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ViewPrincipal
     */
    
    @Autowired
    public ViewPrincipal() {
        
        initComponents();
        
        //MAXIMIZANDO A TELA
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmArquivos = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();
        jmCadastros = new javax.swing.JMenu();
        jmiClientes = new javax.swing.JMenuItem();
        jmiProdutos = new javax.swing.JMenuItem();
        jmiUsuarios = new javax.swing.JMenuItem();
        jmVendas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Estoque e Vendas");
        setResizable(false);

        jmArquivos.setText("Arquivos");

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmArquivos.add(jmiSair);

        jMenuBar1.add(jmArquivos);

        jmCadastros.setText("Cadastros");

        jmiClientes.setText("Clientes");
        jmiClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClientesActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiClientes);

        jmiProdutos.setText("Produtos");
        jmiProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProdutosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiProdutos);

        jmiUsuarios.setText("Usuarios");
        jmiUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuariosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiUsuarios);

        jMenuBar1.add(jmCadastros);

        jmVendas.setText("Vendas");
        jmVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmVendasMouseClicked(evt);
            }
        });
        jmVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmVendasActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmVendas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClientesActionPerformed

        /*
        ViewCliente viewCliente = new ViewCliente();
                    viewCliente.setVisible(true);*/
        //SIMPLIFICADO O ACIMA
//        new ViewCliente().setVisible(true);
    }//GEN-LAST:event_jmiClientesActionPerformed

    private void jmiProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProdutosActionPerformed
//        ViewProduto viewProduto = new ViewProduto();
//                    viewProduto.setVisible(true);
    }//GEN-LAST:event_jmiProdutosActionPerformed

    private void jmiUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuariosActionPerformed
//        ViewUsuario viewUsuario = new ViewUsuario();
//                    viewUsuario.setVisible(true);
    }//GEN-LAST:event_jmiUsuariosActionPerformed

    private void jmVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmVendasActionPerformed
        
    }//GEN-LAST:event_jmVendasActionPerformed

    private void jmVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmVendasMouseClicked
//    new ViewVendas().setVisible(true);
    }//GEN-LAST:event_jmVendasMouseClicked

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmArquivos;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmVendas;
    private javax.swing.JMenuItem jmiClientes;
    private javax.swing.JMenuItem jmiProdutos;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiUsuarios;
    // End of variables declaration//GEN-END:variables
}
