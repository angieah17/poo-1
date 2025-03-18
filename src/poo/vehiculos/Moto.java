/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.vehiculos;

/**
 *
 * @author manana
 */
public class Moto extends Vehiculo{

    //1. Propiedades
     
   /* Propiedades heredadas del padre:
    private int color; 
    private double velocidadMaxima; //Propiedad predefinida en el constructor 1 que tira del constructor padre. 
    private int numeroRuedas; //Propiedad predefinida
    private double peso; 
    private String matricula; 
    private double velocidad;
   */
   
   
   //2. Constructores

    
    public Moto(String color, double peso, String matricula, double velocidad) {
        super(color, 120, 2, peso, matricula, velocidad);
        
    }
   
    
   
   
   
   //3. Métodos que provienen de la clase padre: arrancar, detenerse, acelerar.
   
   public String caballito () {
        if (getVelocidad() >= 10){ 
            return "Está haciendo caballito";
        }
        return "No hay velocidad suficiente para hacer el caballito.";
   }
    
   @Override
    public boolean matriculaValida(String matricula) {
        {
        
        /*Condiciones de la matrícula válida:
            a. 8 caracteres 
            b. los 4 primeros deben ser números
            c. en medio un espacio
            c. los 3 últimos letras en mayúsculas
         */
        
        String matriculaSinEspacios = matricula.trim();
        
        if (!(matriculaSinEspacios.length() == 8)){
            return false;
        }
        
        for (int i = 0; i < matriculaSinEspacios.length() - 4; i++) {
            if(!(matriculaSinEspacios.charAt(i) >= '0' && matriculaSinEspacios.charAt(i) <= '9')){
                return false;
            }
                
        }
        
        for (int i = matricula.length() - 4; i >= 0;i--) {
            if(!(matriculaSinEspacios.charAt(i) >= 'A' && matriculaSinEspacios.charAt(i) <= 'Z' || matriculaSinEspacios.charAt(4) == ' ')){
                return false;
            }
                
        }
        
                
        return true;
        
        
    }
    
    
    
    
    
    }
    
    
    
   

    @Override
    public String toString() {
        return String.format("La moto cuenta con las siguientes caracterísiticas:%n"
                + "Color: %s.%nVelocidad Maxima: %.2f.%n"
                + "Número de ruedas: %d.%nPeso: %.2f.%nMatrícula: %s.%nVelocidad %.2f.%n", 
                getColor(), getVelocidadMaxima(), getNumeroRuedas(), getPeso(), getMatricula(), getVelocidad());
       
    }

    
    
}
