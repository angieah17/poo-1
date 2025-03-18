/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuritas;

/**
 *
 * @author Angie Amado
 */
public class Circulo extends FiguraGeometrica {
    
    //1. Propiedades 
    
    private int radio;
    private static final double PI = 3.1416;

    
    //2. Constructores
    public Circulo(int radio) {
        this.radio = radio < 0 ? 0 : radio;
                
    }
    
    public Circulo (){
        this (1);
    }
    
    //FALTA EL CONSTRUCTOR DE DADO EL ÁREA MIRAR CUADRADO DE MIS FIGURAS
    
    //3. Métodos
    
    @Override
    public double perimetro(){
        
        return 2 * PI * radio ;
        
    }
    
    @Override
    public double area (){
        
        return PI * (radio * radio);
    }
    
    

    @Override
    public String toString() {
        
        return String.format("El círculo de color: %s y radio: %d, tiene perímetro: %.2f y área: %.2f.%n", getColor(), radio, perimetro(), area());
        
        
    }
    
    
    
    
    
}
