/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transport;

/**
 *
 * @author manana
 */
public class TestVehiculo2 {
    public static void main(String[] args) {
        Vehiculo2 v1 = new Vehiculo2("ABC1234", "coche", (short)2020, 100);
        Vehiculo2 v2 = new Vehiculo2("ABCDF1234", "coche", (short)2030, -20);
        Vehiculo2 v3 = new Vehiculo2(v1);
        Vehiculo2 v4 = new Vehiculo2("ABC1234", "Moto", (short)2020, 100);
        Vehiculo2 v5 = new Vehiculo2("ABC1234", "moto", (short)2020, 100);
        Vehiculo2 v6 = new Vehiculo2("ABC1234", "tractor", (short)1900, 100);
        
        v1.show();
        v2.show();
        v4.show();
        
        System.out.println();
        System.out.println("Probando actualizarKilometraje");
        System.out.println(v1.actualizarKilometraje(50));
        System.out.println(v2.actualizarKilometraje(50));
        
        System.out.println();
        System.out.println("Probando marcarParaMantenimiento");
        System.out.println(v1.marcarParaMantenimiento());
        v1.show();
        System.out.println(v1.marcarParaMantenimiento());
        v1.show();
        
        System.out.println();
        System.out.println("Probando calcularAntiguedad");
        System.out.println(v1.calcularAntiguedad());
        System.out.println(v2.calcularAntiguedad());
        
        
        System.out.println();
        System.out.println("Probando mismaAntiguedad");
        System.out.println(v1.mismaAntiguedad(v3));
        System.out.println(v2.mismaAntiguedad(v3));
        
        System.out.println();
        System.out.println("Probando esIgual");
        System.out.println(v4.esIgual(v5));
        System.out.println(v4.esIgual(v6));
        
        v6.show();
                
    }
}
