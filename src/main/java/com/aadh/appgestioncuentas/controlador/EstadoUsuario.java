package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.modelo.Usuario;

public interface EstadoUsuario {
    void intentoExitoso(Usuario usuario);

    void intentoFallido(Usuario usuario);

    boolean isCuentaBloqueada();
}
