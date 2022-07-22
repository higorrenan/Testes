package estruturasdeloop;

public class Soma {
	public static void main(String[] args) {
		int soma = 0;
		for(int i = 1; i< 599 ; i++) {
		
			if(i%2==0) {
			soma = i + i;	
				
		System.out.println(soma);	
			}
		}	
	}
}
