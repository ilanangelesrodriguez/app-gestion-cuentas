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
        roles.add(new Rol("Admin","Active"));
        roles.add(new Rol("Empleado","Active"));
        
        // Agregar algunos usuarios para propósitos de ejemplo
        usuarios.add(new Usuario("usuario1","ilan",roles.get(0), "123456"));
        usuarios.add(new Usuario("usuario2","Ronald",roles.get(0), "max123"));
        usuarios.add(new Usuario("usuario3","Joseph",roles.get(0), "123456"));
        usuarios.add(new Usuario("usuario4","Juan José",roles.get(1), "123456"));
        System.out.println(usuarios.get(2).getUsername());

    }

    public static void main(String[] args) {
        System.out.println();
        LoginUsuario loginUsuario = new LoginUsuario();
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

