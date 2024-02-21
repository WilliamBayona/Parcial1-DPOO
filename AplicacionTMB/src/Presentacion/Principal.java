package Presentacion;

import Logica.Hombre;
import Logica.Mujer;
import Logica.Persona;



public class Principal {
	public static void main(String[] args) {
		
		Persona w;
		w = new Hombre("William", 53.5, 166, 21);
		
		double valorhombre = w.calcularTMB();
		
		System.out.println("El TMB de William es:");
		System.out.println(valorhombre);
		
		System.out.println("");
		
		
		w = new Mujer("Sara", 53.5, 166, 21);
		
		double valormujer = w.calcularTMB();
		
		System.out.println("El TMB de Sara es:");
		System.out.println(valormujer);
		
		
		
		
		
	}
	

}
