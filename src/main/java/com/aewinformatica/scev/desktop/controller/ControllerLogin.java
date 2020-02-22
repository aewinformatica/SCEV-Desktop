/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aewinformatica.scev.desktop.controller;

import com.aewinformatica.scev.desktop.model.Usuario;
import com.aewinformatica.scev.desktop.service.LoginService;
import com.aewinformatica.scev.desktop.view.ViewLogin;
import com.aewinformatica.scev.desktop.view.ViewPrincipal;
import javax.annotation.PostConstruct;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Jessica
 */
@Controller
public class ControllerLogin extends AbstractFrameController {

    @Autowired
    private ViewLogin viewLogin;

//    @Autowired
//    private Usuario usuario;

    @Autowired
    private ViewPrincipal viewPrincipal;

    @Autowired
    private LoginService loginService;

    public void exibirView() {
        viewLogin.setVisible(true);
    }

    @Override
    public void preparaExibirView() {
        exibirView();

    }

    public void validarUsuario(Usuario usuario) {
        
        if (loginService.validarUsuario(usuario)) {

            viewPrincipal.setVisible(true);
            viewLogin.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(viewLogin, "Usuario/Senha Invalidos", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
    }
}
