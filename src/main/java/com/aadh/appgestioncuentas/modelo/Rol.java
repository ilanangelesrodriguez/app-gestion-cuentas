/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aadh.appgestioncuentas.modelo;

/**
 *
 * @author maxx1212
 */
public class Rol {
    private String Nombre;
    private String State;

    public Rol(String Nombre, String State) {
        this.Nombre = Nombre;
        this.State = State;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
}
