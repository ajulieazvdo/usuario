package com.ajulieazvdo.usuario.application.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public record UsuarioRequest(@Size(min = 6) String senha, String nome, @Email String email) {
}
