/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras;

/**
 *
 * @author Angie Amado
 */
public class Persona {
    String nombre;
    String apellido1;
    String apellido2;
    int anioNacimiento;

    public Persona(String nombre, String apellido1, String apellido2, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.anioNacimiento = anioNacimiento < 1900 ? 1900 : anioNacimiento;
    }

    public Persona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        anioNacimiento = 2024;
    }
    
    public void show (){
        System.out.printf("%s %s %s nació en %d.%n", nombre, apellido1, apellido2,anioNacimiento);
    }
           
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona ("Angie", "Amado", "Hernandez", 1999);
        Persona p2 = new Persona ("Jesus", "Amado", "Sequeda", 1800);
        Persona p3 = new Persona ("Pedro", "Perez", "Gil");
        
        Persona [] relacion = {p1, p2, p3}; 
        
        for (Persona r:relacion){
            r.show();
        }
        
    }
    
    
    
}
