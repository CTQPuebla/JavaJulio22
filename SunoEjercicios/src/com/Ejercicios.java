package com;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Teor�a
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Ingresa un n�mero: ");
//		//int y = sc.nextInt(); nextInt lee datos int
//		
//		//String m = sc.nextLine(); nextLine lee caracteres
//		System.out.println(m+15);

//********************************************************************
		//EJERCICIO 1
		/*
		 * Realizar un programa que reciba dos n�meros  por teclado
		 * e indicar cu�l es mayor o si son iguales.
		 */
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Ingresa primer n�mero: ");
//		int x = sc.nextInt();
//		System.out.println("Ingresa segundo n�mero: ");
//		int y = sc.nextInt();
//		
//		if (x == y) {
//			System.out.println("Los dos numeros son iguales");
//		}
//		
//		else if ( x>y) {
//			System.out.println("El primer numero es mayor");
//		}
//		
//		else {
//			System.out.println("El segundo numero es mayor");
//		}
		
		
//*************************************************************************	
		//Ejercicio 2
		/*
		 * Realice un programa que pida un n�mero por teclado 
		 * y nos indique si es par o impar
//		 */
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Digite un n�mero: ");
//		double numero = sc.nextDouble();
//		
//		if (numero%2==0) {
//			System.out.println("El numero es par");
//		}
//		else {
//			System.out.println("El numero es impar");
//		}
		
		
//*************************************************************************			
		//Ejercicio 3
		/*
		 * Crea un programa que pida al usuario dos numeros
		 * y muestre el resultado de su divisi�n. Si el segundo 
		 * numero es 0, debe mostrar un mensaje de error.
		 */
//		
//		Scanner sc = new Scanner (System.in);
//		double x, y;
//		System.out.println("Digite primer n�mero: ");
//		x = sc.nextDouble();
//		System.out.println("Digite segundo n�mero: ");
//		y = sc.nextDouble();
//		
//		if (y == 0) {
//			System.out.println("Error");
//		}
//		
//		else {
//			System.out.println("La divisi�n es: "+ x/y);
//		}
//		
		
		
//*************************************************************************
		//Ejercicio 4
		/*
		 * Realiza un programa que lea una cadena por teclado
		 * y compruebe si es una letra may�scula. 
		 */
//		//Ejemplo 1
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Escriba la palabra: ");
//		String letra = sc.nextLine();
//		// r     compara            R
//		if(letra.equals(letra.toUpperCase())) {
//			System.out.println("Si es may�scula");
//			
//		}else {
//			System.out.println("No es may�scula");
//		}
		
		//Ejemplo 2
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Escriba la palabra: ");
//		String texto = sc.nextLine();
//		// luis     compara            LUIS
//		if(letra.equals(texto.toUpperCase())) {
//		System.out.println("Si es may�scula");
//					
//		}else {
//		System.out.println("No es may�scula");
//		}
				
		// Ejemplo 3
		//Vamos a ver si el caracter que estoy ingresando es 
		//una letra o no
//		//indexOf - te busca un car�cter de una variable string. 
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Ingresa una letra");
//		String letra = sc.nextLine();
//		String abc = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ";
//		
//		if (abc.indexOf(letra)<0) {
//			System.out.println("Valor desconocido");
//		}else {
//			System.out.println(abc.indexOf(letra));
//			System.out.println("Si es mayuscula");
//		}
		
		//Ejemplo 4
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Ingresa una letra");
//		String letra = sc.nextLine();
//		
//		if(letra.equals(letra.toLowerCase())){
//			System.out.println("Si es minuscula");
//		}else {
//			System.out.println("no lo esa");
//		}
		
		
		

//*************************************************************************	
		//Ejercicio 5
		/*
		 * Realice un programa que calcula la aceptaci�n
		 * de una solicitud con base a los siguiente par�metros:
		 * edad, nota y sexo.
		 * M�nimo: nota(5)
		 * 
		 * 
		 */
//		
//		Scanner sc = new Scanner(System.in);
//		int nota, edad;
//		String sexo;
//		System.out.println("Escribe tu nota: ");
//		nota = sc.nextInt();
//		
//		System.out.println("Escribe tu edad: ");
//		edad = sc.nextInt();
//		System.out.println("Escribe tu sexo: ");
//		sc.nextLine(); /*
//		NOTA: ES IMPORTANTE PONER ESTE M�TODO DESPU�S 
//		DE UN "NextInt" para que se consuma el /n que no 
//		lee el nextInt
//		*/ 
//		sexo = sc.nextLine();
//		
//		if(nota >= 5 && edad >= 18 && sexo.equals("M") || sexo.equals("m")) {
//			System.out.println("Solicitud POSIBLE");
//		} else if (nota >= 5 && edad >= 18 && sexo.equals("F") || sexo.equals("f")) {
//			System.out.println("Solicitud ACEPTADA");
//		}else {
//			System.out.println("NO ACEPTADO");
//		}
//				
			
		
//*************************************************************************	
		//Ejercicio 6
		/*
		 * La asociaci�n de vinicultores tiene como pol�tica
		 * fijar un precio inicial al kilo de uva:
		 * Se clasifica en dos tipos: A y B.
		 * Tambi�n se clasifica en dos tama�os: 1 y 2.
		 * La venta del producto s�lo puede ser de un 
		 * tipo y un tama�o.
		 * Si es tipo A y tama�o 1, se le cargan 20 c�ntimos al precio 
		 * inicial.
		 * Si es tipo A y tama�o 2, se le cargan 30 c�ntimos al precio 
		 * inicial.
		 * Si es tipo B y tama�o 1, se rebajan 30 c�ntimos al precio 
		 * inicial.
		 * Si es tipo B y tama�o 2, se rebajan 50 c�ntimos al precio 
		 * inicial.
		 */
		
