package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.modelo.Usuario;

/**
 * Clase que implementa la interfaz EstadoUsuario y representa el estado de cuenta bloqueada de un usuario en el sistema.
 *
 * <p>En este estado, no se permiten intentos de inicio de sesión exitosos o fallidos, ya que la cuenta está bloqueada.</p>
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 *
 */

public class EstadoBloqueado implements EstadoUsuario {

    /**
     * Maneja un intento exitoso de inicio de sesión.
     *
     * @param usuario Usuario que realizó el intento.
     */
    @Override
    public void intentoExitoso(Usuario usuario) {
        // No hacer nada, la cuenta está bloqueada
    }

    /**
     * Maneja un intento fallido de inicio de sesión.
     *
     * @param usuario Usuario que realizó el intento.
     */
    @Override
    public void intentoFallido(Usuario usuario) {
        // No hacer nada, la cuenta ya está bloqueada
    }

    /**
     * Verifica si la cuenta está bloqueada.
     *
     * @return true, ya que la cuenta está bloqueada en este estado.
     */
    @Override
    public boolean isCuentaBloqueada() {
        return true;
    }
}
