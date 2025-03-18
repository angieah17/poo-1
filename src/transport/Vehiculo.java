/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transport;

/**
 *
 * @author Angie Amado
 */
public class Vehiculo {
    private String matricula;
    private String tipo;
    private short anioFabricacion; 
    private int kilometraje;
    private boolean requiereMantenimiento;

    public Vehiculo(String matricula, String tipo, short anioFabricacion, int kilometraje) {
        
        this.matricula = matriculaValida(matricula) ? matricula : "DESCONOCIDA";
        this.tipo = tipo.equalsIgnoreCase("moto") || tipo.equalsIgnoreCase("camion") || tipo.equalsIgnoreCase("bicicleta") ? tipo : "coche";
        this.anioFabricacion = anioFabricacion >= (short)1900 && anioFabricacion <= (short)2024 ? anioFabricacion : (short)2024;
        this.kilometraje = kilometraje >= 0 ? kilometraje : 0;
    }
    
    public Vehiculo (Vehiculo c){
        matricula = c.matricula;
        tipo = c.tipo;
        anioFabricacion = c.anioFabricacion;
        kilometraje = c.kilometraje;
        requiereMantenimiento = c.requiereMantenimiento;
    }
    
    private static boolean matriculaValida (String matricula){
        
        if (matricula.length() > 10 || matricula.length() <= 4) return false;
        
        for (int i = 0; i < 3 ; i++){
            if (!(matricula.charAt(i) >= 'A' && matricula.charAt(i) <= 'Z')) return false;
        }
        
        for (int i = 3; i < matricula.length(); i++){
            if (!(matricula.charAt(i) >= '0' && matricula.charAt(i) <= '9')){
                return false;
            }
        }
        
        return true;
        
        
    }
    
    public void mostrar (){
        System.out.printf("Vehículo [%s] (%s) del año %d con %d km. Requiere mantenimiento: %s.%n", matricula, tipo, anioFabricacion, kilometraje, requiereMantenimiento ? "Sí" : "No");
    }
    
    public boolean actualizarKilometraje (int nuevoKilometraje){
             
        if (kilometraje < nuevoKilometraje){
            kilometraje = nuevoKilometraje;
            return true;
        } 
        
        return false;
    }
    
    public boolean marcarParaMantenimiento(){
        
        if (requiereMantenimiento == false){
            requiereMantenimiento = true;
            return true;
        } requiereMantenimiento = false; return false;
        
    }
    
    public int calcularAntiguedad (){
        return 2024 - anioFabricacion;
    }
    
    public boolean mismaAntiguedad (Vehiculo v){
        return calcularAntiguedad() == v.calcularAntiguedad();
    }
    
    public boolean esIgual (Vehiculo v){
        return (matricula.equalsIgnoreCase(v.matricula) && tipo.equalsIgnoreCase(v.tipo));
    }
    
    
}