//		Scanner sc = new Scanner(System.in);
//		double preciokilo, tama�o;
//		String tipo; 
//		System.out.println("Establezca el precio inicial del kilo de uvas (m�nimo 50 c�ntimos): ");
//		preciokilo = sc.nextDouble(); // 18 /n
//		sc.nextLine(); //Salvaci�n al problema?
//		if(preciokilo >= 0.5 ) {
//		System.out.println("Seleccione el tipo del producto (A o B): ");
//		tipo = sc.nextLine();
//		//Selecci�n de tipo A o B
//		if (tipo.equals("A") || tipo.equals("a")) {
//			//lo que sigue si es tipo A
//			//Selecci�n del tama�o
//			System.out.println("Seleccione el tama�o (1 o 2)");
//			tama�o = sc.nextInt();
//			if(tama�o == 1) {
//				//lo que sigue si es tipo A tama�o 1
//				preciokilo = preciokilo + 0.20;
//				System.out.println("El precio del producto por kilo es: "+preciokilo+ " pesos");
//			}else if (tama�o == 2) {
//				//lo que sigue si es tipo A tama�o 2
//				preciokilo = preciokilo + 0.30;
//				System.out.println("El precio del producto por kilo es: "+preciokilo+ " pesos");
//			}else {
//				System.out.println("Tama�o no v�lido! Seleccione 1 o 2");
//			}
//		}else if (tipo.equals("B")|| tipo.equals("b")){
//			//lo que sigue si es tipo B
//			//Selecci�n del tama�o
//			System.out.println("Seleccione el tama�o (1 o 2)");
//			tama�o = sc.nextInt();
//			if(tama�o == 1) {
//				//lo que sigue si es tipo B tama�o 1
//				preciokilo = preciokilo - 0.30;
//				System.out.println("El precio del producto por kilo es: "+preciokilo +" pesos");
//			}else if (tama�o == 2) {
//				//lo que sigue si es tipo B tama�o 2
//				preciokilo = preciokilo - 0.50;
//				System.out.println("El precio del producto por kilo es: "+preciokilo + " pesos");
//			}else {
//				System.out.println("Tama�o no v�lido! Seleccione 1 o 2");
//			}
//		}else {
//			System.out.println("Tipo de producto no v�lido! Seleccione A o B");
//		}
//		
//		}else { // Precio menor que 50 c�ntimos
//			System.out.println("Precio no v�lido");
//		}
//*************************************************************************	
		//Ejercicio 7
		
		/*
		 * El director de una escuela est� organizando un
		 * viaje de estudios y requiere determinar cu�nto debe
		 * cobrar a cada alumno y cu�nto debe pagar a la 
		 * compa��a de viajes por el servicio. La forma de
		 * cobrar es la siguiente:
		 * 100 alumnos o m�s, costo por alumno es de 65 euros.
		 * 50 a 99 alumnos, costo p/alumno 70 euros.
		 * 30 a 49 alumnos, costo p/alumno 95 euros.
		 * Menos de 30 alumnos, el costo de la renta de autobus
		 * es de 4000 euros.
		 * Realizar algoritmo que permita determinar el pago
		 * a la compa��a de autobuses y lo que debe pagar
		 * cada alumno por el viaje.
		 * 
		 */
//		Scanner sc = new Scanner(System.in);
//		int alumnos, pago;
//		System.out.println("Cu�ntos alumnos asistir�n al viaje?: ");
//		alumnos = sc.nextInt();
//		//M�s de 100 alumnos
//		if(alumnos >= 100){
//			pago = 65;
//			System.out.println("Cada alumno deber� pagar: $"+pago);
//		}else if(alumnos >=50 && alumnos <=99) { // 50 a 99 alumnos
//			pago = 70;
//			System.out.println("Cada alumno deber� pagar: $"+pago);
//		}else if(alumnos >=30 && alumnos <=49) { // 30 a 49 alumnos
//			pago = 95;
//			System.out.println("Cada alumno deber� pagar: $"+pago);
//		}else if(alumnos >=1 && alumnos <=29) { // 1 a 29 alumnos
//			pago = 4000;
//			System.out.println("El pago total del viaje costar�: $"+pago);
//		} else { // no hay alumnos disponibles para viajar
//			System.out.println("No se pueden realizar viajes");
//		}
//		
//*************************************************************************	
		//Ejercicio 7
		/*
		 * Realiza un programa que pida por teclado el resultado
		 * (dato entero) obtenido al lanzar un dado de seis caras y
		 * muestre por pantalla el n�mero en letras (dato cadena) de
		 * la cara opuesta al resultado obtenido.
		 * Nota: caras opuestas del dado --> 1-6, 2-5, 3-4.
		 * Nota2: mostrar error si escriben un n�mero menor que 1 o 
		 * mayor que 6.
		 */
