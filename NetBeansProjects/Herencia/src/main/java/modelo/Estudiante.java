
package modelo;


public class Estudiante extends Persona {
    private int codigo;

    public Estudiante(int codigo, String nombre, int edad) {
        super(nombre,edad);
        this.codigo = codigo;
    }
        
        
    @Override
    public void imprimirDatos (){
      super.imprimirDatos();
    
        System.out.println("Codigo "+ codigo);
    
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
