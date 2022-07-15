package com;

public class Principal {

	public static void main(String[] args) {
		
		
		String st="arenera";
		String invertir="";
		
		
		for (int x = st.length()-1;x >=0 ;x-- ) {
			invertir=invertir+st.charAt(x);
			
		}if(invertir.equals(st)) {
			System.out.println("es un palindromo");
		}else {
			System.out.println("no es palindromo");
		}
		

	}

}
