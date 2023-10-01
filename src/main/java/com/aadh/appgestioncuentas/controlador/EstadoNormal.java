package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.modelo.Usuario;

public class EstadoNormal implements EstadoUsuario {
    @Override
    public void intentoExitoso(Usuario usuario) {
        // No hacer nada especial en caso de intento exitoso en el estado normal
    }

    @Override
    public void intentoFallido(Usuario usuario) {
        usuario.incrementarIntentosFallidos();
        if (usuario.getIntentosFallidos() >= 3) {
            usuario.setEstado(new EstadoBloqueado());
        }
    }

    @Override
    public boolean isCuentaBloqueada() {
        return false;
    }
}
