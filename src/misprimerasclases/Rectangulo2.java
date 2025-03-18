/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misprimerasclases;

/**
 *
 * @author manana
 */
public class Rectangulo2 { //Macro, valores por defecto
    int base;
    int altura;
    String color;
    int superficie;
    
    public Rectangulo2(int lado){ //Constructor, el nombre que se le pone es referencial, para entenderlo quién construye no le da información al programa
        base = lado;
        altura = lado;
        superficie = lado * lado;
        //color = "blanco";
    }
    
    
    public Rectangulo2(int miBase, int miAltura, String miColor){ //Constructor, no se puede repetir los tipos, orden y condición de parámetros (int, int, String)
        //Este constructor es como la zeta
        base = miBase;
        altura = miAltura;
        color = miColor;
        superficie = base * altura;
    }
    
    
    
    public static void main(String[] args) {
        
        Rectangulo2 r1 = new Rectangulo2(5, 10, "azul");
        
        
        /*Rectangulo r1 = new Rectangulo ();
        
        System.out.printf("Rectangulo %s de %d x %d y superficie %d%n", r1.color, r1.altura, r1.base, r1.superficie);
        
        r1.altura = 10;
        r1.base = 5;
        r1.superficie = r1.altura * r1.base;
        r1.color = "azul";*/
        
        System.out.printf("Rectangulo %s de %d x %d y superficie %d%n", r1.color, r1.altura, r1.base, r1.superficie);
        
        
        Rectangulo2 r2 = new Rectangulo2(40, 80, "rojo");
        
        /*
        Rectangulo r2 = new Rectangulo();
        
        System.out.printf("Rectangulo %s de %d x %d y superficie %d%n", r2.color, r2.altura, r2.base, r2.superficie);
        
        r2.altura = 80;
        r2.base = 40;
        r2.superficie = r2.altura * r2.base;
        r2.color = "rojo";*/
        
        System.out.printf("Rectangulo %s de %d x %d y superficie %d%n", r2.color, r2.altura, r2.base, r2.superficie);
        
    }
    
}
