/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misprimerasclases;

/**
 *
 * @author manana
 */
public class TestCounter {
    
    //3. Crear el método main para probar que los constructores funcionan
    
    public static void main(String[] args) {
        Counter c1 = new Counter ();
        Counter c2 = new Counter (100);
        Counter c3 = new Counter(10, "New80 - Model");
        Counter c4 = new Counter (c2);
        
        //3.2 Se crea el array para que al aplicar el show sea más rápido 
        
        Counter [] counters = {c1, c2, c3, c4};
        
        //3.4 Se recorre el array con un for each aplicando el método show en cada bucle
        
        for(Counter c:counters){
            c.show();
        }
        
        //4.1 Probar el método increment ()
        
        System.out.println();
        System.out.println("Probando incrementos ()");
        
        //Prueba 1:
        c2.show();
        
        System.out.println(c2.increment());
        
        c2.show();
        
        //Prueba 2
        
        c3.show();
        
        for(int i = 0; i < 10; i++){
            c3.increment();
        }
        
        c3.show();
        
        //5.1 Probar el método increment (int n)
        
        
        System.out.println();
        System.out.println("Probando incrementos (int n)");
        
        c1.show();
        
        System.out.println(c1.increment(20));
        
        c1.show();
        
        //6.1 Probar el método reset ()
        
        c2.show();
        
        System.out.println(c2.reset());
        
        c2.show();
        
        c3.show();
        
        System.out.println(c3.reset());
        
        c3.show();
        
        System.out.println(c2.getMaxValue());
        
        
        
        
        
    }
    
    
    
}
