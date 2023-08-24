/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * @author pablo
 */
public class Miembro {

    private String nombre;
    private int edad;
    private int numeroTelefono;
    private int cedula;
    private int codigoSuscripcion;
    private String fechaInicio;
    private String fechaVigente;
    private InformacionVehiculo informacionVehiculo;

    public Miembro(String nombre, String fechaInicio, String fechaVigente, int edad, int numeroTelefono, int cedula, int codigoSuscripcion,InformacionVehiculo informacionVehiculo) {

        this.cedula = cedula;
        this.codigoSuscripcion = codigoSuscripcion;
        this.edad = edad;
        this.fechaInicio = fechaInicio;
        this.fechaVigente = fechaVigente;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.informacionVehiculo = informacionVehiculo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCodigoSuscripcion() {
        return codigoSuscripcion;
    }

    public void setCodigoSuscripcion(int codigoSuscripcion) {
        this.codigoSuscripcion = codigoSuscripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaVigente() {
        return fechaVigente;
    }

    public void setFechaVigente(String fechaVigente) {
        this.fechaVigente = fechaVigente;
    }

    public InformacionVehiculo getInformacionVehiculo() {
        return informacionVehiculo;
    }

    public void setInformacionVehiculo(InformacionVehiculo informacionVehiculo) {
        this.informacionVehiculo = informacionVehiculo;
    }


    
}
