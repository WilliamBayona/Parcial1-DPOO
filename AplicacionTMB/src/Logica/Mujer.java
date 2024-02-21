package Logica;

public class Mujer extends Persona{

	public Mujer(String nombre, Double peso, Integer altura, Integer edad) {
		super(nombre, peso, altura, edad);
	}

	@Override
	public Double calcularTMB() {
		return 447.597 + (9.247*this.peso) + (3.098*this.altura) - (4.33*this.edad);
	}
	
	
	

}