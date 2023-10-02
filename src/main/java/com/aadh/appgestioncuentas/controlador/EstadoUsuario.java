package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.modelo.Usuario;

/**
 * Interfaz que define el comportamiento del estado de un usuario en el sistema.
 *
 * <p>Los estados implementan este interfaz para manejar los intentos exitosos y fallidos
 * de inicio de sesión, así como para determinar si la cuenta está bloqueada.</p>
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 *
 */
public interface EstadoUsuario {

    /**
     * Maneja un intento exitoso de inicio de sesión.
     *
     * @param usuario Usuario que realizó el intento.
     */
    void intentoExitoso(Usuario usuario);

    /**
     * Maneja un intento fallido de inicio de sesión.
     *
     * @param usuario Usuario que realizó el intento.
     */
    void intentoFallido(Usuario usuario);

    /**
     * Verifica si la cuenta está bloqueada.
     *
     * @return true si la cuenta está bloqueada; false en caso contrario.
     */
    boolean isCuentaBloqueada();

}
