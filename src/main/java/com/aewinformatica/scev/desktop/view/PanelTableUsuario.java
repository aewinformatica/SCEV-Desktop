package com.aewinformatica.scev.desktop.view;

import com.aewinformatica.scev.desktop.model.UsuarioTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jessica
 */
@Component
public class PanelTableUsuario extends javax.swing.JPanel {

    @Autowired
    public PanelTableUsuario(UsuarioTableModel usuarioTableModel) {
        this.usuarioTableModel = usuarioTableModel;
        initComponents();
    }

    /**
     * Creates new form PanelTableUsuario
     */
    private UsuarioTableModel usuarioTableModel;

    public PanelTableUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneWithTable = new javax.swing.JScrollPane();
        usuarioTable = new javax.swing.JTable(usuarioTableModel);

        setLayout(new java.awt.BorderLayout());

        paneWithTable.setViewportView(usuarioTable);

        add(paneWithTable, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public javax.swing.JTable getUsuarioTable(){
        
        return usuarioTable;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane paneWithTable;
    private javax.swing.JTable usuarioTable;
    // End of variables declaration//GEN-END:variables
}
