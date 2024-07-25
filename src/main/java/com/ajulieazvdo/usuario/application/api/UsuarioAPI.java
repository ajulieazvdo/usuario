package com.ajulieazvdo.usuario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/usuario")
public interface UsuarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UsuarioResponse criarUsuario(@RequestBody @Valid UsuarioRequest usuarioRequest);
}