package com;

import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		String cad, cad2="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una cadena: ");
		cad = sc.next();
		cad = cad.toLowerCase().replace(" ", "");
		for (int i = cad.length() - 1; i >= 0; i--) {
			cad2 +=cad.charAt(i);

		}
		if(cad.equals(cad2)) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("no es");
		}

	}
}
