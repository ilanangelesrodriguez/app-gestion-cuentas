package com.aadh.appgestioncuentas.modelo;

import com.aadh.appgestioncuentas.controlador.ControladorUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 *
 */
public class Validador {
    
    public boolean validarNombreUsuario(String nombreUsuario) {
        // Lógica de validación del nombre de usuario
        return !nombreUsuario.isEmpty();  // El nombre de usuario no debe estar vacío
    }
    
    public boolean validarContrasena(char[] contrasena) {
        // Lógica de validación de la contraseña
        return contrasena.length == 6;  // La contraseña debe tener al menos 6 caracteres
    }
    
    public void mostrarMensajeError(String mensaje) {
        // Método para mostrar mensajes de error (puedes usar JOptionPane o cualquier otro método de tu elección)
        JOptionPane.showMessageDialog(null, "Error: " + mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void mostrarMensajeCorrecto(String mensaje) {
        // Método para mostrar mensajes de éxito o correctos
        JOptionPane.showMessageDialog(null, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
