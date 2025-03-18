/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

/**
 *
 * @author Angie Amado
 */
public class Run {
    public static void main(String[] args) {
        Frisbee f1 = new Frisbee("azul", 12.3);
        Frisbee f2 = new Frisbee();
        Frisbee f3 = new Frisbee("rojo", -2);
        
        f1.show();
        System.out.println(f1.esDeColor());
        
        f2.show();
        System.out.println(f2.esDeColor());
        
        f2.actualizaPrecio();
        
        f2.show();
        
        f1.actualizaPrecio();
        f1.show();
        
        f3.nuevoMercado().show();
        
        
        
        
    }
}
