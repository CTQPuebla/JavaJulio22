package com;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ejercicios {
	public static String cerosIzq (int x) {
		if (x < 10) {
			return "0"+Integer.toString(x);
		}else {
			return Integer.toString(x);
		}
	}
	
	
	public static void main (String[]args) throws InterruptedException, IOException {
		/*relizar un programa para determinar si un String es un palindrommo*/
		String palabra = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digita la palabra: ");
		palabra = sc.nextLine();
		palabra = palabra.toLowerCase();
		palabra = palabra.replace(" ", "");
		
		StringBuilder new_String = new	StringBuilder(palabra);
		
		for (int i = 0 ; i < palabra.length(); i++ ) {
			new_String.setCharAt(palabra.length()- i-1 , palabra.charAt(i));
	
		}
		System.out.println(palabra);
		System.out.println(new_String);
		if (palabra.equals(new_String.toString())) {
			System.out.println("son palindromos");
		}else {
			System.out.println("no es palindromo");
		}
		
		
		int minutos = 0;
		int segundos = 0;
		int horas = 0;
		int x = 0;
		while(x == 0 || x == 1){
			
			minutos = 0;
			segundos = 0;
			horas = 0;
			
			for (int i = 0 ; i< 24 ; i++) {
				for (int j = 0 ; j< 60 ; j++) {
					for (int k = 0 ; k < 60 ; k++) {
						
						//TimeUnit.SECONDS.sleep(1);
						System.out.println(cerosIzq(horas)+":"+cerosIzq(minutos)+":"+cerosIzq(segundos));
						segundos++;
						
					}
					segundos = 0;
					minutos++;
				}
				minutos = 0;
				horas++;
			}
			
		x++;
		}
		
		
	}
}
