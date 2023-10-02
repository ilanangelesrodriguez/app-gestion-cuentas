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
public class ControladorUsuario {
    private List<Usuario> listaUsuarios;

    public ControladorUsuario(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    public void agregarUsuario(String nombreUsuario,Rol rol, String contrasena) {
        Usuario nuevoUsuario = new Usuario(nombreUsuario, rol,contrasena);
        listaUsuarios.add(nuevoUsuario);
    }

    public Usuario obtenerUsuarioPorNombre(String nombreUsuario) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getUsername().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;  // Usuario no encontrado
    }

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
