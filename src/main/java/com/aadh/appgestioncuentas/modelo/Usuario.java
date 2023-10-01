package com.aadh.appgestioncuentas.modelo;

import com.aadh.appgestioncuentas.controlador.EstadoNormal;
import com.aadh.appgestioncuentas.controlador.EstadoUsuario;

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
    private String username;
    private String password;
    private EstadoUsuario estado;
    private int intentosFallidos;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
        this.estado = new EstadoNormal();
        this.intentosFallidos = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isCuentaBloqueada() {
        return estado.isCuentaBloqueada();
    }

    public void intentoExitoso() {
        estado.intentoExitoso(this);
        intentosFallidos = 0;
    }

    public void intentoFallido() {
        estado.intentoFallido(this);
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public void incrementarIntentosFallidos() {
        intentosFallidos++;
    }

    public void setEstado(EstadoUsuario estado) {
        this.estado = estado;
    }
}
