/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Taller1;

import Taller.InformacionVehiculo;
import Taller.Miembro;
import Taller.RegistroVehiculo;

public class TallerParqueadero {

    public static void main(String[] args) {
        InformacionVehiculo  imVehiculo1 = new InformacionVehiculo( 2012, 5 ,  "sedan" ,    "kia",  "GXN" );
        InformacionVehiculo  imVehiculo2 = new InformacionVehiculo( 2015, 5 ,  "van" ,    "Toyota",  "TGJ" );
        InformacionVehiculo  imVehiculo3 = new InformacionVehiculo( 2019, 5 ,  "sedan" ,    "BMW",  "IWF" );
       
        Miembro miembro1 = new Miembro("Felipe", "05/02/22", "05/02/22", 24,32061516,178388,432,imVehiculo1);
        Miembro miembro2 = new Miembro("Andres", "05/02/22", "05/02/22", 34,32087233,128394,567,imVehiculo2);
        Miembro miembro3 = new Miembro("Mateo", "05/02/22", "05/02/22", 28,3149793,13092,987,imVehiculo3);

        RegistroVehiculo vehiculo1 = new RegistroVehiculo(6,"05/02/22",8,"05/02/22",miembro1,2000);
        RegistroVehiculo vehiculo2 = new RegistroVehiculo(2,"05/02/22",4,"05/02/22",miembro2,2000);
        RegistroVehiculo vehiculo3 = new RegistroVehiculo(5,"05/02/22",9,"05/02/22",miembro3,2000);
        
        double tarifa1 = vehiculo1.calcularTarifa();
        double tarifa2 = vehiculo2.calcularTarifa();
        double tarifa3 = vehiculo3.calcularTarifa();
        
        System.out.println( "El miembro " + miembro1.getNombre() + " pago " + tarifa1 + " ingreso la fecha " + vehiculo1.getFechaEntrada() + " a las " + vehiculo1.getHoraEntrada() + "P.M" +" y salio a las " + vehiculo1.getHoraSalida()+" P.M"  + " ingreso con el vehiculo " + imVehiculo1.getMarca() + " con la placa " + imVehiculo1.getPlaca());
        System.out.println( "El miembro " + miembro2.getNombre() + " pago " + tarifa2 + " ingreso la fecha " + vehiculo2.getFechaEntrada() + " a las " + vehiculo2.getHoraEntrada() + "P.M" +" y salio a las " + vehiculo2.getHoraSalida()+" P.M"  + " ingreso con el vehiculo " + imVehiculo2.getMarca() + " con la placa " + imVehiculo2.getPlaca());
        System.out.println( "El miembro " + miembro3.getNombre() + " pago " + tarifa3 + " ingreso la fecha " + vehiculo3.getFechaEntrada() + " a las " + vehiculo3.getHoraEntrada() + "P.M" +" y salio a las " + vehiculo3.getHoraSalida()+" P.M"  + " ingreso con el vehiculo " + imVehiculo3.getMarca() + " con la placa " + imVehiculo3.getPlaca());

        
    }
}
