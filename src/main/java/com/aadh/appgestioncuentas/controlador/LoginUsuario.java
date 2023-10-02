package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.modelo.Rol;
import com.aadh.appgestioncuentas.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona la autenticación de usuarios en el sistema.
 *
 * <p>La clase utiliza el patrón Singleton para garantizar una única instancia global de la clase.</p>
 *
 * <p>Proporciona métodos para autenticar usuarios, encontrar usuarios por nombre de usuario, y
 * mantener listas de usuarios y roles en el sistema.</p>
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 * 
 */
public class LoginUsuario {

    /**
     * Instancia única de la clase LoginUsuario (patrón Singleton).
     */
    private static LoginUsuario instance;

    /**
     * Lista de usuarios registrados en el sistema.
     */
    private List<Usuario> usuarios;

    /**
     * Lista de roles disponibles en el sistema.
     */
    private List<Rol> roles;

    /**
     * Obtiene la lista de usuarios registrados.
     *
     * @return Lista de usuarios.
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Obtiene la lista de roles disponibles en el sistema.
     *
     * @return Lista de roles.
     */
    public List<Rol> getRoles(){
        return roles;
    }

    /**
     * Constructor privado para evitar instanciación directa.
     *
     * <p>Inicializa las listas de usuarios y roles, y agrega algunos usuarios y roles de ejemplo.</p>
     */
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

    /**
     * Obtiene la instancia única de la clase LoginUsuario (patrón Singleton).
     *
     * @return Instancia única de LoginUsuario.
     */
    public static LoginUsuario getInstance() {
        if (instance == null) {
            instance = new LoginUsuario();
        }
        return instance;
    }

    /**
     * Autentica a un usuario en el sistema.
     *
     * @param username Nombre de usuario.
     * @param password Contraseña.
     * @return true si las credenciales son válidas; false en caso contrario.
     */
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

    /**
     * Encuentra un usuario por su nombre de usuario.
     *
     * @param username Nombre de usuario a buscar.
     * @return Usuario encontrado o null si no se encuentra.
     */
    public Usuario encontrarUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                return usuario;
            }
        }
        return null;
    }

}

