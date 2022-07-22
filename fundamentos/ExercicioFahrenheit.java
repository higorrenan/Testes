package fundamentos;

import java.util.Scanner;

public class ExercicioFahrenheit {
	public static void main(String[] args) {
		
		//formula C= (F-32) x 5/9
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dgiti a temperatura em fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		final double diferencia = 32;
		final double fator = 5/9.0;
		
		double temperatura = (fahrenheit - diferencia )*fator;
		
		System.out.printf("A temperatura de hoje em celsius é %.1f°c",temperatura );
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
