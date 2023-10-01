package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.modelo.Usuario;

public class EstadoBloqueado implements EstadoUsuario {
    @Override
    public void intentoExitoso(Usuario usuario) {
        // No hacer nada, la cuenta está bloqueada
    }

    @Override
    public void intentoFallido(Usuario usuario) {
        // No hacer nada, la cuenta ya está bloqueada
    }

    @Override
    public boolean isCuentaBloqueada() {
        return true;
    }
}
