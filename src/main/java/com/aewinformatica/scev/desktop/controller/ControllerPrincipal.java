package com.aewinformatica.scev.desktop.controller;

import com.aewinformatica.scev.desktop.view.ViewPrincipal;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Jessica
 */
@Controller
public class ControllerPrincipal extends AbstractFrameController{

    private ViewPrincipal viewPrincipal;
    private ControllerLogin controllerLogin;
    private ControllerUsuario controllerUsuario;

    @Autowired
    public ControllerPrincipal(ViewPrincipal viewPrincipal, ControllerLogin controllerLogin, ControllerUsuario controllerUsuario) {
        this.viewPrincipal = viewPrincipal;
        this.controllerLogin = controllerLogin;
        this.controllerUsuario = controllerUsuario;
    }
    
    @Override
    public void preparaExibirView(){      
        exibirViewLogin();     
    }
    
    public void exibirViewLogin(){
      this.controllerLogin.exibirView();   
    }
    public void exibirView() {
        this.viewPrincipal.setVisible(true);
    }
   
    public void exibirViewUsuario(){
        controllerUsuario.preparaExibirView();
    }
    
    @PostConstruct
    public void prepararListeners(){
        registerAction(viewPrincipal.getMenuItemUsuario(), (e) -> exibirViewUsuario());    
    }
}
