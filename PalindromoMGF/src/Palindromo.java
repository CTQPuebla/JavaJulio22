
public class Palindromo {

	public static void main(String[] args) {
//		Realiza un programa para determinar si un String es palíndromo.
		
		String pali = "ollo";
		String cadenaInvertida = "";
		pali = pali.toLowerCase().replace(" ", "");
		System.out.println(pali);
		for (int i = pali.length()-1; i >= 0; i--) {
			
			cadenaInvertida += pali.charAt(i);
		}
		
		System.out.println(cadenaInvertida);
		if(pali.equals(cadenaInvertida)) {
			System.out.println("es palindromo");
		}else {
			System.out.println("no lo es");
		}

	}

}
