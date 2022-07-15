package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FechaEscrita {
	
	public static String numToWord(String x){
		
		
		
		
		
		
		
		
		
		
		return x;
	}
	
	public static void main (String[]args) {
		
		


		String linea = ""; //Comodin 
		try { 
			
			String[] meses = {"enero","febrero", "marzo","abril","mayo", "junio", "julio",
					"agosto", "septiembre" ,"octubre" , "noviembre","diciembre"};
			String[] dias = {"Uno", "Dos" , " Tres" , "Cuatro" , "Cinco" , "Seis" , "Siete",
					"Ocho" , "Nueve", "Diez" , "Once", "Doce" , "Trece", "Catorce" , "Quince" ,
					"Diesiseis", "Diesisiete", "Diesiocho", "Diesinueve", "Veinte", "Veintiuno",
					"Veintidos", "Veintitres", "Veinticuatro", "Veinticinco", "Veintiseis",
					"Veintisiete", "Veintiocho", "Veintinueve", "Treinta", "Treinta y uno"};
			
			String y,z,k;
			String palabra;
	
		    File archivo = new File("D:\\Users\\Gonzalo\\Documents\\Git\\ArchivosJava\\FechaNumeros.txt"); 
		    FileReader fr = new FileReader(archivo); 
		    BufferedReader buffer = new BufferedReader(fr); 
		    File archivo2 = new File("D:\\Users\\Gonzalo\\Documents\\Git\\ArchivosJava\\FechaPalabras.txt"); 
			FileWriter line = new FileWriter(archivo2, false); 
			
		    int i = 0; 
		    System.out.println(meses[1]);
		    
		    //Mientras la linea actual sea distinta de null 
		    while ((linea = buffer.readLine()) != null) { 
		    	y = linea.substring(0 , 2);
				z = linea.substring(2 , 4);
				k = linea.substring(4 , 8);
			    //palabra = ;
			    line.write(dias[Integer.parseInt(z)-1]+ " de " + meses[Integer.parseInt(z)-1] +
			    		" de " + Integer.parseInt(k) + "\n");
			    System.out.println("-----------------");
	    } 
		    line.close();
	    }catch(Exception ex) { 
	   System.out.println("No encontre el archivo"); 
	  } 
	   
	 }

	}
		

