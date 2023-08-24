/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * @author pablo
 */
public class InformacionVehiculo {
    private int modelo;
    private int capacidad;
    private String tipoCarroceria;    
    private String marca;
    private String placa ;  
    
    public InformacionVehiculo(int modelo, int capacidad, String tipoCarroceria, String marca, String placa){
    
    this.capacidad=capacidad;
    this.tipoCarroceria = tipoCarroceria;
    this.marca=marca;
    this.modelo=modelo;        
    this.placa=placa;
    
    
    
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
   