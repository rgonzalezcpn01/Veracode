package com.cpndemo.maven.veracode;

import java.applet.Applet;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

//import cl.stomas.factura.negocio.testing.TestingModel.Echo;

public class TestingVulnerabilities {
	
	
	
	public static String decryptMessage(final byte[] message, byte[] secretKey)
	{
		try {
			// C�DIGO VULNERABLE
			
			final SecretKeySpec KeySpec = new SecretKeySpec(secretKey, "DES");
			final Cipher 		cipher = Cipher.getInstance("DES/ECB/PKCS5Padding"); 
			cipher.init(Cipher.DECRYPT_MODE, KeySpec);
			
			// RECOMENDACI�N VERACODE
			
			// final Cipher cipher = Cipher.getInstance("DES...");
			// cipher.init(Cipher.DECRYPT_MODE, KeySpec);
			
			return new String(cipher.doFinal(message));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	
	
	
	
		
	
	// Inclusi�n de funcionalidades de esfera de control que no es de confianza
	
			// Un atacante puede insertar funcionalidades maliciosas dentro de este programa.
			// Las Applet comprometen la seguridad. ya que sus funcionalidades se pueden adaptar a la Web
			// Ademas la entrega de acceso de credenciales es engorrosa para el cliente.
	
	public final class WidgetData extends Applet {
		
		private static final long serialVersionUID = 1L;
		
		public float price;
		
			public WidgetData()
			{
				this.price = LookupPrice("MyWidgetType");
			}
			
			private float LookupPrice(String string) {
			
				return 0;
			}

		}

	
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
	
	
	class EchoSecond {
		
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
}
	