//		Scanner sc = new Scanner(System.in);
//		int numdado, caraopuesta;
//		System.out.println("Digite el n�mero de la cara del dado: ");
//		numdado = sc.nextInt();
//		switch(numdado) {
//		
//		case 1:
//			caraopuesta = 6;
//			System.out.println("La cara opuesta a la cara 1 es: " + caraopuesta);
//			break;
//		case 2:
//			caraopuesta = 5;
//			System.out.println("La cara opuesta a la cara 2 es: " + caraopuesta);
//			break;
//		case 3:
//			caraopuesta = 4;
//			System.out.println("La cara opuesta a la cara 3 es: " + caraopuesta);
//			break;
//		case 4:
//			caraopuesta = 3;
//			System.out.println("La cara opuesta a la cara 4 es: " + caraopuesta);
//			break;
//		case 5:
//			caraopuesta = 2;
//			System.out.println("La cara opuesta a la cara 5 es: " + caraopuesta);
//			break;
//		case 6:
//			caraopuesta = 1;
//			System.out.println("La cara opuesta a la cara 6 es: " + caraopuesta);
//			break;
//			
//			default: System.out.println("Error!! Intente de nuevo");
//		}
//*************************************************************************
		//Ejercicio 8
		/*Realiza un programa que pida el d�a de la semana 
		 * (del 1 al 7) y escriba el d�a correspondiente.
		 * Si introducimos otro n�mero nos da error. 
		 */
//		Scanner sc = new Scanner(System.in);
//		int dia;
//		System.out.println("Digite el n�mero del d�a de la semana, sea lunes el d�a 1: ");
//		dia = sc.nextInt();
//		switch(dia) {
//		
//		case 1:
//			System.out.println("El d�a es lunes");
//			break;
//		case 2:
//			System.out.println("El d�a es martes");
//			break;
//		case 3:
//			System.out.println("El d�a es mi�rcoles");
//			break;
//		case 4:
//			System.out.println("El d�a es jueves");
//			break;
//		case 5:
//			System.out.println("El d�a es viernes");
//			break;
//		case 6:
//			System.out.println("El d�a es s�bado");
//			break;
//		case 7:
//			System.out.println("El d�a es domingo");
//			break;
//			
//			default: System.out.println("Error!! Intente de nuevo");
//		}
//*************************************************************************	
		//Ejercicio 9
		/*Realiza un programa que pida un n�mero entero entre
		 * uno y doce e imprima el n�mero de d�as que tiene el
		 * mes correspondiente.
		 * 
		*/

//		Scanner sc = new Scanner(System.in);
//		int mes;
//		String bisiesto;
//		System.out.println("Digite el n�mero del mes: ");
//		mes = sc.nextInt();
//		sc.nextLine();
//		switch(mes) {
//		
//		case 1:
//			mes = 31;
//			System.out.println("Enero tiene: "+mes +" d�as");
//			break;
//		case 2:
//			System.out.println("Es a�o bisiesto en Febrero? (y/n)");
//			bisiesto = sc.nextLine();
//			if (bisiesto.equals("y")) {
//				mes = 29;
//				System.out.println("Febrero tiene: "+mes +" d�as");	
//			} else if (bisiesto.equals("n")) {
//				mes = 28;
//				System.out.println("Febrero tiene: "+mes +" d�as");	
//			}
//			else {
//				System.out.println("Error, ingresa 'y' o 'n'");	
//			}
//			
//			break;
//		case 3:
//			mes = 31;
//			System.out.println("Marzo tiene: "+mes +" d�as");
//			
//			break;
//		case 4:
//			mes = 30;
//			System.out.println("Abril tiene: "+mes +" d�as");
//			break;
//		case 5:
//			mes = 31;
//			System.out.println("Mayo tiene: "+mes +" d�as");
//			break;
//		case 6:
//			mes = 30;
//			System.out.println("Junio tiene: "+mes +" d�as");
//			break;
//		case 7:
//			mes = 31;
//			System.out.println("Julio tiene: "+mes +" d�as");
//			break;
//		case 8:
//			mes = 31;
//			System.out.println("Agosto tiene: "+mes +" d�as");
//			break;
//		case 9:
//			mes = 30;
//			System.out.println("Septiembre tiene: "+mes +" d�as");
//			break;
//		case 10:
//			mes = 31;
//			System.out.println("Octubre tiene: "+mes +" d�as");
//			break;
//		case 11:
//			mes = 30;
//			System.out.println("Noviembre tiene: "+mes +" d�as");
//			break;
//		case 12:
//			mes = 31;
//			System.out.println("Diciembre tiene: "+mes +" d�as");
//			break;
//			
//			default: System.out.println("Error!! Intente de nuevo");
//		}
//*************************************************************************	
		//Ejercicio 10
		/*Una compa��a de transporte internacional tiene 
		 *servicio en algunos pa�ses de America del Norte,
		 *America Central, America del Sur, Europa y Asia.
		 *El costo por servicio de transporte se basa en el
		 *peso del paquete y la zona a la que va dirigida.
		 *Zona					Costo/Kg
		 *America del Norte --- 24,00 euros
		 *America Central ----- 20,00 euros
		 *America del Sur ----- 21,00 euros
		 *Europa -------------- 10,00 euros
		 *Asia ---------------- 18,00 euros
		 *
		 *Parte de su pol�tica dice que paquetes con peso 
		 *mayor a 5 kg no son transportados.
		 * Realiza un algoritmo para determinar el cobro por
		 * la entrega de un paquete o, en su caso, el rechazo
		 * de un paquete
		*/
