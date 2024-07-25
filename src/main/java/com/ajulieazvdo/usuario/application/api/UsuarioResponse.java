package com.ajulieazvdo.usuario.application.api;

import com.ajulieazvdo.usuario.domain.Usuario;

public record UsuarioResponse(String idUsuario, String nome, String email) {
    public UsuarioResponse (Usuario usuario){
        this(usuario.getIdUsuario(), usuario.getNome(), usuario.getEmail());
    }
}
