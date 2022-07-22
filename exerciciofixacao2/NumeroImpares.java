package exerciciofixacao2;

import java.util.Scanner;

public class NumeroImpares {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int impares =0;
		
		System.out.println("Digite um numero");
		int valor = entrada.nextInt();
		
		do {
			valor--;
			if( valor % 2 ==1) {
			System.out.println(valor);
			}
		} while (1 <= valor);
	}
}
