package examen.seg.trimestre;

import java.util.Random;

public enum Continente {
	
	EUROPA("Europa"), AMERICA("América"), ASIA("Asia"), AFRICA("Africa"), OCEANIA("Oceanía"), ANTARTIDA("Antartida");
	
	private String nombre;

	
	private Continente(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}
	
	
	//NO ME ESTÁ FUNCIONANDO AL GENERAR EL CONSTRUCTOR VACÍO QUE ME DE EL CONTINENTE ALEATORIO, SIN EMBARGO, TE DEJÓ EL CÓDIGO HASTA DONDE LLEGUÉ
	public static Continente dameContinenteAleatorio() {
		
		Random random = new Random();
		
		Continente [] listaDeContinentes = Continente.values();
		
		System.out.println(listaDeContinentes);
				
		int indiceContinente = random.nextInt(0, listaDeContinentes.length);
		
		return listaDeContinentes[indiceContinente];
		
		
	}
	
	
	
	
}
