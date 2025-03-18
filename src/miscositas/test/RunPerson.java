/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miscositas.test;

/**
 *
 * @author manana
 */
public class RunPerson {
    
    public static void main(String[] args) {
        Person p1 = new Person(1800, "Pedro Antonio de Los Angeles", "Ortiz");
        Person p2 = new Person("Angie", "Amado");
        Person p3 = new Person(2005, "Carlos", "Perez");
        Person p4 = new Person(p3);
        Person p5 = new Person("JOSE", "GARCÍA");
        
        Person [] personas = {p1, p2, p3, p4};
        
        for (Person p: personas) {
            p.show();
        }
        
        System.out.println("");
        System.out.println("Probando isBroken");
        System.out.println(p1.isBroken());
        System.out.println(p2.isBroken());
        
        System.out.println("");
        System.out.println("Probando sameAge");
        System.out.println(p1.sameAge(p2));
        System.out.println(p2.sameAge(p3));
        
        
        System.out.println("");
        System.out.println("Probando compareWith");
        System.out.println(p1.compareWith(p2));
        System.out.println(p4.compareWith(p3));
        
        
        System.out.println("");
        System.out.println("Probando changeName");
        p1.show();
        System.out.println(p1.changeName("Rose", "PeREZ"));
        p1.show();
        System.out.println();
        p5.show();
        System.out.println(p5.changeName("JULIA", "ORTIZ"));
        p5.show();
        
        
    }
    
}
