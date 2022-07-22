package estruturasdeloop2;

public class SomaPositivoNegativo {
	public static void main(String[] args) {
		int i = 0;
		int positivo = 0;
		int negativo = 0;
				
		for(i = -25; 24>=i; i ++) {
			
			if(i > 0)
				positivo++;
			
			if (i < 0 )
				negativo--;
		}
		System.out.println("A soma dos numeros positivos: "+positivo);
		
		System.out.println("A soma dos numeros negativos: "+negativo);
	}
}
