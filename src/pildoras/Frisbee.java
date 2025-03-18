/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras;

/**
 *
 * @author Angie Amado
 */
public class Frisbee {
    String color;
    boolean nuevo;
    int peso;
    double precio;
    
    //Constructor 1 con todos los párametros

    public Frisbee(String color, double precio) {
        this.color = color == "" ? "blanco": color; 
        nuevo = true; //Por defecto
        this.peso = 125; //Siempre pesarán 125 gramos
        this.precio = precio >= 0 ? precio : 10.00;
    }
        
    //Constructor 2 sin párametros

    public Frisbee() {
        this("blanco", 10.00);
    }
    
    //Constructor 3 copia
    
    public Frisbee(Frisbee c){
        color = c.color;
        nuevo = c.nuevo;
        peso = c.peso; 
        precio = c.precio;
    }
    
    //Constructor 4, frisbee nuevo a partir de las características de uno antiguo
    
    public Frisbee (Frisbee f, double precio){
        this(f.color, precio); //Se usa el constructor 1 porque nuevo y peso serán por defecto y queremos que las limitaciones de color y de peso se apliquen a este nuevo frisbee
    }
   
    //Constructor 5, frisbee con un precio específico

    public Frisbee(String color) {
        this(color, 15.25);
    }
    
    public void show (){
        System.out.printf("Características del frisbee%n Color: %s, Nuevo: %b, Peso: %dgr, Precio: %.2f€.%n", color, nuevo, peso, precio);
    }
    
    public static void main(String[] args) {
        Frisbee f1 = new Frisbee ();
        Frisbee f2 = new Frisbee ("Azul", 12);
        Frisbee f3 = new Frisbee(f2);
        Frisbee f4 = new Frisbee("Chiripones");
        Frisbee f5 = new Frisbee(f1, 0);
        
        
        
        Frisbee [] frisbees = { f1, f2, f3, f4, f5};
        
        for (Frisbee f: frisbees) {
            f.show();
        }
        
        
        
    }
            
    
    
    
    
    
}
