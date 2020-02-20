/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aewinformatica.scev.desktop.service;

import com.aewinformatica.scev.desktop.model.Usuario;
import com.aewinformatica.scev.desktop.repository.Usuarios;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica
 */
@Service
public class UsuarioService {

    private Usuarios usuarios;

    public UsuarioService(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public List<Usuario> findAll() {

        return usuarios.findAll();
    }

    public void salvar(Usuario usuario) {

        usuarios.save(usuario);
    }

    public void remover(Usuario usuario) {
        usuarios.delete(usuario);
    }

    public boolean validarUsuario(Usuario usuario) {

        Optional<Usuario> usuarioEncontrado = usuarios.validarLoginSenha(usuario.getLogin(), usuario.getSenha());

        return usuarioEncontrado.isPresent();

    }
}
