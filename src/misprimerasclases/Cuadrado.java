/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misprimerasclases;

/**
 *
 * @author manana
 */
public class Cuadrado { //Macro, está compuesto por propiedades
    int lado;
    String color;
    int superficie;
    
    public Cuadrado (int lado, String color){ // Constructor4
        this.lado = lado; //Para referirse a las propiedades this
        this.color = color;
        superficie = lado * lado; //Los constructores procesa todos los constructores 
        //y después ejecuta, no es necesario que esto este primero, se pone por orden
    }
         
    public Cuadrado (){ // Constructor1
        this(1, "blanco");
    }
    
    public Cuadrado (int lado){ // Constructor2
        this(lado, "blanco");
    }
    
     public Cuadrado (String color){ // Constructor3, está compuesto por parámetros
        this(1, color);
    }
        
     
       
    
    public static void main(String[] args) { //Productos a través de una creación de un array de cuadrados
        
        Cuadrado [] cuadrados1 = {
            new Cuadrado(),
            new Cuadrado(7),
            new Cuadrado("rojo"),
            new Cuadrado(10, "verde")
        };
        
      
        //Recorrer el array e imprimirlo
        
        for(Cuadrado c:cuadrados1){
            System.out.printf("Cuadrado %s de lado %d y superficie %d%n", c.color, c.lado, c.superficie);
        }
        
        int totalCuadrados = 100;
        Cuadrado [] cuadrados2 = new Cuadrado [totalCuadrados];
        
        for(int i = 0; i < cuadrados2.length; i++){
            cuadrados2[i] = new Cuadrado (i + 1); //aquí usa el constructor que hemos llamado, es decir, el tipo int
        }
        
        
        for(Cuadrado c:cuadrados2){
            System.out.printf("Cuadrado %s de lado %d y superficie %d%n", c.color, c.lado, c.superficie);
        }
        
    }
    
    
}
