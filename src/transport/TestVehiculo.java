/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transport;

/**
 *
 * @author Angie Amado
 */
public class TestVehiculo {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC1234", "coche", (short)2020, 100);
        Vehiculo v2 = new Vehiculo("ABCDF1234", "coche", (short)2030, -20);
        Vehiculo v3 = new Vehiculo(v1);
        Vehiculo v4 = new Vehiculo("ABC1234", "Moto", (short)2020, 100);
        Vehiculo v5 = new Vehiculo("ABC1234", "moto", (short)2020, 100);
        Vehiculo v6 = new Vehiculo("ABC1234", "tractor", (short)1900, 100);
        
        v1.mostrar();
        v2.mostrar();
        v4.mostrar();
        
        System.out.println();
        System.out.println("Probando actualizarKilometraje");
        System.out.println(v1.actualizarKilometraje(50));
        System.out.println(v2.actualizarKilometraje(50));
        
        
        System.out.println();
        System.out.println("Probando marcarParaMantenimiento");
        System.out.println(v1.marcarParaMantenimiento());
        v1.mostrar();
        System.out.println(v1.marcarParaMantenimiento());
        v1.mostrar();
        
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
        
     
                
        
    }
}
