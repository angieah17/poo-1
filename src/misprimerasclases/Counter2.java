/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misprimerasclases;

/**
 *
 * @author manana
 */
public class Counter2 {
    
    //1. Propiedades de mi clase con valores predeterminados (macro)
    private int value; //No es necesario ponerle 0 porque su valor por defecto siempre será lo más cercano a 0
    private int maxValue = 100_000; //Aquí sí se pone el valor por defecto porque queremos que sea diferente a 0
    private String model = "N-COUNTER"; 
    private static String counterEnEsperanto = "0hmmm";
    private static int totalCounters = 0; //Ir contando la cantidad de Counters (instancias) que se vayan creando
    
    
    //Getter

    public static String getCounterEnEsperanto() {
        return counterEnEsperanto;
    }
    
    //Método no Static
    
    public void showEnEsperanto(){
        System.out.printf("%s: modelo (%s) y valor %d de %d.%n", Counter2.counterEnEsperanto, model, value, maxValue);
    }
    
    //Se puede poner Counter2.counterEnEsperanto o this.counterEnEsperanto, lo suyo es llamarlo de la primera
    //manera porque al ser una propiedad static se llama desde la clase COunter2.
    //Se recomienda para la propiedad static poner el Counter2. para reforzar o dar mayor claridad en el código
    //que esa propiedad es static
    
    
    //Método Static
    
    public String comoSeDiceShowEnEsperanto (){
        return counterEnEsperanto;
    }
    
    //Le puedo preguntar sobre la propiedad static tanto a la clase como a un objeto de la clase. 
    //Si se le pone el static se le está preguntando a la clase
    
    
    //Constructores
    
    public Counter2 (){  
        totalCounters++;
    }
        
    public  Counter2 (int maxValue){
        this.maxValue = maxValue < 100 ? 100: maxValue; 
        totalCounters++;
    }
    
    public Counter2 (int maxValue, String model){
        this.maxValue = maxValue < 100 ? 100: maxValue; //Desde el constructor se puede delimitar los valores que se pueden incluir, en 
        //este caso se inventó que como mín valor de maxValue sea 10 para evitar que sea negativo
        this.model = model;
        totalCounters++;
    }
    
    public Counter2 (Counter2 c){ //Constructor copia
        value = c.value;
        maxValue = c.maxValue;
        model = c.model;
        totalCounters++;
    }
    
    public void show(){ //En algún momento si se definen parámetros en el método, se tendría que diferenciar con this en el printf
       System.out.printf("Contador: modelo (%s) y valor %d de %d.%n", model, value, maxValue);
    }
    
  
    //public boolean increment(){
        
        /*boolean puedoIncrementar = value < maxValue;
        value = puedoIncrementar ? value++: value;
        return puedoIncrementar;*/
        
        
        /*if (value < maxValue){ //En < = ya no podría incrementar porque se excede al maxValue
            //incrementa
            value++;
            return true;
        } else{
          //no incrementa  
          return false;
        }
        
    }*/
    
    //El siguiente es igual que el primer public boolean increment () comentado
    
    public boolean increment(){
        return increment(1); //Se está llamando el método increment int n , se puede poner this para diferencialo a que se refiere al segundo 
    }
    
    public boolean increment(int n){
        
        if (value + n <= maxValue){
            //incrementa en n
            value += n;
            return true;
        } else{
          //llega al máximo, perdiendo algún incremento
          value = maxValue;
          return false;
        }
        
    }
    
    /*boolean significa que puede devolver un boolean, increment es un método y en este 
            caso no se pone el void, porque eso significa que no devuelve nada, 
            en este caso queremos que devuelva un boolean*/
        
    
    public static void main(String[] args) {
       
        //Probando constructores
        Counter2 c1 = new Counter2 ();
        Counter2 c2 = new Counter2 (100);
        Counter2 c3 = new Counter2 (100, "Model-ONE");
        Counter2 c4 = new Counter2(c3);
        Counter2 c5 = new Counter2();
        
       
        
        //Array de counters diversos
        Counter2 [] counters = {c1, c2, c3, c4};
        
        //Mostrar counters
        for (Counter2 counter : counters) {
            counter.show();
        }
        
        /*c1.show();
        c2.show();
        c3.show();
        c4.show();*/
        
        
        //Probando increment()
        System.out.println();
        System.out.println("Probando incrementos c1");
        
        c1.show(); //Aquí es como inicia
        
        for (int i = 0; i < 10; i++) {
            System.out.println(c1.increment());
        }
        
        System.out.println(c1.increment()); //Con esto se verifica si devuelve true
        c1.show();
        
        System.out.println();
        System.out.println("Probando incrementos c2");
        
        c2.show();
        
        System.out.println(c2.increment());
        
        c2.show();
        
        System.out.println();
        //Probando increment(int n)
        System.out.println("Probando incrementos -n");
        c2.show();
        System.out.println(c2.increment(50));
        c2.show();
        System.out.println(c2.increment(40));
        c2.show();
        System.out.println(c2.increment(20));
        
        System.out.println();
         //Probando un reset 
        System.out.println("Probando un reset ()");
        c2.show();
        System.out.println(c2.reset());
        c2.show();
        c4.show();
        System.out.println(c2.reset());
        c4.show();
        
        System.out.println();
        System.out.println("Instancias que se van creando: (total counters)");
       
        //Idealmente preguntarle a la clase porque totalCounters es una propiedad de la clase
        System.out.println(Counter2.totalCounters);
        //También se le puede preguntar a la instancia, pero no es lo ideal 
        System.out.println(c1.totalCounters);
    }
    
    public boolean reset (){
        if (value == maxValue){
            value = 0;
            return true;
        } else {
            return false;
        }
    }
    
    
        
    
}

