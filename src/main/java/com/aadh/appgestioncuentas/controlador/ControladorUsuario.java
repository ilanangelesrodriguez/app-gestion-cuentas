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
public class ControladorUsuario {
    private List<Usuario> listaUsuarios;

    public ControladorUsuario(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    public void agregarUsuario(String username, String password) {
        Usuario nuevoUsuario = new Usuario(username, password);
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

}
