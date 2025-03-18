/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miscositas.test;

/**
 *
 * @author manana
 */
public class Person2 {
    
    private short yearOfBirth; //El short en tema de almacenamiento es la mitad que un int
    private String name;
    private String surname;
    private boolean brokenName; 
    private boolean brokenSurname; 
    
    //Constructores

    public Person2(short yearOfBirth, String name, String surname) {
        this.yearOfBirth = yearOfBirth < 1900 || yearOfBirth > 2023 ? 2023: yearOfBirth; 
        
        if(name.length() > 20){
            name = name.substring(0, 20);
            brokenName = true;
        } 
        
        /*
        Como el valor por defecto de un boolean es false no es necesario agregarlo en el else.
        else {
            this.name = name; 
            brokenName = false;
        }
        */
        
        this.name = name.toUpperCase();
        
        if(surname.length() > 20){
            surname = surname.substring(0, 20);
            brokenSurname = true;
        }
        
        this.surname = surname.toUpperCase();
        
    }
    
    public Person2(String name, String surname) {
        this((short)2023, name, surname);
    }
    
    public Person2 (Person2 c){
        this.surname = c.surname;
        this.yearOfBirth = c.yearOfBirth;
        this.name = c.name;
        this.brokenName = c.brokenName;
        this.brokenSurname = c.brokenSurname;
    }
    
    
    //Métodos 
    
    public void show (){
        System.out.printf("Person %s %s nacido en %d con broken name: %b o brokensurname: %b.%n", name, surname, yearOfBirth, brokenName, brokenSurname);
            
    }
    
    public boolean isBroken(){
      /* Esto sería redundante, porque brokenName y brokenSurname son true por defecto.
        if(brokenName == true || brokenSurname == true){
          return true;  
        } else {
            return false;
        }*/
        
      return brokenName || brokenSurname;
        
    }
    
    
    public boolean changeName (String name, String surname){
        
        
        /*  *Usar solo caracteres del alfabeto inglés en mayúsculas.
2.          *Deben tener solo 1 ó 2 palabras: 0 o 1 espacios en blanco que no pueden estar en los extremos. 
3.          *Ninguno puede ser broken después del cambio: longitud debe ser como mucho 20.
4.          *No puede ser ninguno blanco: al menos debe haber una letra del alfabeto inglés.*/
        
        
        //NAME solo alfabeto inglés o espacios en blanco
        for( int i = 0; i < name.length(); i++){
            if(!(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z' || name.charAt(i) <= ' ' )){ //Se agrega ' ' porque algunos nombres tienen un espacio en blanco que no estén en el alfabeto inglés como Francisco Javier y ahí ya se sale de lo que buscaba el probelma 
                return false;
              
            } 
        }
        
        //El valor de soloAlfabetoInglesName indica si solo el alfabeto es inglés
        
        //SURNAME solo alfabeto inglés o espacios en blanco
        
       
        
        for( int i = 0; i < surname.length(); i++){
            if(!(surname.charAt(i) >= 'A' && surname.charAt(i) <= 'Z' || surname.charAt(i) == ' ' )){
              return false;  //terminé sin poder cambiar el nombre
            } 
        }
        
        
        
        //como se está usando charAt se puede usar == porque se está hablando 
        //de datos primitivos no de objetos como es el caso de un String
        //Entonces ahí ya se refiere es name.charAT(i) no se está mirando si es name 
        //Los datos primitivos tienen opeaciones pero no métodos, propiedades, clases. 
        //El String es una clase (objetos).   
        
        //3. Deben tener solo 1 ó 2 palabras: 0 o 1 espacios en blanco que no pueden estar en los extremos. 
       
        
        //NAME
        String nameSinBlancosEnExtremos = name.trim();
        
        int contadorBlancosEnName = 0;
        
        for (int i = 0; i < nameSinBlancosEnExtremos.length(); i++) {
            if(nameSinBlancosEnExtremos.charAt(i) == ' '){
               contadorBlancosEnName++;
               if (contadorBlancosEnName > 1){
                return false;
               }
            
            }
        }
        
        //SURNAME
        
        String surnameSinBlancosEnExtremos = name.trim();
        int contadorBlancosEnSurname = 0;
        
        for (int i = 0; i < surnameSinBlancosEnExtremos.length(); i++) {
            if(surnameSinBlancosEnExtremos.charAt(i) == ' '){
               contadorBlancosEnSurname++;
               if (contadorBlancosEnSurname > 1){
                return false;
               }
            
            }
        }
        
        //Ninguno puede ser broken después del cambio:
        //longitud debe ser como mucho 20
        
        if(name.length() > 20 || surname.length() > 20){
            return false;
        }
        
        //No puede ser ninguno blanco: al menos debe haber una letra del alfabeto inglés.
        
        //Llegados a este punto ya antes se había limitado que entraran solo alfabeto inglés y mayúsuculas, por lo tanto, solo falta verificar 
        //que entre "      " o "", por eso a través de la siguiente condición solo falta limitar esta
        
        if(name.trim().equals("") || surname.trim().equals("")){
            return false;
        }
       
        
        this.name = name;
        this.surname = surname;
        
        this.brokenName = brokenSurname = false;
        
        
        
                
        return true; 
    }    
    
    public boolean changeSurname (String surname){
       return this.changeName(this.name, surname); 
        //Quedan pequeñas cosas sin concretar en la forma de este código, pero por ahora lo deja así
    }
    
    public boolean changeOnlyName (String name){
       return changeName(name, surname);
    }
    
    
    public short getAge(){
                
        return (short)(2023 - yearOfBirth); 
        
    }
    
    public boolean compareWith (Person2 p){
        return sameAge(p) == true && name.equals(p.name) && surname.equals(p.surname);
        
       /*Redundante: 
        
        if(sameAge(p) == true && name.equals(p.name) && surname.equals(p.surname)){
             return true;
        }else {
            return false;
        }*/
    }
    
    public boolean sameAge (Person2 p){
        return yearOfBirth == p.yearOfBirth;      
        
    }
    
    
    
        
        
}
    
    
    
    

