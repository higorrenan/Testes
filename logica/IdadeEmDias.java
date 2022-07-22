package logica;

import java.util.Scanner;

public class IdadeEmDias {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Digite quantos meses: ");
		int meses = entrada.nextInt();
		
		System.out.print("Digite quantos dias: ");
		int dias = entrada.nextInt();
		
		
		int ano = 365;
		
		int mes = 30;
		
		int resultado = (idade*ano)+(meses*mes)+dias;
		
		System.out.println("Sua idade em dias e: "+resultado+ "dias");
		
		entrada.close();
	}

}
