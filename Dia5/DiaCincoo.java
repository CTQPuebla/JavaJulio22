package Dia5;
import java.util.Scanner;
public class DiaCincoo {
	public static void main(String[]args) {
		String mensaje="oxo";
		  String reversa="";
		  
		for (int i = mensaje.length()-1; i >=0; i--) {
			System.out.println("Caracter; "+mensaje.charAt(i));
			reversa = reversa + mensaje.charAt(i);
			System.out.println(reversa);
		}
		if(mensaje.equals(reversa)) {
			System.out.println("sie es palindro");
		}else {
			System.out.println("Nel");
		}
		 }
		}