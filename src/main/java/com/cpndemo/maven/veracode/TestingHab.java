package com.cpndemo.maven.veracode;

import java.util.*;

public class TestingHab {
	
	private int id;
	private String nombre;
	private String apellido;
	private int edad;

	/**
	 * Constructor vac�o
	 */
	public TestingHab()
	{
	   id = 1;
	   nombre = "Edward";
	   apellido = "Dammus";
	   edad = 22;
	}
	
	/**
	 * Constructor con parametros
	 */
	public TestingHab(int id, String nombre, String apellido, int edad)
	{
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		setEdad(edad);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	/**
	 * M�todo que acepte que la edad debe ser mayor a 15
	 */
	public void edadMayor(int edad)
	{
		if(edad > 15)
		{
			System.out.println("Admitido");
		}
		else
		{
			System.out.println("Edad debe ser mayor a 15");
		}
	}
	
	 /**
	  * M�todo que me valide  el segundo nombre
	  */
	public void validarNombre(String nombre)
	{
		StringTokenizer token = new StringTokenizer(nombre);
		if(token.countTokens() == 2)
		{
			System.out.println("Ingresaste 2 nombres");
		}else
		{
			System.out.println("Error");
		}
	}
	
	/**
	 * M�todo que me pregunte por la edad y por el nombre
	 */
	public void NombreEdad(String nombre, int edad)
	{
		System.out.println("Cual es tu nombre y tu edad");
		if(nombre.equals(nombre))
		{
			System.out.println("Su nombre es: " +getNombre());
		}else if(edad == 13)
		{
			this.edad = 100; // cambia la edad a 100
			System.out.println("Su edad es:" +getEdad());
		}
	}
	
	/**
	 * Instanciar una persona
	 */
	public void Persona(Object o)
	{
		if(o.getClass() == TestingHab.class)
		{
			System.out.println(o);
		}
		
	}
}
