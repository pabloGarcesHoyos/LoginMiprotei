
package modelo;

public class Pregrado {
   private String nombre;
   private int codigo;
   private String fechaCreacion;
   private int facultad;

    public Pregrado(String nombre, String fechaCreacion, int facultad) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.facultad = facultad;
    }

    public Pregrado(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getFacultad() {
        return facultad;
    }

    public void setFacultad(int facultad) {
        this.facultad = facultad;
    }
   
}
