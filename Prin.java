package com;

public class Prin {
    // Israel Flores Contreras
    // 13/07/2022
    public static void main(String[] args){
        char [][] dobleArray = new char[3][7];
        String nombre = "IsraelFloresContreras";
        int cont = 0;

        for(int i = 0; i < dobleArray.length; i++){
            for (int j = 0; j<dobleArray[i].length;j++){
                dobleArray[i][j] = nombre.charAt(cont);
                cont++;
                System.out.print(dobleArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
