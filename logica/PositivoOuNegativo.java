package logica;

import java.util.Scanner;

public class PositivoOuNegativo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int valor = entrada.nextInt();
		
			if(valor < 0 ) {
				System.out.println("negativo");
				
			}else{
				System.out.println("positvo");
			}
		
	}

}
