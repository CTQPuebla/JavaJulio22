package com;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    //Israel Flores Contreras
    // 15/07/2022

    public static void main(String[] args) throws InterruptedException {
        // Cadenas palíndromas

        Scanner sc = new Scanner(System.in);

        String cadena;
        System.out.print("Escribe una frase: ");
        cadena = sc.nextLine();

        cadena = cadena.replace(" ", "");
        cadena = cadena.toLowerCase();

        int cont = cadena.length() - 1;

        for (int i = 0; i < cadena.length();i++){
            if(cadena.charAt(i) != cadena.charAt(cont)){
                System.out.println("No es un palindromo");
                break;
            } else if(cont == 0){
                System.out.println("Es un palindromo");
                break;
            }
            cont--;
        }

        // Minutero
        int horas = 0, minutos = 0, segundos = 0;

        while (true) {
            try{
                System.out.println(horas + ":" + minutos + ":" + segundos);
                segundos++;
                Thread.sleep(1000);
                if (segundos == 60){
                    minutos++;
                    segundos = 0;
                    if (minutos == 60){
                        horas++;
                        minutos = 0;
                        if (horas == 24){
                            horas = 0;
                        }
                    }
                }

            } catch (InterruptedException ignored){}
        }


    }

}
