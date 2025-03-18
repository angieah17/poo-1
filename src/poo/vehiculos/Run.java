/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.vehiculos;

/**
 *
 * @author Angie Amado
 */
public class Run {
    public static void main(String[] args) {
        
        Coche c1 = new Coche(2,true, "azul", 10, "5432 ABC", 0);
        Coche c2 = new Coche(4,true, "rojo", -5, "5628 abc", 140);
        Coche c3 = new Coche(1,true, "magenta", 400, "12C4 ZHY", -1);
        Moto r1 = new Moto("magenta", -1, "ABCD 1234", 150);
        Moto r2 = new Moto ("verde", 2, "1234 HYU", 15);
        Bici b1 = new Bici(15, "123", 150);
        Bici b2 = new Bici(50, "A23", 15);
        
        System.out.println(b1);
        System.out.println(b2);
        
        System.out.println(r1);
        
        System.out.println(c1);
        
        
        c1.abrirPuertas();
        System.out.println(c1);
        
        c1.abrirPuertas();
         System.out.println(c1);
        
         System.out.println();
         System.out.println("PROBANDO MATRÍCULA Y VELOCIDAD");
         System.out.println(c1);
         System.out.println(c2);
        System.out.println(c3);
        
        System.out.println("");
        System.out.println("PROBANDO ARRANCAR");
                
              
        System.out.println(c1);
        c1.arrancar();
        System.out.println(c1);
       
        System.out.println("");
        System.out.println("PROBANDO AUMENTO VELOCIDAD");
        
        System.out.println(c1);
        c1.acelerar();
        System.out.println(c1);
       
        for (int i = 0; i < 1000; i++) {
             c1.acelerar();
        }
        
        System.out.println(c1);
        
        
        System.out.println("");
        System.out.println("PROBANDO PARA");
        c1.detenerse();
        
        System.out.println(c1);
        
        System.out.println("PROBANDO CABALLITO MOTO");
        r1.caballito();
        
        System.out.println(r1.caballito());
        
        System.out.println("PROBANDO CAMBIO DE MARCHA");
        
        
        System.out.println(b1.cambioMarcha());
        
        for (int i = 0; i < 10; i++) {
            b1.cambioMarcha();
        }
        
        System.out.println(b1);
        
    }
}
