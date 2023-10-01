package com.aadh.appgestioncuentas.modelo;

import com.aadh.appgestioncuentas.controlador.EstadoNormal;
import com.aadh.appgestioncuentas.controlador.EstadoUsuario;

import java.time.LocalDateTime;

/**
 *
 *  Clase que representa a un usuario en el sistema.
 *
 *  <p>Esta clase incluye información básica sobre un usuario, como su nombre de usuario,
 *  contraseña y estado actual. Además, registra el número de intentos de inicio de sesión fallidos
 *  y la fecha de bloqueo en caso de exceder los intentos permitidos.</p>
 *
 * @author
 *   - Aguilar Villafana
 *   - Angeles Rodriguez
 *   - Dueñas Blas
 *   - Hurtado Ramos
 * 
 */
public class Usuario {
    /**
     * Nombre de usuario del usuario.
     */
    private String username;
    /**
     * Contraseña del usuario.
     */
    private String password;
    /**
     * Estado actual del usuario.
     */
    private EstadoUsuario estado;
    /**
     * Número de intentos de inicio de sesión fallidos.
     */
    private int intentosFallidos;
    /**
     * Fecha y hora de bloqueo de la cuenta en caso de exceder los intentos fallidos permitidos.
     */
    private LocalDateTime fechaBloqueo;

    /**
     * Constructor de la clase Usuario.
     *
     * @param username Nombre de usuario.
     * @param password Contraseña.
     */
    public Usuario(String username, String password) {
        this.username = username;
        this.name = name;
        this.state="active";
        this.rol = rol;
        this.password = password;
        this.estado = new EstadoNormal();
        this.intentosFallidos = 0;
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

    public LocalDateTime getFechaBloqueo() {
        return fechaBloqueo;
    }

    public void setFechaBloqueo(LocalDateTime fechaBloqueo) {
        this.fechaBloqueo = fechaBloqueo;
    }

}