//		Scanner sc = new Scanner(System.in);
//		int zona;
//		double peso, costo;
//		
//		System.out.println("Digite un n�mero de acuerdo con la zona a la que se dirige: \n"
//				+ "Seleccione 1 para America del Norte 		24 euros/kg \n"
//				+ "Seleccione 2 para America del Central		20 euros/kg \n"
//				+ "Seleccione 3 para America del Sur 		21 euros/kg \n"
//				+ "Seleccione 4 para Europa 			10 euros/kg \n"
//				+ "Seleccione 5 para Asia 				18 euros/kg \n");
//		zona = sc.nextInt();
//		sc.nextLine();//Salvaci�n de errores con nextInt
//		if (zona >=1 && zona<=5) {
//		System.out.println("Cu�l es el peso m�ximo (kg) a transportar?: \n");
//		peso = sc.nextDouble();
//	
//		if (peso >= 5) {
//			
//			System.out.println("Lo siento, no puede transportar 5 kg o m�s");
//			
//		}else if (peso <= 0) {
//			System.out.println("No puedes ingresar 0 kg o menos");
//			
//		} else {
//			switch (zona) {
//			case 1:
//			costo = 24;
//			costo = costo*peso;
//			System.out.println("El costo es: "+ costo +" euros");
//				break;
//				
//			case 2:
//				costo = 20;
//				costo = costo*peso;
//				System.out.println("El costo es: "+ costo +" euros");
//				break;	
//				
//			case 3:
//				costo = 21;
//				costo = costo*peso;
//				System.out.println("El costo es: "+ costo +" euros");
//				break;	
//				
//			case 4:
//				costo = 10;
//				costo = costo*peso;
//				System.out.println("El costo es: "+ costo +" euros");
//				break;
//				
//			case 5:
//				costo = 18;
//				costo = costo*peso;
//				System.out.println("El costo es: "+ costo +" euros");
//		        break;
//			}
//			}
//		} else {
//			System.out.println("Error");
//		}
//*************************************************************************	
		//Ejercicio 11
		/*
		* Construir un programa que calcule el �ndice de 
		* masa corporal de una persona 
		* (IMC = peso (kg) / altura (m)) e indique el estado
		* en que se encuentra la persona.
		* 
		* Valor de IMC			Diagn�stico
		* <16					Criterio de ingreso en hospital
		* 16 a 17				infrapeso
		* 17 a 18				bajo peso
		* 18 a 25				peso normal
		* 25 a 30				sobrepeso
		* 30 a 35				sobrepeso cr�nico
		* 35 a 40				obesidad prem�rbida
		* >40					obesidad m�rbida
		* 
		* Nota: se recomienda el empleo de if-else.					
	    */
//		Scanner sc = new Scanner(System.in);
//		double imc, peso, altura;
//		System.out.println("Ingrese peso: \n");
//		peso = sc.nextDouble();
//		
//		System.out.println("Ingrese altura: \n");
//		altura = sc.nextDouble();
//		
//		imc = peso/altura;
//		
//		if(imc<16){
//			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: Criterio de ingreso al hospital");
//		}else if(imc >=16 && imc <= 17) {
//			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: infrapeso");
//		}else if(imc >=17 && imc <= 18) {
//			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: bajo peso");
//		}else if(imc >=18 && imc <= 25) {
//			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: peso normal");
//		}else if(imc >=25 && imc <= 30) {
//			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: sobrepeso");
//		}else if(imc >=30 && imc <= 35) {
//			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: sobrepeso cr�nico");
//		}else if(imc >=35 && imc <= 40) {
//			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: obesidad prem�rbida");
//		}else if(imc > 40) {
//			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: obesidad m�rbida");
//		}
//*************************************************************************	
		//Ejercicio 12
		/*
		 * Una instituci�n ben�fica recibe anualmente 
		 * una donaci�n proveniente de Europa y lo reparte 
		 * entre un centro de salud, un comedor de ni�os y 
		 * una parte lo invierte en la bolsa de acuerdo a lo
		 * siguiente:
		 * Si la donaci�n es $10000 o m�s: 30% se destina 
		 * al centro de salud, 50% al comedor de ni�os y
		 * el resto se invierte en la bolsa.
		 * 
		 *  Si la donaci�n es menor a $10000: 25% se 
		 *  destina al centro de salud, 60% al comedor de
		 *  ni�os y el resto se invierte en la bolsa.
		 */
