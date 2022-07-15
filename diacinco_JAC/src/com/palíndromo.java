package com;

import java.util.Scanner;

public class palíndromo {
	public static void main (String [] args) {
		String palinver = "";
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese una palabra");
		String palabra = sc.nextLine();
		String pal = palabra.toLowerCase();
		
		
		for (int i = pal.length() - 1; i >= 0; i--) {
			palinver = palinver + pal.charAt(i);
		}
			if ( palinver.equals(pal)) {
				System.out.println("Es palíndromo");
			}
				else {
					System.out.println("No es palíndromo");
				}
				
			
			
			
		
		
		


	
		
	}
}
