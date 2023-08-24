/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal;

import Modelo.Administrador;
import Modelo.Cliente;
import Modelo.Veterinario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class ProyectoFinal {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente("pablo","123");
        clientes.add(cliente1);

        ArrayList<Administrador> administradores = new ArrayList<Administrador>();
        Administrador administrador1 = new Administrador("pabloA","1234");
        administradores.add(administrador1);

        ArrayList<Veterinario> veterianarios = new ArrayList<Veterinario>();
        Veterinario veterinario1 = new Veterinario("veteriario1","12345");
        veterianarios.add(veterinario1);

        

        String usuario = JOptionPane.showInputDialog("ingrese su usuario");
        String contrasena =JOptionPane.showInputDialog("ingrese su contraseña");

        arrayaa(clientes,administradores,veterianarios);
        
        for (Cliente cliente: clientes) {
            if(cliente.getUsuario().equals(usuario) && cliente.getContrasena().equals(contrasena)){
                JOptionPane.showMessageDialog(null,"usted es cliente");
            }
            else{
                for (Administrador administrador: administradores) {
                    if (administrador.getUsuario().equals(usuario) && administrador.getContrasena().equals(contrasena)) {
                        JOptionPane.showMessageDialog(null,"usted es administrador");
                    }
                    else{
                        for (Veterinario veterinario: veterianarios) {
                            if (veterinario.getUsuario().equals(usuario) && veterinario.getContrasena().equals(contrasena)){
                                JOptionPane.showMessageDialog(null,"usted es veterinario");
                            }
                            else JOptionPane.showMessageDialog(null,"LAS CREDENCIALES NO COINCIDEN");
                        }
                    }
                }
            }
        }
    }
    public static void arrayaa(ArrayList<Cliente> miArrayList,ArrayList<Administrador> miArrayList2,ArrayList<Veterinario> miArrayList3){
       
    }
    public static void validar(String usuario, String contraArrayList<Cliente> miArrayList,ArrayList<Administrador> miArrayList2,ArrayList<Veterinario> miArrayList3){
        String user = usuario;
        String contrasena = contra;
    }
}
