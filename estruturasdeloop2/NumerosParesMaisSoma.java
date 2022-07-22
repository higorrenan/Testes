package estruturasdeloop2;

public class NumerosParesMaisSoma {
	public static void main(String[] args) {
		
		int i =0; 
		//int par = 0;
		int soma = 0;
		
		for(i = 85; i<=907 ; i++) {
			
			if(i % 2 ==0) {
				System.out.println(i);
				soma = soma + i;
			}	
		}
		System.out.println("A soma dos numeros pares: "+ soma);
	}
}
