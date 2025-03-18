/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuritas;

/**
 *
 * @author Angie Amado
 */
public class Color {
    
    //1. Propiedades
    private static String [] colores = {
        "negro", "azul", "marrón", "gris", "verde", "naranja", 
        "rosa", "púrpura", "rojo", "blanco", "amarillo"
    }; 
    
    //2. Métodos
    
    public static String [] listaColores (){
        return colores;
    }
    
    public static String dameColor (String colorTentativo){
        for (String color: colores) {
            if(color.equalsIgnoreCase(colorTentativo)){
                return color;
            }
        }
        return colores[0]; //Lo mismo que haber puesto un color predeterminado.
    }
    
    
}
