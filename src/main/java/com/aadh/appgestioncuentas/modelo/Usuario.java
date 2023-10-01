package com.aadh.appgestioncuentas.modelo;

import java.util.Date;

/**
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 * 
 */
public class Usuario {
    private final String username;
    private final String name;
    private String state;
    private Rol rol;
    private String password;
    private Date DateBlock;

    public Usuario(String username, String name, Rol rol, String password) {
        this.username = username;
        this.name = name;
        this.state="active";
        this.rol = rol;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public Boolean setPassword(String password) {
        char[] pass = password.toCharArray();
        if (Validador.validarContrasena(pass)){
            this.password = password;    
            return true;
        }
        else{
            return false;
        }
            
    }

    public Date getDateBlock() {
        return DateBlock;
    }

    public void setDateBlock(Date DateBlock) {
        this.DateBlock = DateBlock;
    }


}
