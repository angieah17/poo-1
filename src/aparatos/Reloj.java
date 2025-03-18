/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparatos;

/**
 *
 * @author Angie Amado
 */
public class Reloj {
    private int horas; 
    private int minutos;
    private String modelo;
    private boolean en24Horas;

    public Reloj(int horas, int minutos, String modelo) {
        this.horas = horas >= 0 && horas <= 23 ? horas : 0;
        this.minutos = minutos >= 0 && minutos <= 59 ? minutos : 0;
        this.modelo = modelo.equals("") ? "BASIC-WATCH": modelo;
        en24Horas = true;
    }
    
    public Reloj (){
        this (0, 0, "BASIC-WATCH");
    }
    
    public Reloj (int horas, int minutos){
        this (horas, minutos, "BASIC-WATCH");
    }
   
    public Reloj (Reloj c){
        horas = c.horas;
        minutos = c.minutos;
        modelo = c.modelo;
        en24Horas = c.en24Horas;
    }
    
    
    //3. Métodos
    public void mostrarHora(){
        if (en24Horas){
            System.out.printf("Reloj (%s): %02d:%02d.%n", modelo, horas, minutos);
        } else {
            System.out.printf("Reloj (%s): %02d:%02d %s.%n", modelo, horas == 0 ? 12 : (horas > 12 ? horas - 12 : horas),
                minutos, horas > 11 ? "PM" : "AM" );
        }
             
    }
    
    public boolean setHora(int horas, int minutos){
        
        boolean horaCorrecta = horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59;
        
        if (horaCorrecta){
            this.horas = horas;
            this.minutos = minutos;   
        }
        
        return horaCorrecta;
        
    }
    
    public boolean cambiarFormato (){
        
        return en24Horas = !en24Horas;
    }
   
    
    public boolean incrementarMinuto(){
        
        /*Incrementa los minutos en 1. Si llega a 60, 
        reinicia los minutos 
        y aumenta la hora. Devuelve true si se pudo incrementar.*/
        if (minutos < 59){
            minutos++;
        } else {
            minutos = 0;
            incrementarHora();
        }
                        
        return true;
    }
    
    public boolean incrementarHora(){
        
        /*
        Incrementa las horas en 1. Si llega a 24 
        (o 12 en el formato de 12 horas),
        reinicia la hora. Devuelve true si se pudo incrementar.
        */
        if(horas < 23){
            horas++;
        } else {
            horas = 0;
        }
        
        return true;
        
    }
    
    public boolean reiniciar (){
        if (horas == 12 && minutos == 0){
            horas = 0;
            minutos = 0;
        } return true;
    }
    
    
}
