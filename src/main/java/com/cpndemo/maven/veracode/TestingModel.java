package com.cpndemo.maven.veracode;

public class TestingModel {

	class Echo {
		
			// Control de Proceso
		
			// Posible reemplazo de librer�a por una maliciosa
			// Donde adem�s s enos muestra el nombre expl�cito de esta.
		
			public native void runEcho();
			{
				System.loadLibrary("echo"); // Se carga librer�a

			}
			public void main(String[] args)
			{
				new Echo().runEcho();	
			}
			
		}
	
	
	public final class compareStrings{
		
		public String hola;
		public String adios;
		
		public void comparar()
		{
			if (hola == adios)
			{
				System.out.println("hola == adios");
			}
		}		
	
	}
		
	
}
