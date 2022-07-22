package estruturawhile;

public class SomaInteiros {
	public static void main(String[] args) {
		
		int i =1;
		int soma = 0;
		
		while(i < 11) {
			
			soma = soma+ i; 
			i++;
		}
		System.out.println(i);
		System.out.println(soma);
	}
}
