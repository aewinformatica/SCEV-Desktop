/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aewinformatica.scev.desktop.repository.helper.usuario;

import com.aewinformatica.scev.desktop.model.Usuario;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class UsuariosImpl implements UsuariosQueries {

    @PersistenceContext
    EntityManager manager;
    
    @Override
    public Optional<Usuario> validarLoginSenha(String login, String senha) {
                       return manager
				.createQuery("from Usuario where lower(login) = lower(:login) and senha= :senha", Usuario.class)
				.setParameter("login", login)
                                .setParameter("senha", senha)
                                .getResultList().stream().findFirst();
    }
    
}
