package Logica;

public class Hombre extends Persona{

	public Hombre(String nombre, Double peso, Integer altura, Integer edad) {
		super(nombre, peso, altura, edad);
	}

	@Override
	public Double calcularTMB() {
		return (88.362 + (13.397*this.peso) + (4.799*this.altura) - (5.677*this.edad));
	}
	
	
	

}
