/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author pablo
 */
public class Veterinario extends Persona {
    private final String rol = "veterinario";
    public Veterinario(String usuario, String contrasena, String rol) {
        super(usuario, contrasena);
    }

    public String getRol() {
        return rol;
    }

}
