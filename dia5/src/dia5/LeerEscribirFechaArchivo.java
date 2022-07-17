package dia5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class LeerEscribirFechaArchivo {
	public static void main(String[] args) {
		String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		String[] dia = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once",
				"doce", "tresce", "catorce", "cince", "dieciseis", "diecisiete","dieciocho", "diecinueve", "veinte", "veintiuno",
				"veintidos", "veintitres", "veinticuatro", "veinticinco", "veintiseis", "veintisiete", "veintiocho",
				"veintinueve", "treinte", "treinta y uno" };
		String textoEscribir = "";
		String linea = "";
		
		

		try {
			String url = "C:\\Users\\Viry\\Documents\\CAPACITACION\\LeerArchivoJava\\";
			// Leer archivo
			File archivo = new File(url + "fechaNumero.txt");
			FileReader file = new FileReader(archivo);
			BufferedReader bufer = new BufferedReader(file);

			// Escribir archivo
			File archivo2 = new File(url + "escrituraArchivo.txt");
			FileWriter lineaE = new FileWriter(archivo2, false);

			int i = 0;
			// Mientras linea se diferente de cero leer archivo
			while ((linea = bufer.readLine()) != null) { // linea almacenar cada linea del archivo
				System.out.println("Iteracion: " + i + " Fecha: " + linea + " "+linea.substring(0,2 ));
				int diaN = Integer.parseInt(linea.substring(0,2));
				int mesN = Integer.parseInt(linea.substring(2,4));
				int d,m;
				//recorrer arreglo dia
				for(  d=0; d<diaN;d++) {
				}System.out.println(dia[d-1]);
				
				//Recorrer arreglo mes
				for(m=0;m<mesN;m++) {
				}System.out.println(mes[m-1]);
				
				System.out.println(dia[d-1]+" de "+mes[m-1]+" de "+linea.substring(4,8));
				//Escribir en el archivo
				textoEscribir = (dia[d-1]+" de "+mes[m-1]+" del "+linea.substring(4,8)+"\n");
				for (int j = 0; j < textoEscribir.length(); j++) {
					lineaE.write(textoEscribir.charAt(j));
				}

				i++;
			}

			lineaE.close();

		} catch (Exception ex) {
			System.out.println("No se encontro el archivo");
		}
	}

}
