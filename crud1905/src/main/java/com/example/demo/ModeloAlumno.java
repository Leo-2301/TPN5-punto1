package com.example.demo;

public class ModeloAlumno {
//****** ATRIBUTOS **********
	private int lu;
	
	private String nombre;
	
	private String apellido;
	
	private int edad;
//****** METODOS **********
	public ModeloAlumno(int lu, String nombre, String apellido, int edad) {
		super();
		this.lu = lu;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public int getLu() {
		return lu;
	}

	public void setLu(int lu) {
		this.lu = lu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
}
