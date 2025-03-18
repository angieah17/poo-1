/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

/**
 *
 * @author Angie Amado
 */
public class Frisbee {
    private String color;
    private int peso;
    private double precio; 
    private boolean nuevo;

    public Frisbee(String color, double precio) {
        this.color = color;
        this.peso = 125;
        this.precio = precio >= 0 ? precio : 10.5;
        nuevo = true;
    }
      
    
    public Frisbee (){
        this("blanco", 10.99);
    }
    
    public Frisbee (Frisbee c){
        this.color = c.color; 
        this.peso = 125;
        this.precio = c.precio;
        nuevo = true;
    }
    
    public void show (){
        System.out.printf("El frisbee %s de peso %d gr y precio %.2f.%n", color, peso, precio);
    }
    
    //Me indique true si es de color rojo o blanco
    
    public boolean esDeColor (){
        
        if(color.equals("rojo") || color.equals("blanco")){
            return true;
        } 
        return false;
        
    }
    
    //Multiplica el precio *2 solo si esDeColor blanco o rojo y el frisbee deja de ser nuevo
    
    public void actualizaPrecio (){
        
        if(this.esDeColor() && this.nuevo){
            precio *= 2;
            nuevo = false;
        }
        
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }
    
    
    
    
     //Método que cree un nuevo frisbee que sea copia de un frisbee y herede todos los atributos salvo el peso que sea de 140 gr. 
    
    public Frisbee nuevoMercado (){
        
        Frisbee f = new Frisbee (color, precio);
        
        f.setNuevo(true);
        f.setPeso(140);
        
        return f;
        
    }
    
    
}
