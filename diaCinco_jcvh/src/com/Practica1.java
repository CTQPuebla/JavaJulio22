package com;

import java.util.Scanner;

public class Practica1 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String comparar = "";
		
		System.out.println("Introduce algo");
		String lectura = lector.nextLine();
		
		lectura = lectura.toLowerCase().replace(" ", "");		
		
		for (int x = lectura.length() - 1; x >= 0; x--) {
            comparar = comparar + lectura.charAt(x);
        	
    }
		if(lectura.equals(comparar)) {
			System.out.println("Es una palabra palindromo");
		}else {
			System.out.println("No es una palabra palindromo");
		}
		
		
		
	}
	
}
