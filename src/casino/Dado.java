/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casino;

/**
 *
 * @author manana
 */
public class Dado {

    // PROPIEDADES
    
    private int numCaras; // 6 en principio 
    private int [] memoria;
   

    // CONSTRUCTORES
    public Dado(int numCaras) { 
        memoria = new int [10];
        this.numCaras = numCaras;
    }

    
    //MÉTODOS
    @Override
    public String toString() {
        
        String salida = String.format("Dado con %d caras.%nHistorico de Tiradas:%n", numCaras);
        
        for (int i = memoria.length - 1; i >= 0; i--) {
            if(memoria[i] != 0){
                salida += memoria[i] + " ";
            }
            
        }
         return salida;
         
    }
   
    public int lanzar(){
        
        int lanzamiento = (int) (numCaras * Math.random()) + 1; //Se debe sumar 1 para que se alcance el 6
        
        for (int i = memoria.length - 2; i >= 0; i--) {
            memoria[i+1] = memoria[i];
        }
        
        memoria[0] = lanzamiento;
        
        return lanzamiento;
    }
    
    public static void main(String[] args) {
        Dado d = new Dado(6);
        
        System.out.println(d.toString());
        
        for (int i = 0; i < 10; i++) {
            System.out.println(d.lanzar()); 
        }
        
       
        
        System.out.println(d);
    }
    

    
    
    
}
