package com.aadh.appgestioncuentas.modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * Clase que proporciona métodos para validar información, como nombres de usuario y contraseñas,
 * y para mostrar mensajes de error o éxito.
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 *
 */
public class Validador {

    /**
     * Valida un nombre de usuario.
     *
     * @param nombreUsuario Nombre de usuario a validar.
     * @param usuario Objeto Usuario asociado para comprobar si la cuenta está bloqueada.
     * @return true si el nombre de usuario es válido; false en caso contrario.
     */
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

    /**
     * Valida una contraseña.
     *
     * @param contrasena Contraseña a validar.
     * @return true si la contraseña es válida; false en caso contrario.
     */
    public boolean validarContrasena(char[] contrasena) {
        // Lógica de validación de la contraseña
        String patron = "^[a-z0-9]+$";
        String password=new String(contrasena);
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(password);

        Boolean charvalido=matcher.matches();
        boolean contrasenaValida = contrasena.length == 6;
        
        if (!contrasenaValida) {
            mostrarMensajeError("La contraseña debe tener al menos 6 caracteres.");
        }else if(!charvalido){
            mostrarMensajeError("La contraseña debe tener letras minusculas y números");
        }

        return contrasenaValida && charvalido;
    }

    /**
     * Muestra un mensaje de error.
     *
     * @param mensaje Mensaje de error a mostrar.
     */
    public void mostrarMensajeError(String mensaje) {
        // Método para mostrar mensajes de error (puedes usar JOptionPane o cualquier otro método de tu elección)
        JOptionPane.showMessageDialog(null, "Error: " + mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Muestra un mensaje de éxito o correcto.
     *
     * @param mensaje Mensaje de éxito a mostrar.
     */
    public void mostrarMensajeCorrecto(String mensaje) {
        // Método para mostrar mensajes de éxito o correctos
        JOptionPane.showMessageDialog(null, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
