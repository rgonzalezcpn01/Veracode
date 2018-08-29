package com.cpndemo.maven.veracode;

import java.applet.Applet;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class TestingFinalTry {
	
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
		
		
		public final class TestApplet extends Applet {
			private static final long serialVersionUID = 1L;
			}
		
		public final class TestAppletDos extends Applet {
			private static final long serialVersionUID = 1L;
			}
		
		
		//Comparaci�n de referencias de objeto en lugar de contenido de objeto
		
		// El if dentro de este c�digo no se ejecutar�.
		// porque se prioriza el String a mostrar.
		
		public final class compareStrings{
		
			public String str1;
			public String str2;
			
			public void comparar()
			{
				if (str1 == str2)
				{
					System.out.println("str1 == str2");
				}
			}		
		
		}
	
	}
	
}
