/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos2;

/**
 *
 * @author manana
 */
public class Vehiculo {
    String marca;
    String tipo;
    byte numRuedas;
    short fechaFabricacion;
    
    String [] historicoColores; //máximo 5
    String color;
    
    
    double velocidad;
    boolean nuevo;
    double kms;
    double precio;
    
        
    
    
    //Constructor 1. Todos los valores que tengan sentido
    public Vehiculo(String marca, byte numRuedas, String color, double precio) {
        this.marca = marca;
        this.numRuedas = numRuedas;
        
        /*
        Sintaxis de switch
        
        
        */
        
            
        fechaFabricacion = 2024;
        this.color = color;
        nuevo = true;
        this.precio = precio >= 0 ? precio : 0;
        
        /*
        String tipo: lo vamos a configurar para que dependa del número de ruedas. 
        int fechaFabricación: no la permitimos que entre porque se está construyendo ahora, por eso se pone el valor por defecto 2024.
        double velocidad: como es de fábrica se parte que se construye con velocidad 0
        boolean nuevo: como es de fábrica se parte que es nuevo, no la permitimos que entre otro valor
        double kms: como es de fábrica se parte que no tiene kms recorridos, no la permitimos que entre otro valor
        historicoColores: lo dejamos con su valor por defecto null, sin ser necesario escribirle el valor por defecto en el constructor porque null ya es en las propiedades de la clase.
        this.velocidad: lo dejamos con su valor por defecto 0, sin ser necesario escribirle el valor por defecto en el constructor porque 0 ya es en las propiedades de la clase.
        this.kms: lo dejamos con su valor por defecto 0, sin ser necesario escribirle el valor por defecto en el constructor porque 0 ya es en las propiedades de la clase.
        
        */
    }
   
    //Constructor 2
    //Crea un vehículo nuevo a partir de las características de un vehículo antiguo
    
    public Vehiculo (Vehiculo v){
        
    }
    
    
    
}
