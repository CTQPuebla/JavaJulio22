package dia5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class LeerEscrituraArchivo {
	public static void main(String[] args) {
	
		//--------- Lectura & escritura de archivos-------
		
		
//-----------------------------Escritura-------------	
		try {
			 //Escritura
			 String abc = "15 de Julio de 2022";
			 File archivo = new File("C:\\Users\\Viry\\Documents\\CAPACITACION\\LeerArchivoJava\\escrituraArchivo.txt");
			
			 FileWriter line = new FileWriter(archivo, false);
			
			 for (int i = 0; i <abc.length(); i++) {
		     
		    line.write(abc.charAt(i)); 
			 }
			
			 line.close();
//------------------------------- Lectura---------------
			/*
			String linea = ""; // Comodin
			File archivo = new File("C:\\Users\\Viry\\Documents\\CAPACITACION\\LeerArchivoJava\\fechaNumero.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(fr);
			int i = 0;

			// Mientras la linea actual sea distinta de null
			while ((linea = buffer.readLine()) != null) {

				System.out.println("Linea: " + linea + ":" + i);
				
				i++;
			}
			*/
//------------------------------------------------------
			
		} catch (Exception ex) {
			System.out.println("No encontre el archivo");
		}

	}

}
