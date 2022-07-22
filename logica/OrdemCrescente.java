package logica;

import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int valor1 = entrada.nextInt();
		System.out.println("Informe outro número: ");
		int valor2 = entrada.nextInt();
		
		if(valor1 < valor2) {
			System.out.println(valor1);
			System.out.println(valor2);
		}else {
			System.out.println(valor2);
			System.out.println(valor1);
		}
		
		
		
	}

}
