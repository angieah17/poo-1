/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.vehiculos;

/**
 *
 * @author manana
 */
public class Bici extends Vehiculo {
    
    //1. Propiedades
    
    private static boolean tieneCanasto = true; //Se aplica a todas las bicis, parto de la idea que funciona como sevici
    private int marcha;
    
    
     
   /* Propiedades heredadas del padre:
    private int color; 
    private double velocidadMaxima; //Propiedad predefinida en el constructor 1 que tira del constructor padre. 
    private int numeroRuedas; //Propiedad predefinida
    private double peso; 
    private String matricula; 
    private double velocidad;
   */
   
   
   //2. Constructores

    
    public Bici (double peso, String matricula, double velocidad) {
        super("rojo", 30, 2, peso, matricula, velocidad);
        //Las sevicis por defecto son rojas
        marcha = 1;
    }
   
    
   
   
   
   //3. Métodos que provienen de la clase padre: arrancar, detenerse, acelerar.
   
   public int cambioMarcha (){
       
      return marcha = marcha < 10 ? marcha + 1 : 10;
       
       //return marcha = getVelocidad() <= 10 ? "Marcha 1" : getVelocidad() <= 20 ? "Marcha 2" : "Marcha 3";
       
   }
    
    @Override
    public boolean matriculaValida(String matricula) {
        {
        
        /*Condiciones de la matrícula válida: 3 números.
         */
        
                
        if (!(matricula.length() == 3)){
            return false;
        }
        
        for (int i = 0; i < matricula.length(); i++) {
            if(!(matricula.charAt(i) >= '0' && matricula.charAt(i) <= '9')){
                return false;
            }
                
        }
                        
        return true;
        
        
    }
    
    
    
    
    
    }
   

    @Override
    public String toString() {
        return String.format("La bicicleta cuenta con las siguientes caracterísiticas:%n"
                + "Color: %s.%nVelocidad Maxima: %.2f.%n"
                + "Número de ruedas: %d.%nPeso: %.2f.%nMatrícula: %s.%nVelocidad %.2f.%n"
                + "Marcha:%d.%n", 
                getColor(), getVelocidadMaxima(), getNumeroRuedas(), getPeso(), getMatricula(), getVelocidad(), marcha);
       
    }

   
    
    
    
    
    
}
