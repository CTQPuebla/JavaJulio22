package com;

public class Reloj {
	public static void main(String[] args) {
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				for (int j2 = 0; j2 < 60; j2++) {

					if (i < 10 && j < 10 && j2 < 10) {
						System.out.println("0" + i + ":0" + j + ":0" + j2);
					} else if (j < 10 && j2 < 10) {
						System.out.println(i + ":0" + j + ":0" + j2);
					} else if (j2 < 10) {
						System.out.println(i + ":" + j + ":0" + j2);
					} else if (i < 10 && j < 10) {
						System.out.println("0" + i + ":0" + j + ":" + j2);
					} else if (i < 10) {
						System.out.println("0" + i + ":" + j + ":" + j2);
					} else if (j < 10) {
						System.out.println(i + ":0" + j + ":" + j2);
					} else {
						System.out.println(i + ":" + j + ":" + j2);
					}

				}

			}

		}

	}

}
