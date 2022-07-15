package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Archivofechas {
	public static void main(String[] args) {
		File doc = new File("C:\\Users\\danie\\Documents\\file.txt");
		File doc2 = new File("C:\\Users\\danie\\Documents\\file2.txt");
		String fecha_letra, fecha_numero = "", resul = "", aux1, año;
		String[] dias = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siente", "ocho", "nueve", "diez", "once",
				"doce", "trece", "catorce", "quince", "diesiseis", "diesisiete", "diesiocho", "diesinueve", "veinte",
				"veintiuno", "veintidos", "vientitres", "veinticuatro", "vienticinco", "veintiseis", "veintisiete",
				"veintiocho", "veintinueve", "treinta" };
		String[] mes = { "Enero", "Febrero", "Marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };
		int num, mess;

//		System.out.println(fecha_letra);

		try {
			FileWriter escribir = new FileWriter(doc2, true);
			Scanner sc = new Scanner(doc);

			while (sc.hasNextLine()) {

				fecha_letra = sc.nextLine(); //12032021
				num = Integer.parseInt(fecha_letra.substring(0, 2)) - 1;
				mess = Integer.parseInt(fecha_letra.substring(2, 4)) - 1;
				año = fecha_letra.substring(6, 8);
				if (num > 0 && num <= 30 && mess > 0 && mess <= 12) {
					aux1 = dias[num] + " de " + mes[mess] + " del " + año + "\n";
					escribir.write(aux1);

				} else {

				}

			}
			escribir.close();

		} catch (IOException e) {
			System.out.println("Error");
		}

	}
}
