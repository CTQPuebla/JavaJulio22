package com;

public class Principal {

    // Israel Flores Contreras
    // 13/07/2022

    public static void main(String[] args){
        String[][] matriz1 = {{"a","200","600","g21",},
                            {"48907","b89h8h","t x 45","d999"},
                            {"4899","6012"," ","8"},
                            {"h","8","4","9"}};

        String[][] matriz2 = {{"1345","7345345","nnnu","4564536",},
                            {"n","k","7","7"},
                            {"3","g","h","9"},
                            {"p","j","n","7"}};

        int temp;

        String[][] matrizResultante = new String[4][4];

        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[i].length; j++){
                try {
                    temp = Integer.parseInt(matriz1[i][j]) + Integer.parseInt(matriz2[i][j]);
                    matrizResultante[i][j] = String.valueOf(temp);
                } catch (Exception e){
                    matrizResultante[i][j] = "0";
                }
                System.out.print(matrizResultante[i][j] + " ");
            }
            System.out.println();
        }
    }

}
