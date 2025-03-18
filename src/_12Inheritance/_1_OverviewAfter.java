/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _12Inheritance;

/**
 *
 * @author manana
 */
public class _1_OverviewAfter {
    public static void main(String[] args) {
        
        //AnimalMejorado a = new AnimalMejorado(250);
        GatoMejorado g = new GatoMejorado(6);
        PerroMejorado p = new PerroMejorado(40.5);
        OsoMejorado o = new OsoMejorado(200);
        AnimalMejorado x = new GatoMejorado(45); //Con esto se crea un animal de tipo gato, 
        //por eso funciona con las caracterísiticas propias de un gato. 
               
                
        g.identificar();
        System.out.printf(" y peso %.1f Kg.%n", g.getPeso());
        g.emitirSonido();
        
        p.identificar();
        System.out.printf(" y peso %.1f Kg.%n", p.getPeso());
        p.emitirSonido();
        
        o.identificar();
        System.out.printf(" y peso %.1f Kg.%n", o.getPeso());
        o.emitirSonido();
        
        System.out.println("ANIMAL CREADO DEL TIPO GATO");
        x.identificar();
        System.out.printf(" y peso %.1f Kg.%n", x.getPeso());
        x.emitirSonido();
        
        System.out.println();
        System.out.println("1. Array con 3 gatos");
        
        GatoMejorado g2 = new GatoMejorado(4);
        GatoMejorado g3 = new GatoMejorado(8);
        
        GatoMejorado gatos [] = {g, g2, g3};
        
        for (GatoMejorado ga : gatos) {
            ga.emitirSonido();
        }
        
        System.out.println();
        System.out.println("1. Array con 3 perros");
        
        PerroMejorado [] perros = {
            new PerroMejorado(10),
            new PerroMejorado(20),
            new PerroMejorado(40),
        };
        
        for (PerroMejorado pe : perros) {
            pe.emitirSonido();
        }
        
        System.out.println();
        System.out.println("1. Array con 3 animales");
        
        AnimalMejorado x2 = new PerroMejorado(20);
        AnimalMejorado x3 = new GatoMejorado(10);
        
        AnimalMejorado animales [] = {x, x2, x3};
        
        for (AnimalMejorado an : animales) {
            an.emitirSonido();
        }
        
        
        
    }
}
