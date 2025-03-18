/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casino;

/**
 *
 * @author manana
 */
public class Baraja {
    private String nombre; 
    private Carta [] cartas;

    public Baraja(String nombre, int cantidadDePalos, int cantidadCartasPorPalo) {
        this.nombre = nombre;
        cartas = new Carta [cantidadCartasPorPalo * cantidadDePalos];
        
        int i = 0;
        
        for (char palo = 'A'; palo < cantidadDePalos + 'A'; palo++) {
            for (int numero = 1; numero < cantidadCartasPorPalo; cantidadCartasPorPalo++) {
                cartas[i] = new Carta(numero, palo);
                i++;
            }
        }
    }

    /*
    @Override
    public String toString() {
        String.format("Ba",);
    }
    */
   
    
    public static void main(String[] args) {
        
    }
    
    
}
