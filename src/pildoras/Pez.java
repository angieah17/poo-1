/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras;

/**
 *
 * @author manana
 */
public class Pez {
    double peso;
    String color;
    float largo;
    int profundidadMaxima;
    boolean vivo;

    //Constructores
    public Pez(double peso, String color, float largo, int profundidadMaxima) {
        this.peso = peso <= 0 ? 0: peso;        
        this.largo = largo <= 0 ? 0: largo;
        this.profundidadMaxima = profundidadMaxima <= 0 ? 0: profundidadMaxima;
        this.color = color == "" ? "rojo" : color; //Preguntar a Javi si se refería a esto
        vivo = true;
    }

    public Pez() {
        this(2, "verde", (float)4, 2);
    }
    
    public Pez (Pez c){
        this.peso = c.peso;
        this.color = c.color;
        this.largo = c.largo;
        this.profundidadMaxima = c.profundidadMaxima;
        this.vivo = c.vivo;
    }
            
    public void show (){
        System.out.printf("El pez %s tiene de peso: %.2f, largo: %.2f y nada a una profundidad máxima de: %d. Estado Vivo: %b.%n", color, peso,largo, profundidadMaxima, vivo);
    }
    
    public static void main(String[] args) {
                
        Pez p1 = new Pez (1.5, "Azul", (float)3, 50);
        Pez p2 = new Pez ();
        Pez p3 = new Pez (p1);
        
        Pez [] peces = {p1, p2, p3};
        
        for (Pez pec : peces) {
            pec.show();
        }
        
    }
    
}
