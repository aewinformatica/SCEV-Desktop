/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aewinformatica.scev.desktop.repository.helper.usuario;

import com.aewinformatica.scev.desktop.model.Usuario;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jessica
 */
public interface UsuariosQueries {
    
    @Autowired
    public Optional<Usuario> validarLoginSenha(String login, String senha );
}
