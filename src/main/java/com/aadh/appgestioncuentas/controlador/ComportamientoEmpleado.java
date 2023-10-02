package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.vista.FrmVisor;

public class ComportamientoEmpleado implements ComportamientoRol {
    @Override
    public void mostrarFormulario() {
        FrmVisor frmVisor = new FrmVisor();
        frmVisor.setVisible(true);
    }
}
