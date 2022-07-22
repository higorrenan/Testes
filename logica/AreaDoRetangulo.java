package logica;

import java.util.Scanner;

public class AreaDoRetangulo {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o tamnho da base: ");
		double base = entrada.nextDouble();
		System.out.println("Digite o tamnho da altura: ");
		double altura = entrada.nextDouble();
		
		double area = base*altura;
		
		System.out.println("Area desse retangulo e: "+area+"m2");
		
	}

}
