package com;

public class Ejerciciosciclos {
	public static void main(String[] args) {
		
		//Segunda forma
		
//		String mensaje = "OXXO";
//		String reversa ="";
//		//Recorrido al reves 
//		
//		for (int i =mensaje.length()-1; i>=0; i--) {
//			System.out.println("Caracter:"+mensaje.charAt(i));//con chartat te dice que tiene 
//			//dentro cada pedacito del string
//		reversa =reversa + mensaje.charAt(i);
//		System.out.println("reversa");
//		}
//		if (mensaje.equals(reversa)) {
//			System.out.println("Si es palindromo");
//			
//		}else {
//			System.out.println("No es palindromo");
//		}
//		
//		String texto = "OSO";
//		String comp1 , comp2;
//				
//		texto = texto.toLowerCase();
//		
//		for (int i = texto.length()-1; i >= 0; i--) {
//			
//		}
		
	//	Ejercicio 2 reloj
		
//		 int hora, minuto,segundo;
//		 hora = 0;
//		 minuto = 0;
//		 segundo = 0;
//		
//		 
//	for (hora = 0; hora<24; hora++) {
//		
//		for (minuto = 0; minuto < 60; minuto++) {
//			
//			for ( segundo = 0; segundo < 60; segundo++) {
//				
//				System.out.println("hora: " + hora + " minuto: "+ minuto + " segundo: "+ segundo);
//				 
//				
//			}
			
//		}
		
		
//	 }
		//segunda forma reloj
		
		for (int k = 0; k < 24; k++) {
			
		
		for (int j = 0; j < 60; j++) {
			
			for (int i = 0; i < 60; i++) {
				System.out.println(k+":"+j+":"+i);
				
				
			}
			
		}
	  } 
	}

}
