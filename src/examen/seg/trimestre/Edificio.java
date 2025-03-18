package examen.seg.trimestre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Edificio {
	
	//1. Propiedades
	private int aforo;
	private double pesoMaximo;
	private List<Persona> listaDePersonas;
	private Set<Persona> historicoPersonas;
	private Map<Continente, Integer> mapVisitantesPorContinente;
	private Map<ColorPelo, Integer> mapVisitantesPorColorPelo;
	private Map<Continente, Double> mapPesoTotalPorContinente;
	private double pesoActual;
	
	
	//2. Constructores 
	
	public Edificio(int aforo, double pesoMaximo) {
		this.aforo = aforo;
		this.pesoMaximo = pesoMaximo;
		listaDePersonas = new ArrayList<>();
		historicoPersonas = new HashSet<>();
		pesoActual = 0;
		mapVisitantesPorContinente = new HashMap<>();
		mapVisitantesPorColorPelo = new HashMap<>();
		mapPesoTotalPorContinente = new HashMap<>();
	}
	
	//3. Métodos Privados
	
	private boolean personaDentro(Persona persona) {
		
		for (Persona p : listaDePersonas) {
			if(p == persona) {
				return true;
			}
		}
		
		return false;
		
	}
	
	private void sumarMap(Persona persona) {
		
		int conteoNumeroVisitantesPorContinente = mapVisitantesPorContinente.getOrDefault(persona.getContinenteProcedencia(), 0);
		mapVisitantesPorContinente.put(persona.getContinenteProcedencia(), conteoNumeroVisitantesPorContinente + 1);
		
		int conteoNumeroVisitantesPorColorPelo = mapVisitantesPorColorPelo.getOrDefault(persona.getColorPelo(), 0);
		mapVisitantesPorColorPelo.put(persona.getColorPelo(), conteoNumeroVisitantesPorColorPelo + 1);
		
		double conteoPesoPorContinente = mapPesoTotalPorContinente.getOrDefault(persona.getContinenteProcedencia(), 0.0);
		mapPesoTotalPorContinente.put(persona.getContinenteProcedencia(), conteoPesoPorContinente + persona.getPeso());
		
		
	}
	
	private void restarMap(Persona persona){
		
		int conteoNumeroVisitantesPorContinente = mapVisitantesPorContinente.get(persona.getContinenteProcedencia());
		mapVisitantesPorContinente.put(persona.getContinenteProcedencia(), conteoNumeroVisitantesPorContinente - 1);
		
		if(conteoNumeroVisitantesPorContinente <= 0){
			mapVisitantesPorContinente.remove(persona.getContinenteProcedencia());
		}
		
		int conteoNumeroVisitantesPorColorPelo = mapVisitantesPorColorPelo.get(persona.getColorPelo());
		mapVisitantesPorColorPelo.put(persona.getColorPelo(), conteoNumeroVisitantesPorColorPelo - 1);
		
		if(conteoNumeroVisitantesPorColorPelo <= 0){
			mapVisitantesPorColorPelo.remove(persona.getColorPelo());
		}
		
		double conteoNumeroPesoPorContinente = mapPesoTotalPorContinente.get(persona.getContinenteProcedencia());
		mapPesoTotalPorContinente.put(persona.getContinenteProcedencia(), conteoNumeroPesoPorContinente - persona.getPeso());
		
		if(conteoNumeroPesoPorContinente <= 0){
			mapPesoTotalPorContinente.remove(persona.getContinenteProcedencia());
		}
		
		
	}
	
	//4. Métodos
	
	//Prefiero utilizar Persona persona que Persona p como estaba en el enunciado para mayor claridad
	public boolean entrar(Persona persona) {
		
		boolean pesoDisponible = pesoActual + persona.getPeso() < pesoMaximo;
		boolean espacioDisponible = listaDePersonas.size() < aforo;
		
		//System.out.println("PESO ACTUAL" + pesoActual);
		//System.out.println("PESO DISPONIBLE" + pesoDisponible);
		
		if(!personaDentro(persona) && pesoDisponible && espacioDisponible) {
			
			listaDePersonas.add(persona);
			historicoPersonas.add(persona);
			sumarMap(persona);
			pesoActual = pesoActual + persona.getPeso();
			//System.out.println("entre");
			//System.out.println("PESO ACTUAL FINAL" + pesoActual);
			return true;
			
		}
		//System.out.println("no entre");
		return false;
		
	}
	
	public boolean salir(Persona persona) {
		
		if(personaDentro(persona)) {
			//System.out.println("PESO ACTUAL" + pesoActual);
			for (Persona p: listaDePersonas) {
				if(p == persona) {
					listaDePersonas.remove(p);
					restarMap(persona);
					pesoActual = pesoActual - persona.getPeso();
					//System.out.println("HE SALIDO" + "PESO FINAL" + pesoActual);
					return true;
				}
			}
			
		}
		//System.out.println("NO HE SALIDO");
		return false;
	}
	
	
		
	//NO PUDE SACARLO CON EL STRING, ASÍ QUE HICE UN MÉTODO VOID PARA MOSTRAR LA INFORMACIÓN
	public void obtenerInforme() {
			
		
		System.out.printf("%n%s%n", "ESTADO ACTUAL EDIFICIO");
		System.out.println("-".repeat("ESTADO ACTUAL EDIFICIO".length()));
		
		
		System.out.printf("INFORMACIÓN GENERAL%n-Aforo Máximo: %d		-Aforo Actual: %d%n-Peso Máximo: %.2f		-PesoActual: %.2f%n-Número Total Visitantes Históricos: %s%n", 
				aforo, listaDePersonas.size(), pesoMaximo, pesoActual, historicoPersonas.size());
		System.out.println();
		System.out.println("DATOS DE LOS VISITANTES ACTUALES");
		
		for (Persona persona : listaDePersonas) {
			System.out.printf("%s", persona);
		}
		System.out.println();
		
		System.out.printf("DISTRIBUCIÓN POR CONTINENTE%n-Visitantes Por Continente: %s%n-Peso Total por Continente: %s%n", mapVisitantesPorContinente, mapPesoTotalPorContinente);

		System.out.println();
		System.out.printf("DISTRIBUCIÓN POR COLOR DE PELO%n-Número de Personas Por Color Pelo %s%n", mapVisitantesPorColorPelo );
		System.out.println();
		System.out.printf("LISTADO HISTÓRICO OCUPANTES%nTotal Cantidad Histórico: %d%n", historicoPersonas.size() );
		
		System.out.println();
		System.out.println("DATOS DE LOS VISITANTES HISTÓRICOS");
		
		for (Persona persona : historicoPersonas) {
			System.out.printf("%s", persona);	
		}
		
		
	}

	
	
	
	
		
	
}
