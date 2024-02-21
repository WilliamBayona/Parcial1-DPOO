package Presentacion;

import Logica.Hombre;
import Logica.Mujer;
import Logica.Persona;



public class Principal {
	public static void main(String[] args) {
		
		Persona w;
		w = new Hombre("William", 53.5, 167, 21);
		
		double valorhombre = w.calcularTMB();
		
		System.out.println("El TMB de William (Hombre) es:");
		System.out.println(valorhombre);
		
		System.out.println("");
		
		
		w = new Mujer("Sara", 53.5, 166, 21);
		
		double valormujer = w.calcularTMB();
		
		System.out.println("El TMB de Sara (Mujer) es:");
		System.out.println(valormujer);
		
		System.out.println("");

		w = new Hombre("Martin", 60.2, 171, 21);
		
		double valorhombre2 = w.calcularTMB();
		
		System.out.println("El TMB de Martin (Hombre) es:");
		System.out.println(valorhombre2);
		System.out.println("");
		
		//Jugando con casos atipicos
		
		w = new Hombre("Persona con datos en cero", 0.0, 0, 0);
		
		double valorhombre3 = w.calcularTMB();
		
		System.out.println("El TMB de un hombre sin datos es:");
		System.out.println(valorhombre3);
		
		
		
	}
	

}
