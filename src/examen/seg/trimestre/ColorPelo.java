package examen.seg.trimestre;

import java.util.Random;

public enum ColorPelo {
	
	RUBIO("Rubio"), PELIRROJO("Pelirrojo"), NEGRO("Negro"), CANOSO("Canoso");
	
	private String nombre;

	
	private ColorPelo(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}
	
	public static ColorPelo dameColorPeloAleatorio() {
		
		Random random = new Random();
		
		ColorPelo [] listaDeColoresPelo = ColorPelo.values();
			
		int indiceColorPelo = random.nextInt(0, listaDeColoresPelo.length);
		
		return listaDeColoresPelo[indiceColorPelo];
		
		
	}
	
	
}
