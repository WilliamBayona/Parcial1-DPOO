package Logica;

public abstract class Persona {
	
	//Atributos
	protected String nombre;
	protected Double peso;
	protected Integer altura;
	protected Integer edad;
	
	
	//Metodo Constructor
	public Persona(String nombre, Double peso, Integer altura, Integer edad) {
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
	//Metodos
	public abstract Double calcularTMB();



}
