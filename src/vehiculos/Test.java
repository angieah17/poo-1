/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author manana
 */
public class Test {
    
    public static void main(String[] args) {
        
        
        Vehiculo v1 = new Vehiculo (); //Instancias de la clase vehículo
        Vehiculo v2 = new Vehiculo(v1, 2345);
        Vehiculo v3 = new Vehiculo(v2);
        Vehiculo v4 = new Vehiculo("azul", "renault", (byte) 4, 9999);
        
        for(int i = 0; i < 1_000; i++){
            v4.acelera();
        }
        
        v4.show();
        
        for(int i = 0; i < 5; i++){
            v4.frena();
        }
        
        v4.show();
        v4.para();
        v4.show();
        
        
        
        /*Vehiculo [] Vehiculos = {v1, v2, v3, v4};
        
        for(Vehiculo v:Vehiculos){
            v.show();
        }*/
        
        
        //v1.velocidad = 120.5;Se puede afectar la velocidad aquí o a través de un método 
        
        /*Al haberle puesto return this (Vehiculo) en los métodos 
        acelera, frena, para, se podrá encadenar métodos. 
        Tener cuidado después de show como no returna vehículo no se pueden encadenar más métodos*/
        v1.acelera().acelera().para().show();
        
        v1.pintar("Rojo");
        v1.pintar("Azul");
        
        /* SE AGREGÓ AL MÉTODO SHOW
        for (String hcol: v1.historicoColores) {
            System.out.printf("%s ", hcol );
        }*/
        
        System.out.println();
        System.out.println("Pruebas método pintar basado en");
        
        v2 = null;
        
        v1.pintarBasadoEn(v2);
        
        v1.show();
        
        //v1.color = "eres un torpe"; Al poner private en las propiedades se evita 
        //que se accedan o modifiquen las clases aquí
        
        //Para acceder a las clases se usan métodos 
        
        //a. Método getter, para obtener las propiedades
        System.out.println(v1.getVelocidad());
          
        //b. Método setter, través del método set se puede cambiar la propiedad
        //v1.setVelocidad(-1000); 
        
        v1.show();
        
        System.out.println(v1.getPrecio());
        
        /*Los métodos también podrían ser privados, por ej, cuando se usan métodos
        dentro de otros métodos (pero aquí no se llama encapsulamiento, encapsular es
        solo para las propiedades de la clase*/
        
        
        
    }
    
    
    
}
