/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.vehiculos;

/**
 *
 * @author manana
 */
public class Color {
    
    //1. Propiedades
    private static  String [] colores = {"azul", "rojo", "blanco", "verde", "negro"};
    
    //2. Métodos
    
    public static String colorValido(String colorTentativo) {
        
        for (String col : colores) {
            
            if(col.equalsIgnoreCase(colorTentativo)){
                return col;
            }
            
        }
        
        return colores [1];
        
    };
    

    
}
