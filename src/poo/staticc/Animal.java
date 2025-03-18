/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.staticc;

/**
 *
 * @author manana
 */
public class Animal {
    private int id;
    private double peso;
    private String color;
    private static int  cantAnimales = 0;
    private static int nextId = 1;

    public Animal(int peso, String color) {
        
        this.id = nextId++;
        this.peso = peso >= 0 ? peso : 0.011;
        this.color = color;
        cantAnimales++;
    }

    public void show (){
         System.out.printf("El animal de id: %d (nextId: %d)es %s y de peso %.2f gr.%n", id, nextId, color, peso);
        
    }
    
    public static void describeClase(){
        
        System.out.printf("Clase animal con nextID: %d y cantidad de animales creados: %d.%n", nextId, cantAnimales);
        
    }
    
    
    
    public static void main(String[] args) {
        Animal a1 = new Animal(10, "negro");
        Animal a2 = new Animal(4, "marrón");
       
        
        a1.show();
        a2.show();
       
        Animal.describeClase();
       
    }
    
    
}
