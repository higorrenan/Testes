package estruturasdeloop;

public class SomaPares {
	public static void main(String[] args) {
		int i = 0;
		int soma = 0;
		
		for(i = 1; i<=1000; i++) {
			if( i % 2 ==0) {
				soma = soma+i;
			}
		}
		
		System.out.println(soma);
	}
}
