package fundamentos;

import java.util.Scanner;

public class ExercicioImc {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("digite sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc = Math.pow (peso/altura, 2);
		
		System.out.printf("Seu IMC é de %.1f:",imc);
		
		
		
		
		
		
		
		
		
		
	}

	
}
