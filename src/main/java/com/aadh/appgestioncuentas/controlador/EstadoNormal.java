package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.modelo.Usuario;

import java.time.LocalDateTime;

/**
 * Clase que implementa la interfaz EstadoUsuario y representa el estado normal de un usuario en el sistema.
 *
 * <p>En el estado normal, no se realizan acciones especiales en caso de intentos exitosos de inicio de sesión.
 * Sin embargo, se manejan los intentos fallidos y se bloquea la cuenta si se exceden los límites permitidos.</p>
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 *
 */

public class EstadoNormal implements EstadoUsuario {

    /**
     * Maneja un intento exitoso de inicio de sesión.
     *
     * @param usuario Usuario que realizó el intento.
     */
    @Override
    public void intentoExitoso(Usuario usuario) {
        // No hacer nada especial en caso de intento exitoso en el estado normal
    }

    /**
     * Maneja un intento fallido de inicio de sesión.
     *
     * @param usuario Usuario que realizó el intento.
     */
    @Override
    public void intentoFallido(Usuario usuario) {
        usuario.incrementarIntentosFallidos();
        if (usuario.getIntentosFallidos() >= 3) {
            usuario.setEstado(new EstadoBloqueado());
            usuario.setFechaBloqueo(LocalDateTime.now());
        }
    }

    /**
     * Verifica si la cuenta está bloqueada.
     *
     * @return false, ya que en el estado normal la cuenta no está bloqueada.
     */
    @Override
    public boolean isCuentaBloqueada() {
        return false;
    }
}
