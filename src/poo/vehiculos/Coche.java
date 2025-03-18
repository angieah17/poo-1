/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.vehiculos;

/**
 *
 * @author Angie Amado
 */
public class Coche extends Vehiculo {
   //1. Propiedades
   private int numPuertas; //Propiedad predefinida
   private boolean puertasAbiertas; 
   
   /* Propiedades heredadas del padre:
    private int color; 
    private double velocidadMaxima; //Propiedad predefinida en el constructor 1 que tira del constructor padre. 
    private int numeroRuedas; //Propiedad predefinida
    private double peso; 
    private String matricula; 
    private double velocidad;
   */
   
   
   //2. Constructores

    public Coche(int numPuertas, boolean puertasAbiertas, String color, double peso, String matricula, double velocidad) {
        super(color, 120, 4, peso, matricula, velocidad); //REVISAR ESTE Y EL OTRO CONSTRUCTOR, PARA AGREGAR AQUÍ LA MAYORÍA DE LIMITACIONES
        this.numPuertas = numPuertas == 2 || numPuertas == 4 ? numPuertas : 4;
    }

    public Coche (String matricula){
        this(4, false, "negro", 1.457, matricula, 0);
    }
   
   
   
   //3. Métodos
   
   public boolean abrirPuertas (){
                      
       if (!puertasAbiertas){
           puertasAbiertas = true;
           return true;
       }
        return false;
       
   }
   
   
   

    @Override
    public String toString() {
        return String.format("El coche cuenta con las siguientes caracterísiticas:%n"
                + "Número de Puertas: %d(Abiertas: %b).%nColor: %s.%nVelocidad Maxima: %.2f.%n"
                + "Número de ruedas: %d.%nPeso: %.2f kg.%nMatrícula: %s.%nVelocidad %.2f.%n", numPuertas, puertasAbiertas, 
                getColor(), getVelocidadMaxima(), getNumeroRuedas(), getPeso(), getMatricula(), getVelocidad());
       
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
    
   
    
}
