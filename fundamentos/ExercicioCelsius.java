package fundamentos;

import java.util.Scanner;

public class ExercicioCelsius {
	public static void main(String[] args) {
		//Formula F=(°C * 5/9)+32
		
		
Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dgiti a temperatura em celsius: ");
		double celsius = entrada.nextDouble();
		
		final double diferencia = 32;
		final double fator = 5/9;
		
		double temperatura = (celsius * fator) + diferencia;
		
		System.out.printf("A temperatura de hoje é de %.1f °f",temperatura);
		
		
	}

}
