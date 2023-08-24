/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pablo
 */
public class Circulo extends Forma {

    public Circulo(String color) {
        super(color);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un circulo");   
    
    }
}
