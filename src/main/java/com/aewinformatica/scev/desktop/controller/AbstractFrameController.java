/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aewinformatica.scev.desktop.controller;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

/**
 *
 * @author Jessica
 */
public abstract class AbstractFrameController {

    public abstract void preparaExibirView();

    protected void registerAction(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }
    
    protected void registerAction(JMenuItem menuItem, ActionListener listener) {
    	menuItem.addActionListener(listener);
    }
    
    protected void registerAction(JLabel jLabel, MouseAdapter listener) {
    	jLabel.addMouseListener(listener);
        
    }
}
