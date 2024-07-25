package com.ajulieazvdo.usuario.application.service;

import com.ajulieazvdo.usuario.DataHelper;
import com.ajulieazvdo.usuario.application.api.UsuarioRequest;
import com.ajulieazvdo.usuario.application.api.UsuarioResponse;
import com.ajulieazvdo.usuario.application.repository.UsuarioRepository;
import com.ajulieazvdo.usuario.domain.Usuario;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UsuarioApplicationServiceTest {
    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioApplicationService usuarioApplicationService;

    @Test
    void deveCriarUsuario(){
        Usuario usuario = DataHelper.createUsuario();
        UsuarioRequest usuarioRequest = DataHelper.createUsuarioRequest();

        when(usuarioRepository.salvarUsuario(any())).thenReturn(usuario);
        UsuarioResponse usuarioResponse = usuarioApplicationService.salvarUsuario(usuarioRequest);

        assertNotNull(usuarioResponse);
        assertEquals(usuario.getEmail(), usuarioRequest.email());
    }
}