package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.modelo.Usuario;
import java.util.ArrayList;
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

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public LoginUsuario() {
        // Constructor privado para evitar instanciación directa
        usuarios = new ArrayList<>();

        // Agregar algunos usuarios para propósitos de ejemplo
        usuarios.add(new Usuario("usuario1", "1234567"));
        usuarios.add(new Usuario("usuario3", "123456"));
        usuarios.add(new Usuario("usuario3", "123456"));

    }
    
    public static LoginUsuario getInstance() {
        if (instance == null) {
            instance = new LoginUsuario();
        }
        return instance;
    }

    public boolean autenticar(String username, String password) {
        for (Usuario usuario : usuarios) {
            System.out.println("Comparando con usuario: " + usuario.getUsername());
            if (usuario.getUsername().equals(username) && usuario.getPassword().equals(password)) {
                System.out.println("Credenciales válidas para usuario: " + usuario.getUsername());
                return true;
            }
        }
        return false;
    }

}

