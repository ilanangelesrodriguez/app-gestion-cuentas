package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.vista.Trabajo;

public class ComportamientoEmpleado implements ComportamientoRol {
    @Override
    public void mostrarFormulario() {
        Trabajo trabajo = new Trabajo();
        trabajo.setVisible(true);
    }
}
