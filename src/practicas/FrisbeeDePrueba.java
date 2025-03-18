/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

/**
 *
 * @author Angie Amado
 */
public class FrisbeeDePrueba {
    private String color;
    private int peso;
    private double precio;
    private boolean nuevo;

    
    public FrisbeeDePrueba(String color, double precio) {
        this.color = color;
        peso = 125;
        this.precio = precio > 0 ? precio : 10.5;
        nuevo = true;
    }
    
    public FrisbeeDePrueba(){
        this("blanco", 10.2);
    }
    
    public FrisbeeDePrueba(FrisbeeDePrueba c){
        this.color = c.color;
        peso = 125;
        this.precio = c.precio;
        this.nuevo = true;
    }
    
    public void show (){
        System.out.printf("El frisbee %s de peso %d gr y precio %.2f%n", color, peso, precio);
    }
    
    public static void main(String[] args) {
       FrisbeeDePrueba f1 = new FrisbeeDePrueba ("azul", 12.7);
       FrisbeeDePrueba f2 = new FrisbeeDePrueba ();
       FrisbeeDePrueba f3 = new FrisbeeDePrueba ("rojo", 12.2);
       FrisbeeDePrueba f4 = new FrisbeeDePrueba (f3);
       
       new FrisbeeDePrueba ("rojo", 76.9);
       
       f1.show();
       f2.show();
       f3.show();
       f4.show();
       
        System.out.println(f1.esDeColor());
        System.out.println(f3.esDeColor());
        
        f3.actualizaPrecio();
        f3.show();
        
        f4.actualizaPrecio();
        f4.show();
        
    }

    public int getPeso(){
        return peso;
    }
            
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public void setNuevo (boolean nuevo){
        this.nuevo = nuevo;
    }
    
    
    //blanco o rojo independientemente de si está en mayus o minus true sino false
    
    public boolean esDeColor (){
        
        if(color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("rojo")){
            return true;
        } return false;
        
    }
    
    //Multiplica el precio *2 solo si esDeColor blanco o rojo y el frisbee deja de ser nuevo
    
    public void actualizaPrecio (){
        
        if(this.esDeColor() && nuevo){
            precio *= 2;
            nuevo = false;
        } 
        
    }
    
    //140 gr. Método que cree un nuevo frisbee que sea copia de un frisbee y herede todos los atributos salvo el peso
    
    public FrisbeeDePrueba copiaNuevoMercado (){
        
       FrisbeeDePrueba f = new FrisbeeDePrueba (color,precio);
        
        f.setPeso(140);
        f.setNuevo(true);
      
        return f;
        
            
    }
    
    
}
