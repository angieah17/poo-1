/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author manana
 */

//1. Se crea la clase con sus propiedades
public class Vehiculo {
    private String marca; //método getter (setter no nos interesa)
    
    public String getMarca (){
        return marca;
    }
    
    private String tipo; //getter
    
    public String getTipo (){
        return tipo;
    }
    
    private byte numRuedas; //getter
    
    public byte getNumRuedas(){
        return numRuedas;
    }
    private short fechaFabricacion; //getter
    
    public short getFechaFabricacion(){
        return fechaFabricacion;
    }
    
    private String [] historicoColores; //máximo 5 //no getter no setter
    private String color; //getter
    
    public String getColor(){
        return color;
    }
    
    
    private int x; //getter
    
    public int getX(){
        return x;
    }
    private double velocidad; //getter
    
    public double getVelocidad(){
        return velocidad;
    }
    private boolean nuevo; //getter
    
    public boolean getNuevo(){
        return nuevo;
    }
    private double kms; //getter
    
    public double getKms(){
        return kms;
    }
    
    private double precio; //getter y setter ¿POR QUÉ GETTER Y SETTER PARA ESTA PROPIEDAD?
    
    public double getPrecio (){
        return precio;
    }
    
    public void setPrecio(double precio){ //cuando es ponerle valor no debe retornar nada
        this.precio = precio < 0 ? 0: precio;
    }
    
    //4. Se crean los constructores
    
    //Constructor 1 
    //Vehículo con todos los parámetros

    public Vehiculo(/*double velocidad,*/ String color, String marca, /*String tipo,*/ 
            byte numRuedas,double precio) {
        //tengo ya el this con los valores por defecto
        //this.velocidad = velocidad > 0 ? velocidad: 0; //Limito los datos que pueden entrar
        this.fechaFabricacion = 2024;
        velocidad = 0; //En este caso la velocidad siempre será 0, porque sale de fábrica, no un videojuego
        this.color = color;
        this.marca = marca == null ? "Sead":marca; //Sead en el caos que no entre marca
        //this.tipo = tipo;
        this.numRuedas = numRuedas < 2? 2:numRuedas;
        
        switch(this.numRuedas){
            case 2:
                tipo = "moto";
                break;
            case 3:
                tipo = "triciclo";
                break;
            case 4:
                tipo = "coche";
                break;
            case 10:
                tipo = "autobús";
                break;
            default:
                tipo = "camión";
                break;
        }
        
        nuevo = true;
        kms = 0;
        historicoColores = new String[5]; 
        if (this.color != null){
            historicoColores[0] = this.color;
        }
        this.precio = precio < 0? 0: precio;
    }
    
    //Constructor 2
    //Crea un vehículo nuevo a partir de las características de un vehículo antiguo
    
    public Vehiculo (Vehiculo ve, double precio){
        
        
        this(ve.color, ve.marca, ve.numRuedas,precio);
        
    }
    
    //Constructor 3
    //Crea un vehículo nuevo con valores predeterminados
    
    public Vehiculo (){
        this("blanco", "Seat",(byte)4,1_000);
    }
    
    //Constructor 4
    
        //Crea un vehículo copia 
    
    public Vehiculo(Vehiculo v){
        velocidad = v.velocidad;
        color = v.color;
        marca = v.marca;
        tipo = v.tipo;
        numRuedas = v.numRuedas;
        nuevo = v.nuevo;
        kms = v.kms;
        historicoColores = v.historicoColores;
        precio = v.precio;
        x = 0;
        fechaFabricacion = v.fechaFabricacion;
    }
    
    //Aquí no puedo usar el this () del Constructor 1 porque dentro de 
    //este se pueden hacer cambios que afecten y no quede la copia tal cual del vehículo que entre
    
    // 2. Se crean las acciones (métodos)
    
    public void show (){
        System.out.printf("Vehiculo: fabricacion: %d x: %d, velocidad: %.2f, color: %s, marca: %s, tipo: %s, numRuedas: %d, ¿nuevo?: %s, kms: %.2f, precio: %f.%n",fechaFabricacion, x, velocidad, color, marca, tipo, numRuedas, nuevo ? "nuevo":"usado", kms, precio );  
        
        System.out.println("Histórico de colores");
        
        for (String hcol: historicoColores) {
            System.out.printf("%s ", hcol != null ? hcol : "");
        }
        
        System.out.println();
        
    }
    
   
    /*public Vehiculo pintar (String color){
        
        int puedoEscribirEn = -1;
        
        for(int i = 0; i < historicoColores.length; i++){
           if(historicoColores[i] == null){
             puedoEscribirEn = i; //Esto es porque ha encontrado hueco
             break; 
           }  
        }
       
        if(puedoEscribirEn != -1){
            historicoColores[puedoEscribirEn] = color;
            this.color = color;
            return this;
        } else {
            return null;
        }
       
      
    }*/
    
    public Vehiculo pintar (String color){ 
        
        
        for(int i = 0; i < historicoColores.length; i++){
           if(historicoColores[i] == null){
             historicoColores[i] = color;
             break;
           }
       }
       
       return this;
      
    }
    
    
    /* public Vehiculo pintar (){ //Razón por la que se pone vehículo
       return null;
       color = "blanco;"
       return this;
    }*/
    
    /* public static void main(String[] args) { //Aquí se ve la diferencia cuando se pone vehículo
        Vehiculo v1 = new Vehiculo();
        v1.pintar().pintar("verde").pintar();
    }*/
    
    public Vehiculo para(){
        velocidad = 0;
        System.out.println("El vehículo se ha detenido.");
        return this;
    }
    
    public Vehiculo acelera () {
        
        velocidad = velocidad + 10 >= 120 ? 120: velocidad + 10;
        //System.out.printf("Nueva velocidad: %.2f.%n", velocidad);
        return this;
    }
    
    public Vehiculo frena (){
        velocidad = velocidad - 10 < 0 ? 0:velocidad - 10;
        //System.out.printf("Nueva velocidad: %.2f.%n", velocidad);
        return this;
    }
    
    
    //pintar fijandom een otro cochhe, se le pasa otro coche y color, es posible que no se pueda pintar porque hay un historico de colores
    
    public Vehiculo pintarBasadoEn (Vehiculo c){
        
        return c == null ? null : pintar (c.color);
        
        /*if(c == null){
            return null;
        } else {
            return pintar (c.color); //Se evita repetir el código para no tener que sobre ajustar.
        }*/
        
    }
    
    public Vehiculo pintarColorDefecto(){
        return pintar("blanco");
    }
    
    /*
    //Método getter
    public double getVelocidad(){
       return velocidad; 
    }
    
    //Método setter
    public void setVelocidad (double velocidad){
        this.velocidad = velocidad;
    }
    */
    
}
