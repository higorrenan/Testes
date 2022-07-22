package metodos;

import java.util.Scanner;

public class AnosEmDias {
	
	static void dias (int x , int y , int z) {
		int ano = 365, mes = 30;
		int idade = x, meses = y, dias = z;
		
		int resultado = (idade*ano)+(meses*mes)+dias;
		
		System.out.println(resultado);
	}
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.print("Digite quantos meses: ");
		int meses = entrada.nextInt();
		System.out.print("Digite quantos dias: ");
		int dias = entrada.nextInt();
		
		dias(idade, meses, dias);

		entrada.close();
	}
}
