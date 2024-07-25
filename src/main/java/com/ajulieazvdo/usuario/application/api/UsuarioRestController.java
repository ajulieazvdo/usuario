package com.ajulieazvdo.usuario.application.api;

import com.ajulieazvdo.usuario.application.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class UsuarioRestController implements UsuarioAPI {
    private final UsuarioService usuarioService;
    @Override
    public UsuarioResponse criarUsuario(UsuarioRequest usuarioRequest) {
        log.info("[inicia] UsuarioRestController - criarUsuario");
        UsuarioResponse usuario = usuarioService.salvarUsuario(usuarioRequest);
        log.info("[finaliza] UsuarioRestController - criarUsuario");
        return usuario;
    }

    @Override
    public void editarUsuario(String idUsuario, UsuarioEditaRequest usuarioRequest) {
        log.info("[inicia] UsuarioRestController - editaUsuario");
        usuarioService.editarUsuario(idUsuario, usuarioRequest);
        log.info("[finaliza] UsuarioRestController - editaUsuario");
    }
}
