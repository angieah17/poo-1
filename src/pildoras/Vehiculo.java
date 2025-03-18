/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras;

/**
 *
 * @author Angie Amado
 */
public class Vehiculo {
    int kms;
    String nombre;

    //Constructor
    public Vehiculo(String nombre) {
        this.nombre = nombre;
        kms = 100;
    }
    
    //Métodos
    public void marchaAlante(){
        kms = kms > 120 ? 120 : kms + 1;
    }
    
    public void marchaAtras (){
        kms = kms <= 0 ? 0 : kms - 1;
    }
    
    public void show(){
        System.out.printf("El vehiculo de %s va a %dkms.%n", nombre, kms);
    }
    
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Angie");
        Vehiculo v2 = new Vehiculo("Mario");
        
        for(int i = 0; i < 300; i++){
            v1.marchaAlante();
        }
        
        
        v1.show();
        
         for(int i = 0; i < 300; i++){
            v2.marchaAtras();
        }
        
        v2.show();
        
        
    }
    
}
