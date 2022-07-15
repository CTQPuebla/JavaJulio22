package com;

public class Horas {
	public static void main(String[] args) {

		for (int horas = 0; horas <= 23; horas++) {
			for (int minutos = 0; minutos <= 59; minutos++) {
				for (int segundos = 0; segundos <= 59; segundos++) {
					String s;
					if (segundos <= 9) {
						s = "0" + segundos;
					} else {
						s = "" + segundos;
					}
					System.out.println(horas + ":" + minutos + ":" + s);

				}

			}
		}

	}

}
