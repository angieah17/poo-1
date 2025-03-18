/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miscositas.test;

/**
 *
 * @author manana
 */
public class Programa2 {
    
    public static void main(String[] args) {
        
        System.out.println("EXPLICACIÓN DEL PUNTO C");
        //EXPLICACION DEL PUNTO C
        
        String s = "hol a ";
        
        //Número de caracteres del texto (o longitud)
        
        System.out.println(s.length());
        
        //nombre.length() > 20
        
        //Número de caracteres del texto quitando los espacios blancos de los extremos
        
        System.out.println(s.trim().length()); //Para contar .length en array es sin parentesis, en string sí los lleva
        
        //s.trim() está quitando el espacio de los extremos, por eso ahora está en 5
        
        //0 ó 1 espacios en blanco que no pueden estar en los extremos 
        
        String [] letras = s.trim().split(""); //split según el elemento separador crea un array con todos los elementos que haya, como aquí se puso como elemento separador nada "" pues crea uno con todas las letras
        int espaciosEnBlanco = 0;
        
        /*trim() le quita los espacios de los extremos y el split me daría un array 
        con los extremos que están entre las comas, la coma es el elemento separador*/
        for(String letra:letras){
            if(" ".equals(letra)){ //Usa el método equals 
                espaciosEnBlanco++;
            }
        }
        
        /*No se puede poner if letra == " " sino que se debe hacer con el método equals. 
        La palabra hola de la pag 7 y de la pag 9 no es lo mismo pese a tener el mismo contenido, 
                no es la misma palabra, aquí es lo mismo. Equal es preguntar si tiene el mismo contenido.*/ 
        
        System.out.println(espaciosEnBlanco);
        
        //Solo letras del alfabeto inglés
        
        //Estoy generando un indice para cada una de las letras "hol a "
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) == ' '){
            }else{
                break;
            }
        }
        
        //No en blanco 
        
        if (s.length() == 0){
            
        } //No tiene información
        
        if (s.trim().length()== 0){
            //para cuando solo hay blancos, este incluye al anterior
        }
        
        
        
        
        
        System.out.println(espaciosEnBlanco);
     
        //RESUMEN MÉTODOS DE LA CLASE STRING
        
        /*.length() es un método de la clase string para determinar la longitud del string
        .charAt(int i) me da los caracteres en determinada posición 
        .trim() elimina los espacios  de los extremos 
        .split() de acuerdo con el separador que se use da un array de strings 
        dividido conforme al separador utilizado
        */
        
        String ss = " hola ";
        
        ss.trim();
        
        
        String sss = ss.trim(); //Sin cambiar el original 
        
        System.out.println(ss);
        System.out.println(sss);
        
        ss = ss.trim(); //Cambiando el original
        
        System.out.println(ss);
              
        /*
        public String trim (){
            No devuelve el string cambiado, sino que devuelve otro string, no ha cambiado al original.
                    Pasa lo mismo que con el vector. 
                            
                            Los String son clases inmutables. 
        
        Por eso se puede recoger en un nuevo String el valor que se ha generado al aplicarle el método. String sss.
        
        Se puede escribir para que se cambie el original, pero como se ve es declarando la variable: 
        
        ss == ss.trim();
        
        
        }
        
        s1 = "abc";
        s2 = "abc";
        s3 = new String ("abc");
        
        == ha de ser igual. s1 == s2 
        equals : revisa el mismo contenido. Siempre que el contenido es igual, no 
        importa que sean objetos distintos.
        equalsIgnoreCase : revisa el mismo contenido ignorando las mayúsculas en la
        verificación.
        
        */
        
        
        
        
        
        System.out.println("");
        System.out.println("DESARROLLO DEL EJERCICIO");
        
        Person2 p1 = new Person2("Angie", "Amado");
        Person2 p2 = new Person2((short)1800, "Pedro", "Perez");
        Person2 p3 = new Person2((short)2005, "Juan", "Lopez");
        Person2 p4 = new Person2(p3);
        Person2 p5 = new Person2((short)2030, "Manuel Antonio María de Jesús", "Pérez de los Ríos de Guzmal y otras cosas");
        Person2 p6 = new Person2((short)2010, "María", "Ardila");
        
        
        Person2 [] personas = {p1, p2, p3, p4, p5, p6};
        
        for(Person2 p:personas){
            p.show();
        }
        
        System.out.println("");
        System.out.println("Probando isBroken");
        System.out.println(p5.isBroken());
        System.out.println(p1.isBroken());
        
        System.out.println("");
        System.out.println("Probando getAge");
        System.out.println(p3.getAge());
           
        
        System.out.println("");
        System.out.println("Probando sameAge");
        System.out.println(p3.sameAge(p5));
        System.out.println(p1.sameAge(p5));
        
        System.out.println("");
        System.out.println("Probando compareWith");
        System.out.println(p3.sameAge(p5));
        System.out.println(p3.sameAge(p4));
        
        System.out.println("");
        System.out.println("Probando changeName");
        System.out.println(p6.changeName("ANGIE", "AMADO"));
        
        p6.show();
        
    }
    
}
