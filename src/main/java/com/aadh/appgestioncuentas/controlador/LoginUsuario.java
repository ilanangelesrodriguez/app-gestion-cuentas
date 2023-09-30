package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.modelo.Usuario;
import java.util.List;

/**
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 * 
 */
public class LoginUsuario {
    private static LoginUsuario instance;
    private List<Usuario> usuarios;

    public LoginUsuario() {
    }
    
    public static LoginUsuario getInstance() {
        if (instance == null) {
            instance = new LoginUsuario();
        }
        return instance;
    }
    
    public boolean autenticar(String username, String password) {
        // Lógica de autenticación aquí
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}

