/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author manana
 */
public class Cuadrado {
    String color = "amarillo";
    int lado = 2;
    
    
    public Cuadrado (){
        
    }
        
    public Cuadrado (String color, int lado){
        this.color = color;
        this.lado = lado;
    }
    
    public Cuadrado (int lado){
        this.lado = lado;
    }
    
    public Cuadrado (String color){
        this(5);
    }
    
    public void show (){
        System.out.printf("El cuadrado %s de lado %d tiene area %d y perimetro %d.%n", color, lado, area(), perimetro());
    }
    
    public int area (){
        return lado * lado;
    }
    
    public int perimetro(){
        return lado * 4;
    }
    
}
