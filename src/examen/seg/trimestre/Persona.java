package examen.seg.trimestre;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Persona {
	
	//FALTA REVISAR EL CONSTRUCTOR DE ALEATORIO
	
	
	//1. Propiedades
	private String nombre;
	private double peso;
	private ColorPelo colorPelo;
	private Continente continenteProcedencia;
	private static Random random = new Random();
	
	
	//2. Constructores
	
	public Persona(String nombre, double peso, ColorPelo colorPelo, Continente continenteProcedencia) {
		this.nombre = nombre;
		this.peso = peso;
		this.colorPelo = colorPelo;
		this.continenteProcedencia = continenteProcedencia;
	}
	
	public Persona () {
		
		List<String> listaNombres = new ArrayList<>();
		
		listaNombres.add("Pedro");
		listaNombres.add("María");
		listaNombres.add("Juan");
		listaNombres.add("Rosa");
		listaNombres.add("Carmen");
		listaNombres.add("Nestor");
		listaNombres.add("Miguel");
		listaNombres.add("Sebastian");
		listaNombres.add("Arturo");
		listaNombres.add("Jose");
				
		nombre = listaNombres.get(random.nextInt(listaNombres.size()));
		
		
		
		//NO ME ESTÁ FUNCIONANDO AL GENERAR EL CONSTRUCTOR VACÍO QUE ME DE EL CONTINENTE ALEATORIO, 
		//SIN EMBARGO, TE DEJÓ EL CÓDIGO DE CÓMO LO ESTABA INTENTANDO HACER
		
		colorPelo = colorPelo.dameColorPeloAleatorio(); 
		continenteProcedencia = continenteProcedencia.dameContinenteAleatorio();
		peso = 60.0;
	}

	@Override
	public String toString() {
		return String.format("Nombre:%s, Continente:%s, Color de Pelo:%s, Peso: %.2f%n", nombre, continenteProcedencia.getNombre(), colorPelo.getNombre(), peso);
	}

	public double getPeso() {
		return peso;
	}
	
	
	public Continente getContinenteProcedencia() {
		return continenteProcedencia;
	}
	
		
	public ColorPelo getColorPelo() {
		return colorPelo;
	}
	
/*
	@Override
	public int hashCode() {
		return Objects.hash(colorPelo, continenteProcedencia, nombre, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return colorPelo == other.colorPelo && continenteProcedencia == other.continenteProcedencia
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}
*/
	
		
	
	
	
}
