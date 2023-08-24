package concurso;
public class Mascota {
    private String mascota;
    private String raza;
    private String nombre;
    private int codigo;
    private double peso;   

    public Mascota(String mascota, String raza, String nombre, int codigo, double peso) {
        this.mascota = mascota;
        this.raza = raza;
        this.nombre = nombre;
        this.codigo = codigo;
        this.peso = peso;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    
}
