/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aewinformatica.scev.desktop.controller;

import com.aewinformatica.scev.desktop.model.Usuario;
import com.aewinformatica.scev.desktop.model.UsuarioTableModel;
import com.aewinformatica.scev.desktop.service.UsuarioService;
import com.aewinformatica.scev.desktop.view.ViewUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Jessica
 */
@Controller
public class ControllerUsuario extends  AbstractFrameController{

    private ViewUsuario viewUsuario;
    private UsuarioTableModel usuarioTableModel;
    private UsuarioService usuarioService;

    @Autowired
    public ControllerUsuario(ViewUsuario viewUsuario, UsuarioTableModel usuarioTableModel, UsuarioService usuarioService) {
        this.viewUsuario = viewUsuario;
        this.usuarioTableModel = usuarioTableModel;
        this.usuarioService = usuarioService;
    }
    
    public void CarregarUsuarios() {
        List<Usuario> usuarios = usuarioService.findAll();
        usuarioTableModel.clear();
        usuarioTableModel.addEntities(usuarios);
    }
    
    public void exibirView() {
        this.viewUsuario.setVisible(true);
    }

    @Override
    public void preparaExibirView() {
    
        CarregarUsuarios();
        exibirView();
    }
}
