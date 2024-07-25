package com.ajulieazvdo.usuario;

import com.ajulieazvdo.usuario.application.api.UsuarioEditaRequest;
import com.ajulieazvdo.usuario.application.api.UsuarioRequest;
import com.ajulieazvdo.usuario.domain.Usuario;

public class DataHelper {
    public static final String usuario1 = "a713162f-20a9-4db9-a85b-90cd51ab18f4";

    public static Usuario createUsuario() {
        return Usuario.builder().email("email@email.com").nome("Azuna").idUsuario(usuario1).build();
    }

    public static UsuarioRequest createUsuarioRequest(){
        return new UsuarioRequest(createUsuario().getSenha(), createUsuario().getNome(), createUsuario().getEmail());
    }

    public static UsuarioEditaRequest createUsuarioEditaRequest(){
        return new UsuarioEditaRequest("Juliana");
    }
}
