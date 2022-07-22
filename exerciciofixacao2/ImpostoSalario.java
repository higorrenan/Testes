package exerciciofixacao2;

import java.util.Scanner;

public class ImpostoSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double imposto =0, diferenca =0;
		System.out.println("Informe o valor do seu salario: ");
		double salario = entrada.nextDouble();
		
		if(salario > 3000) {
		imposto = 1000 * 0.08;
		diferenca = salario - 3000;
		imposto += (diferenca * 18)/100;
		}else if(salario > 4500) {
			imposto = 1000 * 0.08 + 1500 * 0.18;
			diferenca = salario - 4500;
			imposto += diferenca * 0.28;
		}else if(salario > 2000) {
		diferenca = salario - 2000;
		imposto += diferenca * 0.08;
		}else {
			System.out.println("Isento");
		}
		System.out.printf("R$ %.2f",imposto);
		
		entrada.close();			
	}
}
