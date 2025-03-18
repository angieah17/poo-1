/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparatos;

/**
 *
 * @author Angie Amado
 */
public class TestReloj {
    public static void main(String[] args) {
        Reloj r1 = new Reloj(0, 0, "CASIO");
        Reloj r2 = new Reloj(20, 5);
        Reloj r3 = new Reloj(7, 8);
        Reloj r4 = new Reloj(4, 45);
        Reloj r5 = new Reloj(18, 29, "LOTUS");
        
        
        Reloj [] relojes = {r1, r2, r3, r4, r5};
        
        for (Reloj r : relojes) {
            r.mostrarHora();
        }
        
        /*
        r1.mostrarHora();
        r2.mostrarHora();
        r3.mostrarHora();
        r1.cambiarFormato();
        
        for(int i = 0; i < 60 * 24; i++){
            r1.incrementarMinuto();
            r1.mostrarHora();
        }*/
        
        System.out.println();
        System.out.println("SEGUNDA PRUEBA");
        
        for (Reloj r : relojes) {
            r.incrementarMinuto();
            r.mostrarHora();
        }
        
        System.out.println();
        System.out.println("TERCERA PRUEBA");
        
        
        for (Reloj r : relojes) {
            r.cambiarFormato();
            r.mostrarHora();
        }
        
        System.out.println();
        System.out.println("CUARTA PRUEBA");
        
        
        for (Reloj r : relojes) {
            r.reiniciar();
            r.mostrarHora();
        }
        
        
        System.out.println();
        System.out.println("Probando cambiar Formato");
        r1.cambiarFormato();
        r1.mostrarHora();
        
        System.out.println();
        System.out.println("Probando incrementarHoras");
        r1.incrementarHora();
        r1.mostrarHora();
        
        System.out.println();
        System.out.println("Probando setHoras");
        r1.setHora(20, 50);
        r1.mostrarHora();
        
       
    }
}
