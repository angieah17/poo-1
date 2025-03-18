/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _12Inheritance;

/**
 *
 * @author manana
 */
public class PerroMejorado extends AnimalMejorado{
   
    
    public PerroMejorado (double peso){
        super(peso);
    }
    
    
    public void identificar(){
        System.out.print("Soy un PERRO MEJORADO");
    }
    
    @Override
    public void emitirSonido(){
        super.emitirSonido();
        System.out.println("Gua!!");
    }

}
