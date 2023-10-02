/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.modelo.Rol;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que actúa como controlador para gestionar operaciones relacionadas con los roles en el sistema.
 *
 * <p>Permite agregar nuevos roles, buscar roles por nombre, actualizar el nombre de un rol y cambiar el estado de un rol.</p>
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 *
 */
public class ControladorRol {
    List<Rol> roles=new ArrayList<>();

    /**
     * Constructor de la clase ControladorRol.
     *
     * @param roles Lista de roles gestionada por el controlador.
     */
    public ControladorRol(List<Rol> roles) {
        this.roles=roles;
    }

    /**
     * Agrega un nuevo rol al sistema.
     *
     * @param rol Rol a agregar.
     */
    public void addRol(Rol rol){
        this.roles.add(rol);
    }

    /**
     * Busca un rol por su nombre.
     *
     * @param nameRol Nombre del rol a buscar.
     * @return El rol encontrado o null si no se encuentra.
     */
    public Rol readRol(String nameRol){
        for (Rol rol : roles) {
            if (rol.getNombre().equals(nameRol)){
                return rol;
            }
            
        }
        return null;
    }

    /**
     * Actualiza el nombre de un rol.
     *
     * @param nameRol Nombre del rol a actualizar.
     * @param change Nuevo nombre para el rol.
     */
    public void updateNameRol(String nameRol, String change){
        Rol rol=readRol(nameRol);
        rol.setNombre(change);
    }

    /**
     * Cambia el estado de un rol.
     *
     * @param nameRol Nombre del rol cuyo estado se cambiará.
     * @param change Nuevo estado para el rol.
     */
    public void downRol(String nameRol, EstadoUsuario change){
        Rol rol=readRol(nameRol);
        rol.setEstado(change);
    }

    /**
     * Obtiene una lista de todos los roles en el sistema.
     *
     * @return Lista de roles.
     */
    public List<Rol> obtenerTodosLosUsuarios() {
        return new ArrayList<>(roles);
    }
}
