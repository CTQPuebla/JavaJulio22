import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class FechasATexto {

	public static void main(String[] args) {
//	leer un archivo con fechas en numeros y convertirlos
//		a letras y guardarlos en un archivo de texto
		
		
		Map<Integer, String> nombreDias = new HashMap<Integer, String>();
		nombreDias.put(1, "uno");
		nombreDias.put(2, "dos");
		nombreDias.put(3, "tres");
		nombreDias.put(4, "cuatro");
		nombreDias.put(5, "cinco");
		nombreDias.put(6, "seis");
		nombreDias.put(7, "siete");
		nombreDias.put(8, "ocho");
		nombreDias.put(9, "nueve");
		nombreDias.put(10, "diez");
		nombreDias.put(11, "once");
		nombreDias.put(12, "doce");
		nombreDias.put(13, "trece");
		nombreDias.put(14, "catorce");
		nombreDias.put(15, "quince");
		nombreDias.put(16, "dieciseis");
		nombreDias.put(17, "diesiciete");
		nombreDias.put(18, "diesciocho");
		nombreDias.put(19, "diesinueve");
		nombreDias.put(20, "veinte");
		nombreDias.put(21, "veintiuno");
		nombreDias.put(22, "veintidos");
		nombreDias.put(23, "veintitres");
		nombreDias.put(24, "veinticuatro");
		nombreDias.put(25, "veinticinco");
		nombreDias.put(26, "veintiseis");
		nombreDias.put(27, "veintisiete");
		nombreDias.put(28, "veintiocho");
		nombreDias.put(29, "veintinueve");
		nombreDias.put(30, "treinta");
		nombreDias.put(31, "treintaiuno");
		
		Map<Integer, String> nombreMes = new HashMap<Integer, String>();
		nombreMes.put(1, "enero");
		nombreMes.put(2, "febrero");
		nombreMes.put(3, "marzo");
		nombreMes.put(4, "abril");
		nombreMes.put(5, "mayo");
		nombreMes.put(6, "junio");
		nombreMes.put(7, "julio");
		nombreMes.put(8, "agosto");
		nombreMes.put(9, "septiembre");
		nombreMes.put(10, "octubre");
		nombreMes.put(11, "noviembre");
		nombreMes.put(12, "diciembre");
		  try {  
		   //Lectura 
		   File archivo = new File("C:\\Users\\Michel\\Desktop\\prueba.txt"); 
		   FileReader fr = new FileReader(archivo); 
		   BufferedReader buffer = new BufferedReader(fr); 
		   
		   File archivo2 = new File("C:\\Users\\Michel\\Desktop\\resultado.txt");

		   FileWriter line2 = new FileWriter(archivo2, false);
		   
		   int i = 0; 
		   int dia,mes,anio;
		   String linea = ""; //Comodin
		   String fecha ="";
		   //Mientras la linea actual sea distinta de null 
		   while ((linea = buffer.readLine()) != null) { 
		      dia = Integer.parseInt(linea.substring(0, 2)) ;
		      mes = Integer.parseInt(linea.substring(2, 4)) ;
		      anio = Integer.parseInt(linea.substring(4, 8)) ;
		     
		      fecha = nombreDias.get(dia) + " de " + nombreMes.get(mes) + " del " + anio +"\n";
		      line2.write(fecha);
		      
		   } 
		   line2.close();
		  }catch(Exception ex) { 
			  ex.printStackTrace();
		   System.out.println("No encontre el archivo"); 
		  } 

	}

}
