package com.aadh.appgestioncuentas.modelo;

import com.aadh.appgestioncuentas.controlador.ControladorUsuario;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        String patron = "^[a-z0-9]+$";
        String password=new String(contrasena);
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(password);
        charvalido=matcher.matches();
        boolean contrasenaValida = contrasena.length == 6;

        if (!contrasenaValida) {
            mostrarMensajeError("La contraseña debe tener al menos 6 caracteres.");
        }else if(!charvalido){
            mostrarMensajeError("La contraseña debe tener letras minusculas y números");
        }

        return contrasenaValida && charvalido;
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
