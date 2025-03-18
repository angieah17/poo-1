package examen.modelado;

import java.util.Iterator;

public class TelefonoMovil {
	
	 //1. Propiedades
	 
	 private boolean encendido; //Me faltó retocar en todos los métodos donde se tocara bateria para que lo apagara automáticamente
	 private double bateria;
	 private String modelo;
	 private String marca;
	 private boolean modoBajoConsumo;  //FALTA Ir a todos los métodos que tocan el consumo para que se cambie el estado de bajo consumo
	 	
	 
	 //2. Constructores
	 
	 public TelefonoMovil (String modelo, String marca) {
		 this.bateria = 0.2;
		 this.modelo = modelo; //FALTA RESTRINGIR SI ES NECESARIO
		 this.marca = marca; //FALTA RESTRINGIR SI ES NECESARIO
		 //Parto de telefonos apgados y modobajoconsumo apagado.
		 
		 if(bateria < 0.1) {
			 modoBajoConsumo = true;
		 } 
		 
		 if (bateria < 0.02) {
			 encendido = false;
		 }
		
		 
	 }
	 
	 //3. Métodos
	 
	
	 public void encenderApagar () {
		 if (encendido) {
			 encendido = false;
		 } else {
			 encendido = true;
		 }
	 }
	 
	 public void mostrarEncendido () {
		 
		 if(encendido) {
			 System.out.println("El teléfono móvil está encendido");
		 } else {
			 System.out.println("El teléfono móvil está apagado");
		 }
		 
	 }
	 
	 public void llamar () {
		 
		 double bateriaMinimaParaLlamadas = 0.02;
		 
		 if(encendido) {
			 if(bateria > bateriaMinimaParaLlamadas ) {
			 bateria = (bateria - (bateria * 0.02));
			 } else {
				 encendido = false;
			 System.out.println("Es necesario cargar el teléfono móvil para realizar llamadas.");
			 }
			 
		 } else {
			 System.out.println("Es necesario encender el télefono móvil para realizar esta acción.");
		 }
		 
		 
		 
	 }
	 
	 public void navegaEnInternet () {
			
			double bateriaMinimaParaNavegacion = 0.02;
			
			if(encendido) {
				if(bateria > bateriaMinimaParaNavegacion ) {
				 bateria = (bateria - (bateria * 0.01));
			 } else {
				 encendido = false;
				 System.out.println("Es necesario cargar el teléfono móvil para navegar en internet.");
			 }
			} else {
				 System.out.println("Es necesario encender el télefono móvil para realizar esta acción.");
			 }
		
			
		}
		 
	 public boolean modoBajoConsumo () {
	
		 
			if(encendido) {
				System.out.println("Se ha activado el modo bajo consumo.");
				modoBajoConsumo = true;
				return true;		
			} 
			
			System.out.println("Es necesario encender el télefono móvil para realizar esta acción.");
			return false;
			
	 }
	 
	 public void mostrarBajoConsumo () {
		 
		 if(modoBajoConsumo) {
			 System.out.println("El modo bajo consumo está activo.");
		 } else {
			 System.out.println("El modo bajo consumo está desactivado.");
		 }
		 
		
		 
	 }
	 
	 public void recargaBateria () {
		 
		 double nivelMaximoBateria = 1.0;
		 
		 bateria = bateria + (bateria * 0.25) < nivelMaximoBateria ? bateria + (bateria * 0.25) : 1.0;
				 
	 }
	 
	 
	 @Override
	public String toString() {
		
		return String.format("Teléfono móvil con las siguientes características:%n-Marca:%s.%n-Modelo:%s.%n-Bateria:%.2f%%.%n-Encendido:%b.%n-Modo Bajo Consumo:%b.%n", marca, modelo, bateria, encendido, modoBajoConsumo);
	}
	
	 //4. Main
	 
	 public static void main(String[] args) {
		
		 TelefonoMovil t1 = new TelefonoMovil("02", "Motorola");
		 TelefonoMovil t2 = new TelefonoMovil("03", "Samsung");
		 TelefonoMovil t3 = new TelefonoMovil("03", "Samsung");
		 TelefonoMovil t4 = new TelefonoMovil("05", "Apple");
		 
		 System.out.println("PROBANDO CREAR NUEVO TELÉFONO");
		 System.out.println(t1);
		
		 
		 System.out.println("PROBANDO ENCENDER/APAGAR");
		 t1.encenderApagar();
		 System.out.println(t1);
		 t1.encenderApagar();
		 System.out.println(t1);
		
		 System.out.println("PROBANDO MOSTRAR ENCENDIDO");
		 t1.mostrarEncendido();
		 
		 System.out.println();
		 System.out.println("PROBANDO LLAMAR");
		 t1.llamar();
		 t1.encenderApagar();
		 t1.llamar();
		 
		 System.out.println(t1);
		 t2.encenderApagar();
		 t2.llamar();
		 
		 System.out.println();
		 System.out.println("PROBANDO NAVEGAR POR INTERNET");
		 t3.navegaEnInternet();
		 t3.mostrarEncendido();
		 t3.encenderApagar();
		 t3.navegaEnInternet();
		 System.out.println(t3);
		 
		 System.out.println();
		 System.out.println("PROBANDO MODO BAJO CONSUMO"); 
		 t2.modoBajoConsumo();
		 t3.modoBajoConsumo();
		 t4.modoBajoConsumo();
		 
		 System.out.println();
		 System.out.println("PROBANDO RECARGA BATERIA"); 
		 System.out.println(t4);
		 t4.recargaBateria();
		 System.out.println(t4);
		 t3.recargaBateria();
		 System.out.println(t3);
		 
		
		 
	}
	
}
