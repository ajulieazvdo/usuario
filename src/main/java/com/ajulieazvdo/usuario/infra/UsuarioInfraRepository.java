package com.ajulieazvdo.usuario.infra;

import com.ajulieazvdo.usuario.application.repository.UsuarioRepository;
import com.ajulieazvdo.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
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
}
