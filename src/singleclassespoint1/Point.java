/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleclassespoint1;

/**
 *
 * @author manana
 */
public class Point {
   
    
    //1. Propiedades
    private byte x;
    private byte y;
    private String colour;
    private char symbol;
    
    //2. Constructores
    
    public Point(byte x, byte y, String colour, char symbol) {
        this.x = x >= 0 && x <= 12 ? x : 0;
        this.y = y >= 0 && y <= 7 ? y : 0;
        this.colour = colour == "black" || colour == "red" || colour == "green" || colour == "yellow" || colour == "blue" || colour == "purple" ? colour: "black";
        this.symbol = symbol == ' ' ? '*':symbol;
    }
    
    public Point(byte x, byte y) {
        this.x = x >= 0 && x <= 12 ? x : 0;
        this.y = y >= 0 && y <= 7 ? y : 0;
        colour = "black";
        symbol = '*';
    }
    
    public Point() {
        this((byte)0,(byte)0);
    }


    public Point(String colour, char symbol) {
        this((byte)0, (byte)0, colour, symbol);
        
    }

    public Point (Point c){ // En el copia se recomienda no tirar de otro constructor, 
        //pues se piden los valores copiados así se salga de los parámetros declarados en el constructor inicial 
        x = c.x;
        y = c.y;
        colour = c.colour;
        symbol = c.symbol;
    }
    
    
    //3.Métodos 
    
    public void showSimple (){
        System.out.printf("Point %c de color %s (%d, %d)%n", symbol, colour, x, y);
    }
    
    public boolean up(){
        
        if(y + 1 >= 0 && y + 1 <= 7){
            y++;
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public boolean down(){
       if(y - 1 >= 0 && y - 1 <= 7){
            y--;
            return true;
        }
        else {
            return false;
        } 
    }
    
    public boolean left (){
        if(x - 1 >= 0 && x - 1 <= 12 ){
            x--;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean right(){
        if(x + 1 >= 0 && x + 1 <= 12){
            x++;
            return true;
        }
        else {
            return false;
        }
    }
    
    public void show (){
                 
       String coloreo;
       
       switch (colour){
           case "red":
               coloreo = "\033[31m"; 
               break;
           case "yellow":
               coloreo = "\033[33m"; 
               break;
            case "blue":
               coloreo = "\033[33m"; 
               break;
            case "purple":
               coloreo = "\033[35m";
               break;  
            case "green":
               coloreo = "\033[32m"; 
               break;   
            case "reset":
               coloreo = "\u001B[0m";
               break;  
            default:
                coloreo = "\033[30m"; 
       }
       
        int posicion =7;
            
        for(int f = 0; f < 8; f++){
        
            for(int c = 0; c <= 12; c++){ 
                if ( c==0){
                    System.out.printf("%d  ", posicion--);
                }
                else {
                System.out.printf("%s", c - 1 == x && 7 - f == y? coloreo + symbol + "\u001B[0m" + "--": "+--");
                }
            }
            System.out.printf("%s", x == 12 && y == 7 - f? coloreo + symbol + "\u001B[0m" : "+");
            System.out.println("");   
            
            if (f != 7){
                for(int c = 0; c <= 12; c++){ 
                
                    if(c == 0){
                        System.out.printf("   %s", "|");
                    }
                    else {
                        System.out.printf("  %s", "|");
                    }
                }
            System.out.println("");   
            }  
            
        }
        /*
        
        for(int f = 0; f < 8; c++){
            for(int c = 1; c <= 13; c++){ 
                if ( c==1){
                    System.out.printf("%d  ", posicion--);
                }
                else {
                System.out.printf("%s", "+--");
                }
            }
            System.out.print("+");  
            System.out.println("");   
            
            
        }    
        
        */
       
      
         for(int c = 0; c <= 12; c++){
            if (c == 0){
                System.out.printf("   %d", 0);
            }
            else if(c >0 && c <= 9){
               System.out.printf("  %d", c); 
            }
            else {
               System.out.printf(" %d", c);
            }          
        }
         
        System.out.println("");
         
      
       
        System.out.printf("%sPoint %c de color %s (%d, %d)\u001B[0m%n", coloreo, symbol, colour, x, y);
        
        
        
        
        
         
        
    }
    
    
}
