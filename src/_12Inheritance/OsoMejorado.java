/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _12Inheritance;

/**
 *
 * @author manana
 */
public class OsoMejorado extends AnimalMejorado{
    
    //1. Propiedades se extienden de la clase AnimalMejorado
    
    //2. Se crea el constructor, llamando al constructor de la clase
    public OsoMejorado (double peso){
        super (peso);
    }
    
    //3. Se crea el método identificar
    
    public void identificar (){
        System.out.print("Soy un OSO MEJORADO");
    }
    
    @Override
    public void emitirSonido(){
        System.out.println("Ruaw!!");
    }
}
