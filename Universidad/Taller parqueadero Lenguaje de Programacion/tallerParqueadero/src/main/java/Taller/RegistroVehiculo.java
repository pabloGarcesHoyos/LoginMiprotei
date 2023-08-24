/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * @author pablo
 */
public class RegistroVehiculo {

 
    private int horaEntrada;
    private String fechaEntrada;
    private int horaSalida;
    private String fechaSalida;
    private Miembro Miembro;
    private double tarifa;
public RegistroVehiculo(int horaEntrada, String fechaEntrada, int horaSalida, String fechaSalida,Miembro miembro,double tarifa){
    
 this.fechaEntrada=fechaEntrada;
 this.fechaSalida=fechaSalida;
 this.horaEntrada=horaEntrada;
 this.horaSalida=horaSalida;
 this.Miembro=miembro;
 this.tarifa=tarifa;
 
}

public double calcularTarifa (){
    double totalTarifa=(horaSalida-horaEntrada)*tarifa;
    return totalTarifa;
}



    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setMiembro(Miembro Miembro) {
        this.Miembro = Miembro;
    }

    public Miembro getMiembro() {
        return Miembro;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

}



