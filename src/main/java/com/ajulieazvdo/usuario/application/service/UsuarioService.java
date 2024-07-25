package com.ajulieazvdo.usuario.application.service;

import com.ajulieazvdo.usuario.application.api.UsuarioEditaRequest;
import com.ajulieazvdo.usuario.application.api.UsuarioRequest;
import com.ajulieazvdo.usuario.application.api.UsuarioResponse;

public interface UsuarioService {
    UsuarioResponse salvarUsuario(UsuarioRequest usuarioRequest);

    void editarUsuario(String idUsuario, UsuarioEditaRequest usuarioRequest);
}
