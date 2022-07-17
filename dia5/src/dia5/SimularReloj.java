package dia5;

public class SimularReloj {
	public static void main(String[] args) {
	 
		for(int seg=0; seg<60; seg++) {
			System.out.println(seg);
			for(int min=0; min<60; min++) {
				System.out.println(min+":"+seg);
				for(int hrs=0;hrs<24; hrs++) {
					System.out.println(hrs+":"+min+":"+seg);
					
				}
			}
		}
		/*  int[] segundos= {0,1,2,3,4,5,6,7,8,9};
		int[] minutos = {0,1,2,3,4,5,6,7,8,9};
		int[] hora={0,1,2,3,4,5,6,7,8,9};
		
		int cont=0;
		while(cont<60) {
		for (int f=0; f<segundos.length; f++) {
				// System.out.println(segundos[f]);
				 if(segundos[f]<9) {
					 for (int m=0; m<segundos.length; m++) {
						 System.out.println(segundos[f]+" "+segundos[f]+" "+segundos[m]); 
						 if(segundos[f]==6) {
							 cont=59;
							 System.out.println("no");
						 }
						 
					 }
				 }
			 }
			 //System.out.println(segundos[f]+" "+minutos[f]);
			cont++;
		}*/
		
		//acesso a archivos java  file, filereader, filewhitter, bufferedRead
		
		//--------------
		
		
		
		
		
		
		
	}

}
