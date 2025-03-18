/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _12Inheritance;

/**
 *
 * @author manana
 */
public class GatoMejorado extends AnimalMejorado{
    
    //Las propiedades y los métodos se heredan
        
    public GatoMejorado (double peso){
        super(peso); //Los constructores no se heredan, sin embargo, se puede usar el super 
        //(que es como cuando usabamos el this() que es tirar del constructor del padre
    }
    
    public void identificar(){
        System.out.print("Soy un GATO MEJORADO");
    }
    
    //Emitir sonido 
    
    @Override
    public void emitirSonido(){
        super.emitirSonido();
        System.out.println("Miau!!");
    }
    
    
}
