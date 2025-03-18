/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuritas;

/**
 *
 * @author Angie Amado
 */
public class Triangulo extends FiguraGeometrica {
    
    //1.. Propiedades de un triangulo rectángulo
    
    private int base;
    private int altura;
    private int hipotenusa;

    
    //2. Constructores
    public Triangulo(int base, int altura) {
        this.base = base < 0 ? 0 : base;
        this.altura = altura < 0 ? 0 : altura;
        
    }
    
    public Triangulo (){
        this (10, 5);
    }
    
    //FALTA EL CONSTRUCTOR DE DADO EL ÁREA MIRAR CUADRADO DE MIS FIGURAS
    
    //3. Métodos
    
    @Override
    public double perimetro(){
        
        return base + altura + hipotenusa;
        
    }
    
    @Override
    public double area (){
        
        return base * altura;
    }

    @Override
    public String toString() {
        
        return String.format("El triángulo rectángulo de color:%s, de base: %d, de altura: %d e hipotenusa: %d. Tiene perímetro: %.2f y área: %.2f.%n", getColor(), base, altura, hipotenusa, perimetro(), area());
        
        
    }
    
}
