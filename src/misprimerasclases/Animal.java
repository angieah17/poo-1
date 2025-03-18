/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misprimerasclases;

/**
 *
 * @author manana
 */
public class Animal {
    double precio;
    String descripcion;
    int cantidad;
    String especie;
    boolean oferta;
    boolean animalDeAyuda; 

    public Animal(double precio, String descripcion, int cantidad, String especie, boolean oferta, boolean animalDeAyuda) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.especie = especie;
        this.oferta = oferta;
        this.animalDeAyuda = animalDeAyuda;
    }


  
public Animal (double precio, String descripcion, int cantidad, String especie){
    this(precio, descripcion, cantidad, especie, true, false); //Aquí llama al constructor, es decir, los parámetros completos del constructor de arriba. 
    //Se agregan los valores del boolean para que no de error, porque en el constructor de donde llama se había declarado ese tipo de parámetros
}

public Animal(double precio, int cantidad, String especie){
    this(precio, "sin descripción", cantidad, especie, true, true); //si se eliminan las últimas 2 condiciones, estaría tomando los valores del constructor anterior
}


public void show (){ //método show
    System.out.printf("%d animal <%s> %s (%.2f) oferta = %b animalDeAtyda = %b.%n",cantidad, especie, descripcion, precio, oferta, animalDeAyuda);
} 

//Esto se usa más para cuando se quiera usar otras veces, por ejemplo, llamarlo en otra clase

    public static void main(String[] args) {
     Animal a1 = new Animal(350.95, "perro dalmata", 1, "perro", true, false); 
     Animal a2 = new Animal (109.13, "gato persa", 1, "gato");
     Animal a3 = new Animal (150.21, 2, "pájaro");
     /*a1.show();
     a2.show();
     a3.show();*/
     
     Animal[] animales = {a1, a2, a3};
        
        for(Animal a: animales){
            a.show();
        }
    }

    
   
    /*public static void main(String[] args) {
        
        Animal [] animales1 = {
        new Animal (350.95, "perro dalmata", 1, "perro", true, false),
        new Animal (109.13, "gato persa", 1, "gato"),
        new Animal (150.21, 2, "pájaro")
    };
      
        for (Animal a:animales1){
            System.out.printf("El animal con las siguientes condiciones: Precio: %.2f, Descripción: %s, Cantidad: %d, Especie: %s, Oferta: %b, Animal de Ayuda: %b.%n", a.precio, a.descripcion, a.cantidad, a.especie, a.oferta, a.animalDeAyuda);
        } 
        
        Animal [] animales2 = {
            new Animal (100.50, "naranja, gris y negro", 3, "hamster", false, false),
            new Animal (150.12, "tortuga", 1, "tortuga"),
            new Animal (300, 2, "serpiente"),
            new Animal (200, 10, "pez"),
            new Animal (80, "rojo", 1, "pájaro")
        };
        
        for (Animal a2:animales2){
            System.out.printf("El animal con las siguientes condiciones: Precio: %.2f, Descripción: %s, Cantidad: %d, Especie: %s, Oferta: %b, Animal de Ayuda: %b.%n", a2.precio, a2.descripcion, a2.cantidad, a2.especie, a2.oferta, a2.animalDeAyuda);
        }
        
    }*/




}

