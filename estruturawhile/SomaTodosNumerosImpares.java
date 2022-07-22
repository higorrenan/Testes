package estruturawhile;

public class SomaTodosNumerosImpares {
	public static void main(String[] args) {
		int soma = 0;
		int i = 0;
		for(i = 57 ; i <= 901 ; i += 3 ){
			if (i % 2 ==1) {
				System.out.println(i);
			}
			soma = soma + i;
		}
		System.out.println(soma);
	}
}
