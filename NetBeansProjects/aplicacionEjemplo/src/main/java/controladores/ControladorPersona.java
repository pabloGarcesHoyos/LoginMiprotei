package controladores;

import Aplicacion.Persona;

public class ControladorPersona {
    Persona[] personas;

    arrayList<Persona> listaPersona;
    
    public controladorPersona(){
        
    }
   
    
    
    
    
    
    
    
    
    
    
    

    public ControladorPersona(Persona[] personas) {
        personas = new Persona[3];
    }

    public boolean guardarPersona(Persona persona) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) {
                Persona Persona = null;
                personas[i] = Persona;
            }
        }                                                                               
        return false;
    }

    public Persona buscarPersona(String cedula) {
       Persona auxiliar= buscarPersona(persona.getCedula());
               
        for (int i = 0; i < personas.length; i++) {

            if (personas[i] != null
                    && personas[i].getCedula().equals(cedula)) {

                return personas[i];
            }
        }
        return null;
    }
    Persona auxiliar = buscarListaPersona(cedula);
    if (auxiliar!=null){
    listaPersona.remove(auxiliar);
}
    
public boolean  actualizarPersona(String cedula, int edad, String nombre){
    Persona auxiliar = buscarPersona (cedula);
    if (auxiliar!=null){
    
}

