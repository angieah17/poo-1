/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _12Inheritance;

/**
 *
 * @author manana
 */
public class Animal {
     private double peso;
    
    public Animal (double peso){
        this.peso = peso;
    }
    
    public void identificar(){
        System.out.print("Soy un ANIMAL");
    }

    public double getPeso() {
        return peso;
    }
    
}
