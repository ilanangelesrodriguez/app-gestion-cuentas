package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.modelo.Rol;
import com.aadh.appgestioncuentas.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que actúa como controlador para gestionar operaciones relacionadas con los usuarios en el sistema.
 *
 * <p>Permite agregar nuevos usuarios, buscar usuarios por nombre de usuario y obtener la lista completa de usuarios.</p>
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 *
 */
public class ControladorUsuario {

    private List<Usuario> listaUsuarios;

    /**
     * Constructor de la clase ControladorUsuario.
     *
     * @param listaUsuarios Lista de usuarios gestionada por el controlador.
     */
    public ControladorUsuario(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    /**
     * Agrega un nuevo usuario al sistema.
     *
     * @param nombreUsuario Nombre de usuario del nuevo usuario.
     * @param rol Rol asignado al nuevo usuario.
     * @param contrasena Contraseña del nuevo usuario.
     */
    public void agregarUsuario(String nombreUsuario,Rol rol, String contrasena) {
        Usuario nuevoUsuario = new Usuario(nombreUsuario, rol,contrasena);
        listaUsuarios.add(nuevoUsuario);
    }

    /**
     * Obtiene un usuario por su nombre de usuario.
     *
     * @param nombreUsuario Nombre de usuario del usuario a buscar.
     * @return El usuario encontrado o null si no se encuentra.
     */
    public Usuario obtenerUsuarioPorNombre(String nombreUsuario) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getUsername().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;  // Usuario no encontrado
    }

    /**
     * Obtiene una lista de todos los usuarios en el sistema.
     *
     * @return Lista de usuarios.
     */
    public List<Usuario> obtenerTodosLosUsuarios() {
        return new ArrayList<>(listaUsuarios);
    }
    public List<Usuario> obtenerUsuariosBLoqueados(){
        List<Usuario> usuarios=obtenerTodosLosUsuarios();
        List<Usuario> usuariosBloqueados=new ArrayList();
        for (Usuario usuario : usuarios) {
            if (usuario.isCuentaBloqueada()){
                usuariosBloqueados.add(usuario);
            }
        }
        return usuariosBloqueados;
    }

}
