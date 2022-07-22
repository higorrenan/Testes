package logica;

import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quantidade atual em estoque: ");
		double quantAtual = entrada.nextDouble();
		System.out.println("Informe quantidade minima em estoque: ");
		double quantMinima = entrada.nextDouble();
		System.out.println("Informe quantidade maxima em estoque: ");
		double quantMaxima = entrada.nextDouble();
		
		double quantMedia = ((quantMaxima + quantMinima)/2);
		System.out.println(quantMedia);
		
		if(quantAtual>=quantMedia) {
			System.out.println("Nao efetuar compra");
		}else {
			System.out.println("Efetuar compra");
		}
		
		
	}

	
}
