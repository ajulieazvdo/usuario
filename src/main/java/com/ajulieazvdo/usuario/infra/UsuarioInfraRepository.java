package com.ajulieazvdo.usuario.infra;

import com.ajulieazvdo.usuario.application.repository.UsuarioRepository;
import com.ajulieazvdo.usuario.domain.Usuario;
import com.ajulieazvdo.usuario.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class UsuarioInfraRepository implements UsuarioRepository {
    private final UsuarioSpringDataJpaRepository usuarioSpringDataJpaRepository;
    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        log.info("[inicia] UsuarioInfraRepository - salvarUsuario");
        usuarioSpringDataJpaRepository.save(usuario);
        log.info("[finaliza] UsuarioInfraRepository - salvarUsuario");
        return usuario;
    }

    @Override
    public Usuario buscarUsuarioPorId(String idUsuario) {
        log.info("[inicia] UsuarioInfraRepository - buscarUsuarioPorId");
        Usuario usuario = usuarioSpringDataJpaRepository.findById(idUsuario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Usuario não encontrado!"));
        log.info("[finaliza] UsuarioInfraRepository - buscarUsuarioPorId");
        return usuario;
    }
}
