package estruturasdeloop;

public class SomaImpares {
	public static void main(String[] args) {
		int soma = 0;
		for(int i = 57; i< 901 ; i += 3) {
		
			if(i%2==1) {
			soma = i + i;	
				
		System.out.println("O resultado da soma dos numeros impares"+soma);	
			}
		}	
	}
}
