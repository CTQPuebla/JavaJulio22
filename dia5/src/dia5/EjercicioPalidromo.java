package dia5;

public class EjercicioPalidromo {

	public static void main(String[] args) {
		String text = "AnitalavaLatina";
		System.out.println(text.toLowerCase());
		String textMin = text.toLowerCase();
		String reversa = "";
		// Recorrido al reves
		// iniciar de la posicion 14
		for (int i = textMin.length() - 1; i >= 0; i--) {
			// System.out.println(text.length());
			System.out.println("Caracter: " + textMin.charAt(i)); // .charAt mostrar la letra de acuerdo a la posicion i
			reversa = reversa + textMin.charAt(i);
			// System.out.println();
		}

		if (textMin.equals(reversa)) {
			System.out.println("Si es palidromo");
		} else {
			System.out.println("no");
		}

	}

}