//		
//		Scanner sc = new Scanner(System.in);
//		double donacion; 
//		System.out.println("Ingrese donaci�n anual: ");
//		donacion = sc.nextDouble();
//		if(donacion >=10000) {
//			System.out.println("La donaci�n se reparte de la siguiente forma: \n"
//					+ "$"+donacion*0.3+ " se destina al centro de salud \n"
//							+ "$"+donacion*0.5+ " se destina al centro de salud \n"
//									+ "$"+donacion*0.2+ " se invierte en la bolsa \n");
//		}else if(donacion <10000) {
//			System.out.println("La donaci�n se reparte de la siguiente forma: \n"
//					+ "$"+donacion*0.25+ " se destina al centro de salud \n"
//							+ "$"+donacion*0.6+ " se destina al centro de salud \n"
//									+ "$"+donacion*0.15+ " se invierte en la bolsa \n");
//		} else {
//			System.out.println("Error");
//		}
//*************************************************************************
		//Ejercicio 13
		/*
		 *Un obrero necesita calcular su salario semanal,
		 *el cual se obtiene de la siguiente manera: 
		 *Si trabaja 40 hrs o menos se le paga $16 por hora.
		 *
		 * Si trabaja m�s de 40 hrs se le paga $16 por cada
		 * una de las primeras 40 hrs y $20 por cada hora extra
		 */
		
//		Scanner sc = new Scanner(System.in);
//		int horas, salario;
//		System.out.println("Ingrese las horas que trabaj�: ");
//		horas = sc.nextInt();
//		
//		if(horas <=40 && horas >=1) {
//			salario = horas*16;
//			System.out.println("Su salario semanal es: "+ salario +" d�lares");
//		}else if (horas > 40) {
//			salario = 40*16 + ((horas - 40)*20);
//			System.out.println("Su salario semanal es: "+ salario +" d�lares");
//			
//		}else {
//			System.out.println("No trabaj�");
//		}
		
		
		
/*****************************************************************************************
 * ****************************EJERCICIOS ARRAYS*******************************************
 * **************************************************************************************
 */
		
//*************************************************************************	
		//Ejercicio 1
		/*
		 * Inicializar un array de 20 posiciones y llenarlo.
		 * Luego, realizar sumatoria de los numeros en las posiciones pares
		 * Mostrar resultados.
		 */
		
//		int[] arreglo = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//		int suma, cont;
//		cont = 0;
//		suma = 0;
//		while(cont<arreglo.length) {
//			System.out.println(arreglo[cont]);
//			suma = suma + arreglo[cont];
//			cont = cont + 2;
//			
//			
//		}
//		
//		System.out.println("La suma de las posiciones pares es "+ suma);
		
		//Hecho por Luis Enrique Ant�nez Guti�rrez
//*************************************************************************	
		//Ejercicio 2
		/*
		 * Del siguiente texto, determinar:
		 * - Cu�ntas veces aparece la letra 'e'.
		 * - Cu�ntas vocales hay.
		 * - Cu�ntas consonantes hay.
		 * Lorem ipsum dolor sit amet consectetur adipiscing elit tortor nisl velit pretium aliquet 
		 * habitant ligula feugiat, laoreet nulla et turpis posuere eget sociosqu hendrerit quisque 
		 * nibh a blandit lacinia. Rhoncus convallis molestie tempor arcu enim nunc etiam vestibulum 
		 * leo primis dictumst, ut mus tempus velit nostra egestas porta ad nec. Laoreet netus 
		 * torquent porttitor bibendum tincidunt, nec aliquet nostra facilisi, risus odio in dictum. 
		 * 
		 * Platea integer sollicitudin phasellus vehicula torquent montes neque malesuada tortor 
		 * fames, libero justo accumsan felis nullam senectus conubia aliquet non sed nisl, sagittis 
		 * massa sociis odio cursus morbi iaculis euismod luctus. Potenti metus et magnis purus 
		 * nullam sollicitudin cum pretium quam, senectus urna tellus volutpat netus mattis gravida 
		 * nascetur, eleifend diam in imperdiet laoreet sem iaculis ridiculus. Augue class ligula
		 * laoreet cras orci habitasse, luctus hendrerit vivamus porttitor dignissim ad semper, 
		 * lacus dictumst ante senectus etiam.
		 *  
		 * - Normalizar a minusculas todo.
		 */
		
