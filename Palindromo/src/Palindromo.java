
public class Palindromo {

	public static void main(String [] args) {
		
	String mensaje = "oxxo";
	String reversa = "";
	//recorrido al raves
	
//	for (int i = mensaje.length()-1; i >= 0; i--) {
//		
//		System.out.println("Caracter: " + mensaje.charAt(i));
//		
//		
//	}
	//comparar ambas
		//String mensaje = "15 de Julio de 2022";
		//String reversa = "";
		//recorrido al raves
		
		for (int i = mensaje.length()-1; i >= 0; i--) {
			
			System.out.println("Caracter: " + mensaje.charAt(i));
			reversa = reversa + mensaje.charAt(i);
			System.out.println(reversa);
			
		}
		
		if (mensaje.equals(reversa)) {
			System.out.println("Si es un palindromo");
		}else {
			System.out.println("No");
		}
		
	}
}
