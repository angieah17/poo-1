/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miscositas.test;

/**
 *
 * @author manana
 */
public class Person3 {
    
    //FALTA ARREGLAR EL STRING FINAL COMO LO HA PEDIDO EN EL SHOW 
    //FALTA EL MÉTODO C Y D.
    
    //1. Propiedades
    
    private short yearOfBirth;
    private String name;
    private String surname;
    private boolean brokenName;
    private boolean brokenSurname;
    
    //2. Constructores

    public Person3(short yearOfBirth, String name, String surname) {
        this.yearOfBirth = yearOfBirth < 1900 || yearOfBirth > 2023 ? 2023 : yearOfBirth;
        
        if(name.length() > 20){
            name = name.substring(0, 20);
            brokenName = true;
        }
                   
        this.name = name.toUpperCase();
        
        if (surname.length() > 20){
            surname = surname.substring(0, 20);
            brokenSurname = true;
        }
        
        this.surname = surname.toUpperCase();
        
       
    }

    public Person3(String name, String surname) {
        this((short)2023, name, surname);
    }
    
    public Person3 (Person3 c){
        this.yearOfBirth = c.yearOfBirth;
        this.name = c.name;
        this.surname = c.surname;
        this.brokenName = c.brokenName;
        this.brokenSurname = c.brokenSurname;
    }
    
    
    //3. Métodos
    
    public void show (){
            System.out.printf("Person %s (%b) %s (%b) de %d años.%n", name, brokenName, surname, brokenSurname, getAge());
        }
    
    
    public boolean isBroken (){
        return brokenName || brokenSurname;
    }
    
    public short getAge (){
        return (short)((2023) - (yearOfBirth));
                
    }
     
    public boolean sameAge (Person3 p){
        
        return (this.yearOfBirth == p.yearOfBirth);
        
    }
    
    public boolean compareWith (Person3 p){
        
        return this.getAge()== p.getAge() && this.name.equals(p.name) && this.surname.equals(p.surname);
        
    }
    
    public boolean changeName (String name, String surname){
                
        //1. Usar solo caracteres del alfabeto inglés en mayúsculas.
        
        for (int i = 0; i < name.length(); i++){
            if(!(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z' || name.charAt(i) <= ' ')){
                return false;
            }
        }
        
        
        for (int j = 0; j < surname.length(); j++){
            if(!(surname.charAt(j) >= 'A' && surname.charAt(j) <= 'Z' || surname.charAt(j) <= ' ')){
                return false;
            }
        }
        
        //2. Deben tener solo 1 ó 2 palabras: 
        //0 o 1 espacios en blanco que no pueden estar en los extremos. 
        
        
        //a. Name sin blancos en extremos: name.trim();
        String nameSinBlancosEnExtremos = name.trim();
        
        //b. Name deben tener solo 1 o 2 palabras: es decir 0 o 1 espacios en blanco.
        
        int contadorBlancosEnName = 0;
        
        for (int i = 0; i < nameSinBlancosEnExtremos.length(); i++){
            if(nameSinBlancosEnExtremos.charAt(i) == ' '){
               contadorBlancosEnName++;
            }
            if(contadorBlancosEnName > 1){
                return false;
            }
        }
        
        //3. Ninguno puede ser broken después del cambio: longitud debe ser como mucho 20.
        
        if(name.length() > 20 || surname.length() > 20){
            return false;
        }
        
        //4. No puede ser ninguno blanco: al menos debe haber una letra del alfabeto inglés.
        
        if(name.trim().equals("") || surname.trim().equals("")){
            return false;
        }
               
    
        this.name = name;
        this.surname = surname;
        
        brokenName = brokenSurname = false;
        
        return true;
        
    }

    public boolean changeOnlyName (String name){
        return changeName(name, surname);
                
    }
    
    public boolean changeOnlySurname (String surname){
        return changeName(name, surname);
    }
    
    
    
    
    
        
}
