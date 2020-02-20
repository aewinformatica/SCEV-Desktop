/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aewinformatica.scev.desktop.controller;

import com.aewinformatica.scev.desktop.view.ViewLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Jessica
 */
@Controller
public class ControllerLogin {

    @Autowired
    private ViewLogin viewLogin;

    public void exibirView() {
        viewLogin.setVisible(true);
    }

}
