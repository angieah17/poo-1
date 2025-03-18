/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparatos;

/**
 *
 * @author manana
 */
public class Reloj2 {
    
    //1.Propiedades
    private int horas;
    private int minutos; 
    private String modelo;
    private boolean en24Horas;
    
    //2. Constructores 
    public Reloj2(int horas, int minutos, String modelo) {
        this.horas = horas >= 0 && horas <= 24 ? horas : 0;
        this.minutos = minutos >= 0 && minutos <= 59 ? minutos : 0;
        this.modelo = modelo == null || modelo.equals("") ? "BASIC-WATCH" : modelo;
        en24Horas = true;
    }
    
    //El valor por defecto de cualquier objeto (como el String) es null
    
    
    public Reloj2() {
        this(0, 0, "BASIC WATCH");
    }

    public Reloj2(int horas, int minutos) {
        this(horas, minutos, "BASIC WATCH");
    }

    
    public Reloj2 (Reloj2 c){
       this.horas = c.horas;
       this.minutos = c.minutos;
       this.modelo = c.modelo;
       this.en24Horas = c.en24Horas;
    }
    
    //3. Métodos
    
    public boolean setHora (int horas, int minutos) {
        
        boolean horaCorrecta = horas >= 0 && horas <= 24 || minutos >= 0 && minutos <= 59;
        
        
        if (horaCorrecta) {
            this.horas = horas;
            this.minutos = minutos;
        } 
        
        return horaCorrecta;
        
    }
    
    
    
    public void mostrarHora (){
        
        if (en24Horas){
            System.out.printf("Reloj (%s): %02d:%02d.%n", modelo, horas, minutos);
        } else {
            System.out.printf("Reloj (%s): %02d:%02d %s.%n", modelo, 
                    horas > 12 ? horas - 12 : horas, minutos, 
                    horas > 12 ? "PM" : "AM");
        }
        
    }
    
    public boolean incrementarMinuto() {
        
        
        minutos = minutos == 59 ? 0 : minutos + 1;
        horas = minutos == 0
                ? (horas == 23 ? 0 : horas + 1)
                : horas;
        return true;
        
    }

    public boolean cambiarFormato (){
        return en24Horas = !en24Horas;
    }
    
    public boolean reiniciar (){
        
        /*
        
        boolean reseteable = horas == 12 && minutos == 0; 
        horas = reseteable ? 0 : horas; 
        return reseteable;
        
        */
        
        boolean reseteable;
        
        /*
        if (horas == 12 && minutos == 00){
            horas = 0;
            return true;
        } else {
            return false;
        }*/
        
        if(reseteable = horas == 12 && minutos == 0){
            horas = 0; 
        } return reseteable;
        
        
    }
    
    
    
}
