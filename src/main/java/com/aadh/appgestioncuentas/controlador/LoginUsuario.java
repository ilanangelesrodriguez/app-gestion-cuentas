package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.modelo.Rol;
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
    private List<Rol> roles;
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    public List<Rol> getRoles(){
        return roles;
    }

    public LoginUsuario() {
        // Constructor privado para evitar instanciación directa
        usuarios = new ArrayList<>();
        roles= new ArrayList<>();
        roles.add(new Rol("Admin",new EstadoNormal()));
        roles.add(new Rol("Empleado",new EstadoNormal()));
        
        // Agregar algunos usuarios para propósitos de ejemplo
        usuarios.add(new Usuario("usuario1",roles.get(0), "123456"));
        usuarios.add(new Usuario("usuario2",roles.get(0), "max123"));
        usuarios.add(new Usuario("usuario3",roles.get(0), "M23456"));
        usuarios.add(new Usuario("usuario4",roles.get(1), "123456"));


    }
    
    public static LoginUsuario getInstance() {
        if (instance == null) {
            instance = new LoginUsuario();
        }
        return instance;
    }

    public boolean autenticar(String username, String password) {
        Usuario usuario = encontrarUsuario(username);
        if (usuario != null && !usuario.isCuentaBloqueada()) {
            if (usuario.getPassword().equals(password)) {
                // Credenciales válidas
                usuario.intentoExitoso();
                System.out.println("Credenciales válidas para usuario: " + usuario.getUsername());
                return true;
            } else {
                // Credenciales inválidas
                System.out.println("Intento de login fallido para usuario: " + username);
                usuario.intentoFallido();
            }
        } else {
            System.out.println("La cuenta está bloqueada. Contacte al administrador.");
        }
        return false;
    }

    public Usuario encontrarUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                return usuario;
            }
        }
        return null;
    }

}

