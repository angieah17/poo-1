/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _12Inheritance;

/**
 *
 * @author manana
 */
public abstract class AnimalMejorado {
    private double peso;
    
    public AnimalMejorado (double peso){
        this.peso = peso;
    }
    
    public void identificar(){
        System.out.print("Soy un ANIMAL MEJORADO");
    }

    public double getPeso() {
        return peso;
    }
    
    //1. El getPeso al ser público sí lo heredan los hijos
    //2. El peso si bien es privado los hijos logran acceder a esa propiedad a 
    //   través del super() como constructor
    
   
    public void emitirSonido(){
        System.out.print("Ahí va el sonido: "); 
        
    }
    
    
}
