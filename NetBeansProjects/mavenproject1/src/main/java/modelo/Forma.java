/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pablo
 */
public abstract class Forma {
    private String color;

    public Forma(String color) {
        this.color = color;
    }
    public abstract void dibujar();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    }
    

