package com;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		Scanner palabra = new Scanner(System.in);
		System.out.println("Introduce tu palabra");
		String cadena = palabra.nextLine();
		
		//codigo para invertir cadena
//		StringBuilder builder = new StringBuilder(cadena);
//		String palindromoAlReves = builder.reverse().toString();
//		System.out.println(palindromoAlReves);
	
		cadena = cadena.toLowerCase().replace(" ", "").replace(",","");       
		int cont = 0, largo = cadena.length()-1;
		boolean isError = false;

		while ((cont<largo) && (!isError)){
		    if (cadena.charAt(cont) == cadena.charAt(largo)){             
		        cont++;
		        largo--;
		    } else {
		        isError = true;
		    }
		}
		if (!isError){
		    System.out.println(cadena + " : es palindromo");
		}else{
		    System.out.println(cadena + " : no es palindromo");
		}  
	
	}
}
