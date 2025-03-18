/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transport;

/**
 *
 * @author manana
 */
public class Vehiculo2 {
    
    //FALTA LIMITAR LA MATRICULA
    
    //1. Propiedades
    private String matricula;
    private String tipo;
    private short anoFabricacion;
    private int kilometraje;
    private boolean requiereMantenimiento;
    
    //2. Constructores

    public Vehiculo2(String matricula, String tipo, short anoFabricacion, int kilometraje) {
        
        
        this.matricula = matriculaValida(matricula) ? matricula : "DESCONOCIDA";
        
        //Para evitar que entre un null se puede poner la variable al revés
        this.tipo = "moto".equalsIgnoreCase(tipo) || "camion".equalsIgnoreCase(tipo) || 
                "bicicleta".equalsIgnoreCase(tipo) ? tipo.toLowerCase() : "coche";
        
        /*Otra forma, se pueden limitar las propiedades a través del mismo constructor
        o un método privado o en el constructor asignando una variable:
        
        String tipoValido = "moto".equals(tipo) || "camion".equals(tipo) || 
                "bicicleta".equals(tipo) ? tipo : "coche";
        
        this.tipo = tipoValido; 
        
        
        */
        
        this.anoFabricacion = anoFabricacion >= (short)1990 && anoFabricacion <= (short) 2024 ? anoFabricacion : (short)2024;
        this.kilometraje = kilometraje > 0 ? kilometraje : 0;
    }
    
    
    public Vehiculo2 (Vehiculo2 c){
        this.anoFabricacion = c.anoFabricacion;
        kilometraje = c.kilometraje;
        matricula = c.matricula;
        requiereMantenimiento = c.requiereMantenimiento;
    }
    
    
    //3. Métodos
    
    public void show (){
        System.out.printf("Vehículo [%s] (%s) del año %d con %d km. Requiere mantenimiento: %s.%n", 
                matricula, tipo, anoFabricacion, kilometraje, requiereMantenimiento ? "Sí" : "No");
    }
    
    //Private porque es un método que solo se usará en mi clase. Es un método auxiliar.
    private static boolean matriculaValida (String matricula){
        
        if (matricula.length() > 10 || matricula.length() <= 4)return false;
        
        //Se pone la limitación de <= 4 porque debe tener por lo menos 4 valores, 
        //3 caracteres y por lo menos 1 número
        
        for(int i = 0; i < 3; i++){
             if(!(matricula.charAt(i) >= 'A' && matricula.charAt(i) <= 'Z')) return false;
            
        }
        
        for(int i = 3; i < matricula.length(); i++){
            
             if(!(matricula.charAt(i) >= '0' && matricula.charAt(i) <= '9')) return false;
            
        }
        
        return true;
        
        //Se pone la palabra static porque la pregunta se hace a la clase, no a cada instancia 
        
        
        
        
        
        
    }
    
        
    public boolean actualizarKilometraje(int nuevoKilometraje) {
        
        if (kilometraje < nuevoKilometraje){
            kilometraje = nuevoKilometraje;
            return true;
        } else {
            return false;
        }
                
    }
    
    
    
    public boolean marcarParaMantenimiento(){
        
        if (requiereMantenimiento == false){
            requiereMantenimiento = true;
            return true;
        } 
        requiereMantenimiento = false;
        return false;
        
        /* Otra forma:
        if(requiereMantenimiento){
            return false;
        }else {
            requiereMantenimiento = true;
            return true;
        }*/ 
            
    }
    
    
    public int calcularAntiguedad(){
              
        short anoActual = 2024;
        return anoActual - anoFabricacion + 1;
    }
    
    public boolean mismaAntiguedad(Vehiculo2 v){
        
        return this.calcularAntiguedad() == v.calcularAntiguedad();
        
        //También se puede verificar el anoFabricacion == anoFabricacion;
        
    }
    
    public boolean esIgual(Vehiculo2 v){
       return matricula.equals(v.matricula) && tipo.equals(v.tipo);
    }
    
}
