package com.ajulieazvdo.usuario.application.service;

import com.ajulieazvdo.usuario.DataHelper;
import com.ajulieazvdo.usuario.application.api.UsuarioEditaRequest;
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
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

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

    @Test
    void deveEditarUsuario(){
        UsuarioEditaRequest usuarioEditaRequest = DataHelper.createUsuarioEditaRequest();
        String idUsuario = DataHelper.usuario1;
        Usuario usuario = DataHelper.createUsuario();
        when(usuarioRepository.buscarUsuarioPorId(anyString())).thenReturn(usuario);
        usuarioApplicationService.editarUsuario(idUsuario, usuarioEditaRequest);

        assertEquals("Juliana", usuarioEditaRequest.nome());
        verify(usuarioRepository, times(1)).salvarUsuario(usuario);
    }
}