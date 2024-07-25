package com.ajulieazvdo.usuario.application.service;

import com.ajulieazvdo.usuario.application.api.UsuarioRequest;
import com.ajulieazvdo.usuario.application.api.UsuarioResponse;
import com.ajulieazvdo.usuario.application.repository.UsuarioRepository;
import com.ajulieazvdo.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioApplicationService implements UsuarioService {
    private final UsuarioRepository usuarioRepository;
    @Override
    public UsuarioResponse salvarUsuario(UsuarioRequest usuarioRequest) {
        log.info("[inicia] UsuarioApplicationService - salvarUsuario");
        Usuario usuario = usuarioRepository.salvarUsuario(new Usuario(usuarioRequest));
        log.info("[finaliza] UsuarioApplicationService - salvarUsuario");
        return new UsuarioResponse(usuario);
    }
}
