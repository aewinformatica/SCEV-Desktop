/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aewinformatica.scev.desktop.repository;

import com.aewinformatica.scev.desktop.model.Usuario;
import com.aewinformatica.scev.desktop.repository.helper.usuario.UsuariosQueries;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jessica
 */
public interface Usuarios extends JpaRepository<Usuario,Long>,UsuariosQueries{
    
  
}
