
public class RelojDigital {

	public static void main(String[] args) {
		// Simular el comportamiento de un reloj digital, 
//		imprimiendo la hora, minutos y segundos de un día 
//		desde las 00:00:00 horas hasta las 23:59:59 horas
		
		
		int hi = 0;
		int mi = 0;
		int si= 0;
		
		String ceroj2 = "";
		String ceroj = "";
		String ceroi = "";
		
		
		for (int i = 0; i < 24; i++) {
			if(i >= 0 && i <= 9) ceroi = "0";
			else ceroi = "";
			
			for (int j = 0; j < 60; j++) {
				if(j >= 0 && j <= 9) ceroj = "0";
				else ceroj = "";
				
				for (int j2 = 0; j2 < 60; j2++) {
					if(j2 >= 0 && j2 <= 9) ceroj2 = "0";
					else ceroj2 = "";
					System.out.println(ceroi + i + ":" +ceroj + j + ":" + ceroj2+ j2);
				}
				
			}
		}

	}

}
