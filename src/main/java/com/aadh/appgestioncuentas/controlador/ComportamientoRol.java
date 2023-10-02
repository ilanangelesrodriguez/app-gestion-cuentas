package com.aadh.appgestioncuentas.controlador;

/**
 * Interfaz que define el comportamiento asociado a un determinado rol en el sistema.
 *
 * <p>Cada implementación de esta interfaz proporciona la lógica específica para mostrar el formulario
 * correspondiente a un rol particular.</p>
 *
 * <p>Implementado por clases como {@link ComportamientoAdmin} y {@link ComportamientoEmpleado}.</p>
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 *
 */

public interface ComportamientoRol {

    /**
     * Método que define cómo mostrar el formulario asociado al rol.
     */
    void mostrarFormulario();

}
