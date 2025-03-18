/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author manana
 */
public class Rectangulo {
    String color  = "blanco";
    int base = 10;
    int altura = 30;
    //int area = base * altura; Al almacenarlo y usar este dato se puede correr 
    //el riesgo que se cambie en algún momento y salga un dato erróneo, en cambio, 
    //en al hacerlo a través de un método para calcularlo el resultado siempre será calculado
    
    public Rectangulo (){
        
    }
    
    public Rectangulo (int base){
        this.base = base;
        altura = 5;
    }
    
    public Rectangulo (String color){
        this.color = color;
    }
    
    public void show (){
        System.out.printf("El rectango %s de base %d y altura %d y su area es %d y su perimetro es %d.%n", color, base, altura, area(), perimetro());
    }
    
    public int area(){
        return base * altura;
    }
    
    public int perimetro (){
        return 2 * base + 2 * altura;
    }
    
    
    
}
