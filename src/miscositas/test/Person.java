/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miscositas.test;

/**
 *
 * @author manana
 */
public class Person {
    // FALTA CAMBIAR EL INT POR EL SHORT 
    
    //1. Propiedades 
    
    private int yearOfBirth;
    private String name; 
    private String surname; 
    private boolean brokenName;
    private boolean brokenSurname;


    //2. Constructores 
    public Person(int yearOfBirth, String name, String surname) {
        this.yearOfBirth = yearOfBirth > 1900 && yearOfBirth < 2023 ? yearOfBirth : 2023;
        
        if (name.length() > 20){
            this.name = name.substring(0, 20).toUpperCase();
            brokenName = true;
        } 
        
        this.name = name.toUpperCase();
        
        if (surname.length() > 20){
            this.name = surname.substring(0, 20).toUpperCase();
            brokenSurname = true;
        } 
        
        this.surname = surname.toUpperCase();
    }

    public Person(String name, String surname) {
        this (2023, name, surname);
    }
    
    public Person (Person c){
        yearOfBirth = c.yearOfBirth;
        name = c.name;
        surname = c.surname;
        brokenName = c.brokenName;
        brokenSurname = c.brokenSurname;
    }
    
    
    //3. Métodos
    public void show (){
        System.out.printf("Person %s %s de %d años.%n", name, surname, getAge());
    }
    
    public boolean isBroken (){
        
        return brokenName || brokenSurname;        

    }
    
    public int getAge (){
        return 2023 - yearOfBirth;
        
        //De aquí me va a retornar un int
    }
    
    public boolean sameAge (Person p){
        
        //De aquí me va a retornar un boolean
        return yearOfBirth == p.yearOfBirth;
        
        
    }
    
    public boolean compareWith (Person p){
        
        return sameAge(p) && name.equals(p.name) && surname.equals(p.surname);
        
    }
    
    public boolean changeName (String name, String surname){
        
        //1. Usar solo caracteres del alfabeto inglés en mayúsculas.
        
        for (int i = 0; i < name.length(); i++){
            if (!(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z' || name.charAt(i) <= ' '))
               return false; 
        }
        
        for (int i = 0; i < surname.length(); i++){
            if (!(surname.charAt(i) >= 'A' && surname.charAt(i) <= 'Z' || surname.charAt(i) <= ' ')) 
                return false;
        }
        
        //2. Deben tener solo 1 ó 2 palabras: 
        //Es decir, 0 o 1 espacios en blanco que no pueden estar en los extremos. 
        
        String nameSinEspaciosBlancos = name.trim();
        int contadorDeEspacios = 0;
        
        for (int i = 0; i < nameSinEspaciosBlancos.length(); i++){
            if (nameSinEspaciosBlancos.charAt(i) == ' '){
                contadorDeEspacios++;
                
                if (contadorDeEspacios > 1){
                return false;
                }
            }          
        }
        
        String surnameSinEspaciosBlancos = name.trim();
        int contadorDeEspaciosSurname = 0;
        
        for (int i = 0; i < surnameSinEspaciosBlancos.length(); i++){
            if (surnameSinEspaciosBlancos.charAt(i) == ' '){
                contadorDeEspaciosSurname++;
                
                if (contadorDeEspaciosSurname > 1){
                return false;
                }
            }          
        }
        
        
        //3. Ninguno puede ser broken después del cambio: 
        //Es decir, la longitud debe ser como mucho 20.
        
        if(name.length() > 20 || surname.length() > 20){
            return false;
        }
        
        //4. No puede ser ninguno blanco: 
        //Es decir, al menos debe haber una letra del alfabeto inglés.
        
        if (name.trim().equals("") || surname.trim().equals("")){
            return false;
        }
        
        this.name = name;
        brokenName = false;
        
        this.surname = surname;
        brokenSurname = false;
        
                
        return true;
        
        
        
    }
    
    public boolean changeOnlyName(String name){
        return changeName(name, surname);
    }
    
    public boolean changeOnlySurname (String surname){
        return changeName(name, surname);
    }
    
}