//		Scanner sc = new Scanner(System.in);
//		int contador1 = 0,contadorE = 0,contadorVocal = 0, contadorConso = 0;
//		char[] arrtexto;
//		String texto = "Lorem ipsum dolor sit amet consectetur adipiscing elit tortor nisl velit"
//				+ "pretium aliquet habitant ligula feugiat, laoreet nulla et turpis posuere eget"
//				+ "sociosqu hendrerit quisque nibh a blandit lacinia. Rhoncus convallis molestie"
//				+ "tempor arcu enim nunc etiam vestibulum leo primis dictumst, ut mus tempus velit"
//				+ "nostra egestas porta ad nec. laoreet netus torquent porttitor bibendum tincidunt,"
//				+ "nec aliquet nostra facilisi, risus odio in dictum. " + 
//				" " + 
//				"Platea integer sollicitudin phasellus vehicula torquent montes neque malesuada"
//				+ "tortor fames, libero justo accumsan felis nullam senectus conubia aliquet non sed"
//				+ "nisl, sagittis massa sociis odio cursus morbi iaculis euismod luctus. Potenti metus"
//				+ "et magnis purus nullam sollicitudin cum pretium quam, senectus urna tellus"
//				+ "volutpat netus mattis gravida nascetur, eleifend diam in imperdiet laoreet sem"
//				+ "iaculis ridiculus. augue class ligula laoreet cras orci habitasse, luctus hendrerit"
//				+ "vivamus porttitor dignissim ad semper, lacus dictumst ante senectus etiam.";
//
//		texto = texto.toLowerCase(); //Todo el texto lo convierte a min�scula
//		
//		arrtexto = texto.toCharArray(); //.toCharArray convierte cada posici�n de un texto string en arreglo char.
//		
//		for(contador1=0;contador1<arrtexto.length;contador1++) {
//			
//			if(arrtexto[contador1]=='e') {//char == char no hay problema, s�lo si fuera String == char
//				
//				contadorE = contadorE +1;  //aumenta +1 al contador de letra e
//				contadorVocal = contadorVocal +1; //aumenta +1 al contador de vocales
//				
//			}else if(arrtexto[contador1]=='a' || arrtexto[contador1]=='i' || arrtexto[contador1]=='o'||
//					arrtexto[contador1]=='u') {
//				
//				contadorVocal = contadorVocal+1;
//				
//			}else if(arrtexto[contador1]==' '||arrtexto[contador1]=='.'||arrtexto[contador1]==',') { 
//				//Se declara este else if para omitir el espacio, el punto y la coma del texto.
//				
//			}else {//Este else cuenta las consonantes.
//				contadorConso = contadorConso + 1;
//			}
//			
//		}
//		System.out.println("Numero de veces que aparece letra e: "+ contadorE);
//		System.out.println("Numero de veces que aparece letra e: "+ contadorVocal);
//		System.out.println("Numero de veces que aparece letra e: "+ contadorConso);
//		
//		
		//Otro ejemplo de resolver este ejercicio
		/*
		 * 
		 */
		
//		String texto = "Lorem ipsum dolor sit amet consectetur adipiscing elit tortor nisl velit"
//				+ "pretium aliquet habitant ligula feugiat, laoreet nulla et turpis posuere eget"
//				+ "sociosqu hendrerit quisque nibh a blandit lacinia. Rhoncus convallis molestie"
//				+ "tempor arcu enim nunc etiam vestibulum leo primis dictumst, ut mus tempus velit"
//				+ "nostra egestas porta ad nec. laoreet netus torquent porttitor bibendum tincidunt,"
//				+ "nec aliquet nostra facilisi, risus odio in dictum." + 
//				"" + 
//				"Platea integer sollicitudin phasellus vehicula torquent montes neque malesuada"
//				+ "tortor fames, libero justo accumsan felis nullam senectus conubia aliquet non sed"
//				+ "nisl, sagittis massa sociis odio cursus morbi iaculis euismod luctus. Potenti metus"
//				+ "et magnis purus nullam sollicitudin cum pretium quam, senectus urna tellus"
//				+ "volutpat netus mattis gravida nascetur, eleifend diam in imperdiet laoreet sem"
//				+ "iaculis ridiculus. augue class ligula laoreet cras orci habitasse, luctus hendrerit"
//				+ "vivamus porttitor dignissim ad semper, lacus dictumst ante senectus etiam.";
//
//		texto = texto.toLowerCase();
//		//System.out.println(texto);
//		
//		int contE=0; //contador de letras e
//		int contV=0; //contador de todas las vocales
//		int contC=0; //contador de consonantes
//		
//		//Este for recorre la totalidad del texto
//		for(int i = 0; i<texto.length();i++) {
//			if(texto.charAt(i) =='e') { //Busca e
//				contE++;
//				contV++;
//				//
//			}else if (texto.charAt(i) == 'a'|| texto.charAt(i) == 'i'||texto.charAt(i) == 'o'||
//					texto.charAt(i) == 'u') { // Busca a, i, o y u
//				contV++;
//			}else if (texto.charAt(i) == ' '|| texto.charAt(i) == ','||texto.charAt(i) == '.') {
//				
//			}else {
//				contC++;
//			}
//			
//			
//		}
//		System.out.println("Cantidad total de letras e: "+ contE);
//		System.out.println("Cantidad total de letras vocales: "+ contV);
//		System.out.println("Cantidad total de consonantes: "+ contC);
		
		//
		//*************************************************************************	
		
		//Ejercicio 3
		
		/*
		 * Hacer un programa que guarde tu nombre en un array de dos dimensiones
		 */
		
		//Nombre: Luis Enrique Antunez Gutierrez (tama�o 30)
