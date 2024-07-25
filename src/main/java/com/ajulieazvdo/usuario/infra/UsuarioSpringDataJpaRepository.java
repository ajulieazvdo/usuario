package com.ajulieazvdo.usuario.infra;

import com.ajulieazvdo.usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioSpringDataJpaRepository extends JpaRepository<Usuario, String> {
}
