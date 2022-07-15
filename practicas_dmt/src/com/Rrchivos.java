package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Rrchivos {
	public static void main(String[] args) {
		File doc = new File("C:\\Users\\danie\\Documents\\file.txt");
//
//		try {
//			Scanner sc = new Scanner(doc);
//			 while (sc.hasNextLine()) { //hasNextLine sirve para comprobar si exixte una linea siguiente
//		            System.out.println(sc.nextLine());
//		        }
//			
//		} catch (Exception e) {
//			System.out.println("Error");
//
//		}

		// Usando la clase InputStream y scanner
//		try {
//			InputStream ins = new FileInputStream("C:\\Users\\danie\\Documents\\file.txt");
//			Scanner obj = new Scanner(ins);
//			while (obj.hasNextLine())
//				System.out.println(obj.nextLine());
//		} catch (Exception e) {
//         System.out.println("Archivo no encontrado");
//		}

		// Clase

//		try {
//
//			BufferedReader obj = new BufferedReader(new FileReader(doc));
//
//			String strng;
//			while ((strng = obj.readLine()) != null) {
//				System.out.println(strng);
//			}
//			
//			//Escribir en el archivo
//			FileWriter escribir = new FileWriter(doc, true);
//			escribir.write("Daniel Moreno");
//			escribir.write("\r\n");
//			escribir.close();
//			
//
//			
//		} catch (IOException e) {
//		}
		String linea;
		try 
		{
			String abc="15 de julio de 2022";
			FileWriter escribir = new FileWriter(doc, true);
			Scanner sc = new Scanner(doc);
			for (int i = 0; i < abc.length(); i++) {
				escribir.write(abc);
			}
			escribir.close();
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}catch(IOException e) {
			
		}

	}
}