//		String [][] nombre = new String[5][6];
//		int f= 0;
//		int c= 0;
//		
//		nombre [0][0]= "L" ;
//		nombre [0][1]= "u" ;
//		nombre [0][2]= "i" ;
//		nombre [0][3]= "s" ;
//		nombre [0][4]= " " ;
//		nombre [0][5]= "E" ;
//		
//		nombre [1][0]= "n" ;
//		nombre [1][1]= "r" ;
//		nombre [1][2]= "i" ;
//		nombre [1][3]= "q" ;
//		nombre [1][4]= "u" ;
//		nombre [1][5]= "e" ;
//		
//		nombre [2][0]= " " ;
//		nombre [2][1]= "A" ;
//		nombre [2][2]= "n" ;
//		nombre [2][3]= "t" ;
//		nombre [2][4]= "�" ;
//		nombre [2][5]= "n" ;
//		
//		nombre [3][0]= "e" ;
//		nombre [3][1]= "z" ;
//		nombre [3][2]= " " ;
//		nombre [3][3]= "G" ;
//		nombre [3][4]= "u" ;
//		nombre [3][5]= "t" ;
//	
//		nombre [4][0]= "i" ;
//		nombre [4][1]= "�" ;
//		nombre [4][2]= "r" ;
//		nombre [4][3]= "r" ;
//		nombre [4][4]= "e" ;
//		nombre [4][5]= "z" ;
//
//		for (f=0;f<nombre.length;f++) {
//			for (c=0;c<nombre[f].length;c++) {
//				System.out.println(nombre[f][c]);
//			}
//		}

		
		
		//PRUEBA M�A
//		Scanner sc = new Scanner(System.in);
//		String nombreI;
//		String [][] nombre = new String [6][5];
//		int f = 0;
//		int c = 0;
//		
//		System.out.println("Escriba su nombre: ");
//		nombreI = sc.nextLine();
//		
//		System.out.println(nombreI.length());
//		
//		for (f=0; f < nombre.length;f++) {
//			
//		}
//*************************************************************************	
		
		//Ejercicio 4 perro
		
		/*
		 * Crear dos matrices de igual tama�o.
		 * Las dos matrices van a ser de tipo String
		 * Se llenan las matrices con cualquier valor (numeros o letras)
		 * 
		 * Regla: Al momento de hacer la suma, si en ambos lados tienes un n�mero, esos numeros los
		 * debes convertir de String a Entero y debes realizar la suma de ambos numeros y pasar el 
		 * resultado a una tercer matriz.
		 * 
		 * Si te encuentras con una letra y un numero, el resultado debe ser autom�ticamente 0 y debe 
		 * aparecer en la tercer matriz.
		 * 
		 * Si te encuentras con una letra y una letra, el resultado debe ser autompaticamente 0.
		 * 
		 */
		
//		String [][] matriz1 = new String [3][3];
//		String [][] matriz2 = new String [3][3];
//		int [][] matrizR = new int [3][3];
//		String valorMatriz1;
//		String valorMatriz2;
//		int numeroMatriz1;
//		int numeroMatriz2;
//		int suma;
//		
//		int f = 0;
//		int c = 0;
//		
//		
//		//Matriz 1 
//		matriz1 [0][0] = "234ef";
//		matriz1 [0][1] = "x";
//		matriz1 [0][2] = "b";
//		
//		matriz1 [1][0] = "5";
//		matriz1 [1][1] = "2";
//		matriz1 [1][2] = "10";
//		
//		matriz1 [2][0] = "1";
//		matriz1 [2][1] = "10";
//		matriz1 [2][2] = "1";
//		
//		//Matriz 2
//		matriz2 [0][0] = "4";
//		matriz2 [0][1] = "2";
//		matriz2 [0][2] = "1";
//		
//		matriz2 [1][0] = "20";
//		matriz2 [1][1] = "10";
//		matriz2 [1][2] = "4";
//		
//		matriz2 [2][0] = "1";
//		matriz2 [2][1] = "1";
//		matriz2 [2][2] = "1";
//		System.out.println("La suma de la matriz A y la matriz B es: ");
//		for (f=0;f<matriz1.length;f++) {
//			for (c=0;c<matriz1[f].length;c++) {
//				valorMatriz1 = matriz1[f][c];
//				valorMatriz2 = matriz2[f][c];
//				if(valorMatriz1.matches(".*[a-z].*") == false && valorMatriz2.matches(".*[a-z].*")== false) {
//					numeroMatriz1 = Integer.parseInt(valorMatriz1);
//					numeroMatriz2 = Integer.parseInt(valorMatriz2);
//					suma = numeroMatriz1 + numeroMatriz2;
//					matrizR[f][c] = suma;
//					
//					
//				}else {
//					
//					matrizR[f][c] = 0;
//				
//				}System.out.print(" "+matrizR[f][c]+" ");
//				//System.out.println("Valor del array: " + matriz1[f][c] +"Estado: "+ valorMatriz1.matches("[a-z]"));
//			}System.out.println();
//		}
//


		
//*************************************************************************	
//		//Soluci�n Cesar 
//		//Otra forma de resolver el ejercicio anterior
//		Scanner sc = new Scanner(System.in);
//	    String numeros = "1234567890";
//	   
//		String[][] mA ={{"a","a","3"},
//						{"a","a","3"},
//						{"a","a","3"}};
//				
//		String[][] mB = new String[3][3];
//		int [][] mC = new int[3][3];
//		for(int i=0;i<mB.length;i++) {
//			for(int j=0;j<mB.length;j++) {
//				System.out.println("Ingrese un valor, posici�n: " +i+","+j);
//				mB[i][j] = sc.nextLine();
//			}
//		}
//		
//		System.out.println("La suma de matrices es: ");
//		//Realiza la suma de matrices
//		for(int i=0;i<mB.length;i++) { //Filas
//			for(int j=0;j<mB.length;j++) { //Columnas
//				if(numeros.indexOf(mA[i][j])>=0 && numeros.indexOf(mB[i][j])>=0) { //indexOf 
//				int n1 = Integer.valueOf(mA[i][j]);
//				int n2 = Integer.valueOf(mB[i][j]);
//				
//				mC[i][j] = n1+n2;
//
//				}else {
//					mC[i][j] = 0;
//				}System.out.print(mC[i][j]);
//			}System.out.println();
//		}
//*************************************************************************	
		//Soluci�n Cesar 2
		//Otra forma de resolverlo
		
