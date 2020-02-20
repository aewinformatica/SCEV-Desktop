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

    @Autowired
    private ViewPrincipal viewPrincipal;

    @Autowired
    public void exibirView() {
        this.viewPrincipal.setVisible(true);
    }
}
