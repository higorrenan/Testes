package logica;

import java.util.Scanner;

public class Vendedor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o seu salario: ");
		double salariofixo = entrada.nextDouble();
		System.out.println("Informe o valor de suas vendas: ");
		double vendas = entrada.nextDouble();
		
		double salariototal= 0;
				
		if(vendas <=1500) {
			salariototal =  salariofixo+ (vendas * 3/100);
			System.out.println(salariototal);
		}else if(vendas > 1500) {
			salariototal = salariofixo+(vendas*5/100);
			System.out.println(salariototal);
			
		}
		
		
		
	}

}
