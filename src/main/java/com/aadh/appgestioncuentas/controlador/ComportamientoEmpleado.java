package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.vista.FrmVisor;

import javax.swing.*;

public class ComportamientoEmpleado implements ComportamientoRol {
    @Override
    public void mostrarFormulario() {
        JOptionPane.showMessageDialog(null, "Esta sección esta en desarrollo.", "Información para el usuario", JOptionPane.INFORMATION_MESSAGE);

    }
}