//		Scanner sc = new Scanner(System.in);
//	    String numeros = "1234567890";
//	   
//		String[][] mA ={{"a","b","4"},
//						{"7","j","5"},
//						{"4","8","x"}};
//				
//		String[][] mB = new String[3][3];
//		int [][] mC = new int[3][3];
//		for(int i=0;i<mB.length;i++) {
//			for(int j=0;j<mB.length;j++) {
//				System.out.println("Ingrese un valor, posici�n: " +i+","+j);
//				mB[i][j] = sc.nextLine();
//			}
//			//System.out.println();
//		}
//		
//		//System.out.println("La suma de matrices es: ");
//		//Realiza la suma de matrices
//		for(int i=0;i<mB.length;i++) { //Filas
//			for(int j=0;j<mB.length;j++) { //Columnas
//				Primer forma
//				if(numeros.indexOf(mA[i][j])>=0 && numeros.indexOf(mB[i][j])>=0) {
//				int n1 = Integer.parseInt(s);
//				int n2 = Integer.parseInt(s);
//					
//
//		mC[i][j] = n1+n2;
//
//	}else {
//		mC[i][j] = 0;
//				
//				//Segunda forma try&catch
//				
//				try { //Intenta hacer..
//					//Conversi�n de los valores directo
//					int n1 = Integer.parseInt(mA[i][j]);
//					int n2 = Integer.parseInt(mB[i][j]);
//					mC[i][j] = n1+n2;
//				}catch(Exception ex) { //Si no puedes, atrapa el valor
//					ex.printStackTrace();
//					mC[i][j] = 0;
//				}
//				
//	}
//}//System.out.println();
//
//	//Impresi�n de matrizC
//		for(int i=0;i<mB.length;i++) { //Filas
//			for(int j=0;j<mB.length;j++) { //Columnas
//				System.out.print(mC[i][j]+",");
//			}
//			System.out.println();
//		} //Fal� por resolver  el comando try catch
//	
//*************************************************************************	
		//Ejercicio 5
		/*
		 * Realizar un programa que determine si el String es pal�ndromo
		 */
		
		Scanner sc = new Scanner(System.in);
		String palindromo;
		String reversa = "";
//		String palindromoasig;
		System.out.println("Digite una frase o palabra: ");
		palindromo = sc.nextLine();
		
		palindromo = palindromo.toLowerCase().replaceAll(" +", " ").trim();
		
		System.out.println(palindromo);
		
		//C�mo se lee de derecha a izquierda? con una nueva variable (reversa)
		
		//Recorrido al rev�s
		for (int i = palindromo.length()-1; i >= 0; i-- ) {
			System.out.println("Caracter: "+ palindromo.charAt(i));
			
			reversa = reversa + palindromo.charAt(i);
			System.out.println(reversa);
		}
		
		if (palindromo.equals(reversa)) {
			System.out.println("Si es pal�ndromo");
		}else {
			System.out.println("No es pal�ndromo");
		}
		
		//Luis Enrique Ant�nez Guti�rrez
//*************************************************************************	
		//Ejercicio 6
		/*
		 *  Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y 
		 *  segundos de un d�a desde las 00:00:00 horas hasta las 23:59:59 horas
		 */
		
//		Scanner sc = new Scanner (System.in);
//
//		
//		for (int h = 0; h<24; h++) {
//			
//			for (int m = 0; m<60; m++) {
//				
//				for (int s = 0; s<60; s++) {
//					
//					
//					
//					System.out.println(h+":"+ m + ":" + s);
//				}
//				
//				
//			}
//			
//			
//		}
		//
		//o x x o
		//Luis Enrique Ant�nez Guti�rrez
//*************************************************************************	
//*************************************************************************	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}	
}

