/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aewinformatica.scev.desktop.service;

import com.aewinformatica.scev.desktop.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica
 */
@Service
public class LoginService {
    
    @Autowired
    private UsuarioService usuarioService;
    
    public boolean validarUsuario(Usuario pModelUsuario) {
        
        return usuarioService.validarUsuario(pModelUsuario);
        
    }
    
}
