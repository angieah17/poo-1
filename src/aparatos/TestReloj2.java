/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparatos;

/**
 *
 * @author manana
 */
public class TestReloj2 {
    
    public static void main(String[] args) {
        Reloj2 r1 = new Reloj2(11, 50, "CASIO");
        Reloj2 r2 = new Reloj2(20, 5);
        Reloj2 r3 = new Reloj2(7, 8);
        
        r1.mostrarHora();
        r2.mostrarHora();
        r3.mostrarHora();
        
        for(int i = 0; i < 60; i++){
            r1.incrementarMinuto();
        }
        
        
        r1.cambiarFormato();
        r1.mostrarHora();
        
        
        
    }
    
    
    
    
    
}
