package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.vista.FrmHome;

/**
 * Implementación de la interfaz {@link ComportamientoRol} para el rol de Administrador.
 *
 * <p>Esta implementación muestra la ventana de inicio (FrmHome) cuando se invoca el método
 * {@link #mostrarFormulario()}.</p>
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 *
 */

public class ComportamientoAdmin implements ComportamientoRol{

    /**
     * {@inheritDoc}
     * <p>Muestra la ventana de inicio (FrmHome) correspondiente al rol de Administrador.</p>
     */
    @Override
    public void mostrarFormulario() {
        FrmHome frmHome = new FrmHome();
        frmHome.setVisible(true);
    }
}
