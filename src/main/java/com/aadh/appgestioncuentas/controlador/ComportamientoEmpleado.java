package com.aadh.appgestioncuentas.controlador;

import javax.swing.*;

/**
 * Implementación de la interfaz {@link ComportamientoRol} para el rol de Empleado.
 *
 * <p>Esta implementación muestra un mensaje informativo indicando que la sección está en desarrollo
 * cuando se invoca el método {@link #mostrarFormulario()}.</p>
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 *
 */

public class ComportamientoEmpleado implements ComportamientoRol {

    /**
     * {@inheritDoc}
     * <p>Muestra un mensaje informativo indicando que la sección está en desarrollo.</p>
     */
    @Override
    public void mostrarFormulario() {
        JOptionPane.showMessageDialog(null, "Esta sección esta en desarrollo.", "Información para el usuario", JOptionPane.INFORMATION_MESSAGE);

    }
}
