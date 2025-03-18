package examen.seg.trimestre;

public class Test {
	
	public static void main(String[] args) {
		
		Edificio e1 = new Edificio(5, 500);
		Persona p8 = new Persona();
		Persona p1 = new Persona("Angie", 59.0, ColorPelo.NEGRO, Continente.AMERICA);
		Persona p2 = new Persona("Angie", 59.0, ColorPelo.NEGRO, Continente.AMERICA);
		Persona p4 = new Persona("Julian", 50.0, ColorPelo.PELIRROJO, Continente.AFRICA);
		Persona p3 = new Persona();
		
		//System.out.println(p1);
		//System.out.println(p2);
		
		e1.entrar(p1);
		e1.entrar(p2);
		e1.entrar(p4);
		
		e1.obtenerInforme();
		
		e1.salir(p1);
		/*e1.salir(p2);
		e1.salir(p1);
		e1.salir(p2);
		e1.salir(p1);
		e1.salir(p4);
		e1.entrar(p1);
		e1.salir(p1);
		e1.salir(p4);
		
		System.out.println(e1);
		
		System.out.println(p1.toString());
		e1.entrar(p1);
		e1.entrar(p1);*/
		
		e1.obtenerInforme();
		e1.entrar(p1);
		e1.obtenerInforme();
	}
	
	
}
