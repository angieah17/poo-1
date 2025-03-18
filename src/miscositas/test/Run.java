/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miscositas.test;

/**
 *
 * @author manana
 */
public class Run {
    public static void main(String[] args) {
        Person3 p1 = new Person3((short)2002, "Juan Carlos de los Angeles Benditos", "Ramirez Solano De Los Santos");
        Person3 p2 = new Person3("Angie", "Amado");
        Person3 p3 = new Person3(p2);
        Person3 p4 = new Person3("PEDRO", "PEREZ");
        Person3 p5 = new Person3("DULCE", "GARCIA");
        
        p1.show();
        p2.show();
        p3.show();
        p4.show();
        
        System.out.println();
        System.out.println("Probando isBroken");
        System.out.println(p1.isBroken());
        
        System.out.println();
        System.out.println("Probando getAge");
        System.out.println(p1.getAge());
        
        
        System.out.println();
        System.out.println("Probando sameAge");
        System.out.println(p1.sameAge(p3));
        System.out.println(p2.sameAge(p3));
        
        System.out.println();
        System.out.println("Probando compareWith");
        System.out.println(p1.compareWith(p3));
        System.out.println(p2.compareWith(p3));
        
        System.out.println();
        System.out.println("Probando changeName");
        System.out.println(p1.changeName("Juan", "Carlos"));
        p1.show();
        System.out.println(p4.changeName("PABLO", "RAMIREZ"));
        p4.show();
        
        System.out.println();
        System.out.println("Probando changeOnlyName");
        System.out.println(p1.changeOnlyName("Juliana"));
        p1.show();
        System.out.println(p5.changeOnlyName("PABLO"));
        p5.show();
        
        System.out.println();
        System.out.println("Probando changeOnlySurname");
        System.out.println(p1.changeOnlySurname("Ortiz"));
        p1.show();
        System.out.println(p5.changeOnlySurname("ORTIZ"));
        p5.show();
        
        
    }
    
    
    
    
}
