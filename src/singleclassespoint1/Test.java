/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleclassespoint1;

/**
 *
 * @author manana
 */
public class Test {
    
    public static void main(String[] args) {
        Point p1 = new Point ((byte)-5, (byte)3, "purple", ' ');
        Point p2 = new Point ();
        Point p3 = new Point ("magenta", 'z');
        Point p4 = new Point (p2);
        Point p5 = new Point ((byte)10, (byte)7, "red", 'k');
        Point p6 = new Point((byte)7, (byte)5, "red", 'a');
        
        
        
        Point [] Points = {p1, p2, p3, p4};
        
        for (Point pon : Points) {
            pon.showSimple();
        }
        
        System.out.println("");
        System.out.println("Probando Método up ()");
        
        
        for (int i = 0; i <= 8; i++) {
            p1.up();
            p1.showSimple();
            System.out.println(p1.up());
            p1.showSimple();
            
        }
        
        System.out.println("");
        System.out.println("Probando Método down ()");
        
        for (int i = 0; i <= 5; i++) {
            p5.down();
            p5.showSimple();
            System.out.println(p5.down());
            p5.showSimple();
            
        }
        
        System.out.println("");
        System.out.println("Probando Método left ()");
        
        for (int i = 0; i <= 5; i++) {
            p5.left();
            p5.showSimple();
            System.out.println(p5.left());
            p5.showSimple();
            
        }
        
        System.out.println("");
        System.out.println("Probando Método rigth ()");
        
        for (int i = 0; i <= 5; i++) {
            p2.right();
            p2.showSimple();
            System.out.println(p2.right());
            p2.showSimple();
            
        }
                
        System.out.println("");
        
        
        
       p6.show();
        
       p1.show();
        
       p1.right();
       
       p1.show();
        
    }
    
}
