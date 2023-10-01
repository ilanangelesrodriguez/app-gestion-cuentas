/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aadh.appgestioncuentas.controlador;

import com.aadh.appgestioncuentas.modelo.Rol;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxx1212
 */
public class ControladorRol {
    List<Rol> roles=new ArrayList<>();

    public ControladorRol() {
    }
    public void addRol(Rol rol){
        this.roles.add(rol);
    }
    public Rol readRol(String nameRol){
        for (Rol rol : roles) {
            if (rol.getNombre()==nameRol){
                return rol;
            }
            
        }
    }
    
    
}
