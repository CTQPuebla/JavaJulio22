package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class PracticaArchivos {
	public static void main(String[] args) {
		String linea = "";
		String dia = "";
		String mes = "";
		String an = "";

		try {
			// Lectura
			File archivoEntrada = new File("C:\\Users\\herre\\OneDrive\\Escritorio\\entrada.txt");
			FileReader fr = new FileReader(archivoEntrada);
			BufferedReader buffer = new BufferedReader(fr);

			// Mientras la linea actual sea distinta de null
			while ((linea = buffer.readLine()) != null) {
				if (linea.length() < 9) {
					int d = Integer.parseInt(linea.substring(0, 2));
					int m = Integer.parseInt(linea.substring(2, 4));

					an = linea.substring(4, 8);

					// Dia

					if (d <= 30 && d >= 1) {

						switch (d) {
						case 1:
							dia = "Uno";
							break;
						case 2:
							dia = "Dos";
							break;
						case 3:
							dia = "Tres";
							break;
						case 4:
							dia = "Cuatro";
							break;
						case 5:
							dia = "Cinco";
							break;
						case 6:
							dia = "Seis";
							break;
						case 7:
							dia = "Siete";
							break;
						case 8:
							dia = "Ocho";
							break;
						case 9:
							dia = "Nueve";
							break;
						case 10:
							dia = "Diez";
							break;
						case 11:
							dia = "Once";
							break;
						case 12:
							dia = "Doce";
							break;
						case 13:
							dia = "Trece";
							break;
						case 14:
							dia = "Catorce";
							break;
						case 15:
							dia = "Quince";
							break;
						case 16:
							dia = "Dieciseis";
							break;
						case 17:
							dia = "Diecisiete";
							break;
						case 18:
							dia = "Diciocho";
							break;
						case 19:
							dia = "Diecinueve";
							break;
						case 20:
							dia = "Veinte";
							break;
						case 21:
							dia = "Veintiuno";
							break;
						case 22:
							dia = "Veintidos";
							break;
						case 23:
							dia = "Veintetres";
							break;
						case 24:
							dia = "Veinticuatro";
							break;
						case 25:
							dia = "Veinticinco";
							break;
						case 26:
							dia = "Veintiseis";
							break;
						case 27:
							dia = "Veintisiete";
							break;
						case 28:
							dia = "Veintiocho";
							break;
						case 29:
							dia = "Veintinueve";
							break;
						case 30:
							dia = "Treinta";
							break;
						default:
							mes = "No es un dia";
							break;
						}
					} 

					// Mes
					if (m >= 0 && m <= 12) {
						switch (m) {
						case 1:
							mes = "Enero";
							break;
						case 2:
							mes = "Febrero";
							break;
						case 3:
							mes = "Marzo";
							break;
						case 4:
							mes = "Abril";
							break;
						case 5:
							mes = "Mayo";
							break;
						case 6:
							mes = "Junio";
							break;
						case 7:
							mes = "Julio";
							break;
						case 8:
							mes = "Agosto";
							break;
						case 9:
							mes = "Septiembre";
							break;
						case 10:
							mes = "Octubre";
							break;
						case 11:
							mes = "Noviembre";
							break;
						case 12:
							mes = "Difiembre";
							break;
						default:
							mes = "No es un mes";
							break;
						}
					}

					if (mes != null) {
						// Escritura
						File archivoSalida = new File("C:\\Users\\herre\\OneDrive\\Escritorio\\salida.txt");

						FileWriter line = new FileWriter(archivoSalida, true);
						line.write(dia + " de ");
						for (int i = 0; i < mes.length(); i++) {
							line.write(mes.charAt(i));

						}

						line.write(" " + an);
						line.write("\n");

						line.close();
					}

				}

//			    
			}

		} catch (Exception e) {
			System.out.println("No encontre el archivo");
		}
	}
}
