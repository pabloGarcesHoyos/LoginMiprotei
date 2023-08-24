


import concurso.RegistroMascotas;
import concurso.Mascota;
public class ControladorMascotas {
    private final RegistroMascotas registro;

    public ControladorMascotas() {
        registro = new RegistroMascotas();
    }

    public void registrarMascota(String nombre, String raza, String tipo, int codigo, double peso) {
        registro.registrarMascota(nombre, raza, tipo, codigo, peso);
    }

    public void eliminarMascota(int codigo) {
        registro.eliminarMascota(codigo);
    }

    public void actualizarMascota(int codigo, String nuevoNombre, String nuevaRaza, double nuevoPeso) {
        registro.actualizarMascota(codigo, nuevoNombre, nuevaRaza, nuevoPeso);
    }

    String listarMascotas() {
        return registro.getNombre();
    }

    public Mascota generarGanador() {
        return registro.generarGanador();
    }
}