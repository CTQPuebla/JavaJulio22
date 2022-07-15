package com;

public class Practica2 {
	public static void main(String[] args) {
		int horas = 23;
		int minutos = 59;
		int segundos = 59;
		
		for(int i= 0; i <= horas; i++) {
			for(int j = 0; j <= minutos; j++) {
				for(int n = 0; n <=segundos; n++) {
					String hr = Integer.toString(i);
					String min = Integer.toString(j);
					String se = Integer.toString(n);
					//System.out.println(+i+": "+j+": "+n);
					if(hr.length()<2 && min.length()<2 && se.length()<2){
						System.out.println("0"+i+": "+"0"+j+": "+"0"+n);
					}else if(hr.length()<2 && min.length()<2){
						System.out.println("0"+i+": "+"0"+j+": "+n);
					}else if(hr.length()<2 && se.length()<2){
						System.out.println("0"+i+": "+j+": "+"0"+n);
					}else if(min.length()<2 && se.length()<2){
						System.out.println(i+": "+"0"+j+": "+"0"+n);
					}else if(hr.length()<2) {
						System.out.println("0"+i+": "+j+": "+n);
					}else if(min.length()<2){
						System.out.println(i+": "+"0"+j+": "+n);
					}else if( se.length()<2){
						System.out.println(i+": "+j+": "+"0"+n);
					}
					else {
						System.out.println(+i+": "+j+": "+n);
					}
					
			}
			
		}
		
	}
}
}
