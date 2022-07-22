package logica;

import java.util.Scanner;

public class NovoSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu salario: ");
		double salarioatual = entrada.nextDouble();
		
		System.out.println("Informe a porcentagem do reajuste: ");
		double reajuste = entrada.nextDouble();
		
		
		double salarionovo = salarioatual+(salarioatual*reajuste)/100;
		
		
		System.out.printf("R$ %.2f",salarionovo);
		
		
		
		
		
		
	}

}
