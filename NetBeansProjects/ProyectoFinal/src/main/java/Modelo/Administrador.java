/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author pablo
 */
public class Administrador extends Persona {
        private final String rol = "Administrador";

    public Administrador(String usuario, String contrasena) {
        super(usuario, contrasena);
    }

    public String getRol() {
        return rol;
    }
}
