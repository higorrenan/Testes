package logica;

import java.util.Scanner;

public class ExercicioAntecessor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int valor = entrada.nextInt();
		
		int resultado = valor;
		resultado =valor - 1;
		
		
		System.out.println("O antecessor desse numero: "+resultado);
			
		entrada.close();
		
		
		
	}
}
