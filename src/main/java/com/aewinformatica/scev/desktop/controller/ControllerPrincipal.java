package com.aewinformatica.scev.desktop.controller;

import com.aewinformatica.scev.desktop.view.ViewPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Jessica
 */
@Controller
public class ControllerPrincipal {

    //Caso nao sejam Autowired e obrigatorio o Constructor
    @Autowired
    private ViewPrincipal viewPrincipal;
    
    @Autowired
    private ControllerLogin controllerLogin;

    @Autowired
    public void exibirView() {
        this.viewPrincipal.setVisible(false);
        this.controllerLogin.exibirView();
    }
}
