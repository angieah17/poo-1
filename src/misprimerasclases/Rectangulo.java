/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misprimerasclases;

 
/**
 *
 * @author manana
 */
public class Rectangulo { //Macro, se describen las propiedades
    int base;
    int altura; //En el macro tienen valores más cercanos a 0
    String color;
    
    public Rectangulo(int base, int altura, String color){ //Constructor 1, se definen unos parámetros para usarlos dentro del constructor
        this.base = base; //En el bloque {} se dan valores a los parámetros
        this.altura = altura;
        this.color = color;
    }
    
    public Rectangulo (int base, int altura){ //Constructor 2
        this(base, altura, "blanco");
    }
    
    public Rectangulo (){ //Constructor 3
        this(1, 1, "blanco");
    }
    
    
    
    public static void main(String[] args) {
       Rectangulo r1 = new Rectangulo(5, 10, "azul"); //Objeto 1 que se construye cuando se cumplen los parámetros dispuestos en el constructor 1
      
       //System.out.printf("Rectangulo %d x %d de color %s%n", r1.base, r1.altura, r1.color); 
       
       Rectangulo r2 = new Rectangulo (20, 50); //No importa el orden de los objetos, sino que se completa cuando coincide con los parámetros declarados en los constructores
       
       //System.out.printf("Rectangulo %d x %d de color %s%n", r2.base, r2.altura, r2.color);
       
       Rectangulo r3 = new Rectangulo (); 
       
       //System.out.printf("Rectangulo %d x %d de color %s%n", r3.base, r3.altura, r3.color);
       
       Rectangulo [] rectangulos = {r1, r2, r3}; //Si se crea el array, no es necesario crear un printf para cada rectangulo
       
       for(Rectangulo r:rectangulos){
            System.out.printf("Rectangulo %s de %d x %d%n", r.color, r.base, r.altura);
       }
       
       
    }
    
    
}

    


