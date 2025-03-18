/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuritas;

/**
 *
 * @author Angie Amado
 */
public abstract class FiguraGeometrica {
    
 
    
    
    //1.. Propiedades
    private String color; 
    
    //2. Constructores
    
    public FiguraGeometrica () {
        color = Color.dameColor("negro");
    }
    
    public FiguraGeometrica(String color) {
        this.color = Color.dameColor(color); 
    }
    
    //3. Métodos
    
    //Los métodos son comunes para las figuras, pero en cada figura se ejecutan de manera distinta. 
    
    public abstract double perimetro ();
    
    public abstract double area ();
    
    // El siguiente método es común y además al ejecutarlo funciona igual para todas las figuras, por eso, lo quite de cada clase. 
    
    public boolean sameArea (FiguraGeometrica f) {
        return area () == f.area();
    }

    public String getColor() {
        return color;
    }
    

    
    
}
