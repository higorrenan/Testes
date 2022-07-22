package estruturawhile;

import java.util.Scanner;

public class FatorialosNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe um numero: "); 
		int valor = sc.nextInt();
		int i = 1;
		int fatorial = 1;
		
		while(i <= valor) {
			
			fatorial = fatorial * i;
			i++;
		}
		System.out.println(fatorial);
			
		sc.close();
	}
}
