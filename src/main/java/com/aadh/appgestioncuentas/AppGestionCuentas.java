package com.aadh.appgestioncuentas;

import com.aadh.appgestioncuentas.controlador.ControladorRol;
import com.aadh.appgestioncuentas.controlador.ControladorUsuario;
import com.aadh.appgestioncuentas.controlador.LoginUsuario;
import com.aadh.appgestioncuentas.modelo.Rol;
import com.aadh.appgestioncuentas.vista.VistaLogin;
import javax.swing.SwingUtilities;

/**
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 * 
 */
public class AppGestionCuentas {

    public static void main(String[] args) {
        // Obtén la instancia de LoginUsuario
        LoginUsuario lu = LoginUsuario.getInstance();

        // Crea una instancia de ControladorUsuario pasando la lista de usuarios
        ControladorUsuario controladorUsuario = new ControladorUsuario(lu.getUsuarios());
        ControladorRol controladorRol=new ControladorRol(lu.getRoles());
        // Llama al método para agregar un nuevo usuario
        
            
        controladorUsuario.agregarUsuario("Maria","maria",controladorRol.readRol("Admin"), "nuevaContraseña");

        // Imprime la lista actualizada de usuarios
        System.out.println("Lista de usuarios actualizada: " + lu.getUsuarios());

        System.out.println(lu.getUsuarios().get(3).getUsername());
    }
}
