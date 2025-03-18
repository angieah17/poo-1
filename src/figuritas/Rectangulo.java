/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuritas;

/**
 *
 * @author Angie Amado
 */
public class Rectangulo extends FiguraGeometrica {
    
    //1.. Propiedades
    
    private int base;
    private int altura;
    
    //2. Constructores
    public Rectangulo(int base, int altura) {
        this.base = base < 0 ? 0 : base;
        this.altura = altura < 0 ? 0 : altura;
        
    }
    
    public Rectangulo (){
       base = 2;
       altura = 1;
       
    }
    
    public Rectangulo (String color){
        super(color);
    }
    
    //FALTA EL CONSTRUCTOR DE DADO EL ÁREA MIRAR CUADRADO DE MIS FIGURAS
    
    //3. Métodos
    
    @Override
    public double perimetro(){
        
        return 2 * (base + altura);
        
    }
    
    @Override
    public double area (){
        
         return base * altura;
    }
    
    

    @Override
    public String toString() {
        
        return String.format("El rectángulo de color: %s y  base: %d, de altura: %d y tiene perímetro: %.2f y área: %.2f.%n", getColor(), base, altura, perimetro(), area());
        
        
    }
    
    
    
}
