package metodos;

import java.util.Scanner;

public class Baskara {
	 static void formula (double a ,double b, double c) {
		double delta = (Math.pow(b, 2) - (4 * a * c));
		double denominador = 2 * a;
		double numerador1 = -b + Math.sqrt(delta);
		double numerador2 = -b - Math.sqrt(delta);
		double result1 = numerador1 / denominador;
		double result2 = numerador2 / denominador;
		if(denominador == 0 && delta < 0 ) {
			System.out.println("Impossível calcular");
		}
		System.out.println(result1);
		System.out.println(result2);
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		 double x =0, y = 0, z =0;
		 
		 System.out.println("Digite um numero: ");
		 x = entrada.nextDouble();
		 System.out.println("Digite um numero: ");
		 y = entrada.nextDouble();
		 System.out.println("Digite um numero: ");
		 z = entrada.nextDouble();
		 
		 formula(x, y, z);
		 
		entrada.close();
	}
}
