/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author manana
 */
public class Test {
    
    public static void main(String[] args) {
       
       Rectangulo r1 = new Rectangulo ();
       Rectangulo r2 = new Rectangulo (5);
       Rectangulo r3 = new Rectangulo ("azul");
       Rectangulo r4 = new Rectangulo (20);
       Rectangulo r5 = new Rectangulo ("rojo");
       
        
       Rectangulo [] rectangulos = {r1, r2, r3, r4, r5};
         
       for (Rectangulo r:rectangulos){
           r.show();
       }
       
       System.out.println();
               
       Cuadrado c1 = new Cuadrado ();
       Cuadrado c2 = new Cuadrado ("rojo", 5);
       Cuadrado c3 = new Cuadrado (8);
       Cuadrado c4 = new Cuadrado ("verde");
       
       Cuadrado [] cuadrados = {c1, c2, c3, c4};
       
       for(Cuadrado c:cuadrados){
           c.show();
       }
       
       
       
       
    }
    
}
