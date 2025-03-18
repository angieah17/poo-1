/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.vehiculos;

/**
 *
 * @author Angie Amado
 */
public abstract class Vehiculo {
    
    //1. Propiedades 
    private String color; 
    private double velocidadMaxima; 
    private int numeroRuedas;
    private double peso;
    private String matricula; 
    private double velocidad;
    
    //2. Constructores 

    public Vehiculo (String color, double velocidadMaxima, int numeroRuedas, double peso, String matricula, double velocidad) {
        this.color = Color.colorValido(color);
        this.velocidadMaxima = velocidadMaxima; 
        this.numeroRuedas = numeroRuedas; 
        this.peso = peso >= 0 ? peso : 0; //Se podría mejorar limitando a un peso medio por cada tipo de vehículo si me da tiempo
        this.matricula = matriculaValida(matricula) ? matricula.toUpperCase() : "No válido";
        this.velocidad = velocidad >= 0 && velocidad <= velocidadMaxima ? velocidad : velocidadMaxima;
    }
    
    
    
    
    

    //3. Métodos
    
    public Vehiculo arrancar(){
        if(velocidad == 0){
            velocidad = velocidad + 10; 
        }
        return this;
    }
    
    public Vehiculo acelerar (){
        
       velocidad = velocidad + 10 < velocidadMaxima ? velocidad + 10 : velocidadMaxima; 
        
        return this;
    }
    
    public Vehiculo detenerse (){
        velocidad = 0;
        
        return this;
    }
    
    public abstract boolean matriculaValida (String matricula);
    
     
    //4. Getters

    public String getColor() {
        return color;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public double getPeso() {
        return peso;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }
    
    //En vez de los getters crear un toString y llamarlo en cada hijo con lo que le aplique. 
    
    
            
    
}
