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

    public boolean validarNombreUsuario(String nombreUsuario, Usuario usuario) {
        if (usuario != null && usuario.isCuentaBloqueada()) {
            mostrarMensajeError("La cuenta está bloqueada. Contacte al administrador.");
            return false;
        }

        // Lógica de validación del nombre de usuario
        boolean nombreUsuarioValido = !nombreUsuario.isEmpty();

        if (!nombreUsuarioValido) {
            mostrarMensajeError("El nombre de usuario no puede estar vacío.");
        }

        return nombreUsuarioValido;
    }
    
    public boolean validarContrasena(char[] contrasena) {
        // Lógica de validación de la contraseña
        boolean contrasenaValida = contrasena.length == 6;

        if (!contrasenaValida) {
            mostrarMensajeError("La contraseña debe tener al menos 6 caracteres.");
        }

        return contrasenaValida;
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
