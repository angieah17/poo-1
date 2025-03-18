/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuritas;

/**
 *
 * @author Angie Amado
 */
public class Run {
    
    public static void main(String[] args) {
       
        Rectangulo r1 = new Rectangulo(7, 10);
        Rectangulo r2 = new Rectangulo("rojo");
        
        Rectangulo [] rectangulos = {
            
            new Rectangulo(2, 8),
            new Rectangulo()
            
        };
        
        System.out.println(r1.toString());
        
        for (Rectangulo rec : rectangulos) {
            System.out.println(rec.toString());
        }
        
        System.out.println(r2);
        
    }
    
}
