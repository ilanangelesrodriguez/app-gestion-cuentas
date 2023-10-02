/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aadh.appgestioncuentas.modelo;

import com.aadh.appgestioncuentas.controlador.EstadoUsuario;

/**
 * Clase que representa un rol en el sistema.
 *
 * <p>Un rol tiene un nombre que lo identifica y un estado que indica su situación actual.</p>
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 *
 */
public class Rol {
    /**
     * Nombre que identifica al rol.
     */
    private String nombre;

    /**
     * Estado actual del rol.
     */
    private EstadoUsuario estado;

    /**
     * Constructor de la clase Rol.
     *
     * @param nombre Nombre que identifica al rol.
     * @param estado Estado inicial del rol.
     */
    public Rol(String nombre, EstadoUsuario estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    /**
     * Obtiene el nombre del rol.
     *
     * @return Nombre del rol.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del rol.
     *
     * @param nombre Nuevo nombre del rol.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el estado actual del rol.
     *
     * @return Estado actual del rol.
     */
    public EstadoUsuario getEstado() {
        return estado;
    }

    /**
     * Establece el estado del rol.
     *
     * @param estado Nuevo estado del rol.
     */
    public void setEstado(EstadoUsuario estado) {
        this.estado = estado;
    }

}
