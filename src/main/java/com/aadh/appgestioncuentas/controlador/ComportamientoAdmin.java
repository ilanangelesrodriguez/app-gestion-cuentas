package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.vista.FrmHome;

public class ComportamientoAdmin implements ComportamientoRol{
    @Override
    public void mostrarFormulario() {
        FrmHome frmHome = new FrmHome();
        frmHome.setVisible(true);
    }
}
