/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misprimerasclases;

/**
 *
 * @author manana
 */
public class Counter { //1. Macro con sus propiedades
    private int value; //g
    
    public int getValue(){
        return value;
    }
    
    private int maxValue = 100_000; //g
    
    public int getMaxValue (){
        return maxValue;
    }
    private String model = "N-COUNTER"; //g
    
    public String getModel (){
        return model;
    }
    
    //2. Constructores con sus parámetros
    
    public Counter (){
    }
    
    public Counter (int maxValue){
        this.maxValue = maxValue;
    }
    
    public Counter (int maxValue, String model){
        this.maxValue = maxValue;
        this.model = model;
    }
    
    public Counter (Counter c){
        value = c.value;
        maxValue = c.maxValue;
        model = c.model;
    }
    
    //3.1 Se crea el método show para mostrar los Counters creados.
    
    public void show (){ //En algún momento si se definen parámetros en el método, se tendría que diferenciar con this en el printf
        System.out.printf("Contador: modelo (%s) y valor %d de %d.%n", model, value, maxValue);
    }
    
    //4. Se crea el método increment que muestre boolean
    
    /*public boolean increment (){
        if( value < maxValue){
            value++;
            return true;
        }
        else {
            return false;
        }
    }*/
    
    public boolean increment (){
        return increment (1);
    }
    
    //5. Se crea el método increment (int n)
    
    public boolean increment (int n){
        if( value + n <= maxValue){
            value += n;
            return true;
        } else {
          value = maxValue;
          return false; 
        }
        
    }
    
    //6. Se crea el método reset ()
    
    public boolean reset (){
        if( value == maxValue){
            value = 0;
            return true;
        } else {
            return false;
        }
    }
    
    
    
    
    
    
}
