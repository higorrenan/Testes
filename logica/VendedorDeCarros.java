package logica;

import java.util.Scanner;

public class VendedorDeCarros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos carros foram vendidos: ");
		double carrosvendidos = entrada.nextDouble();
		
		System.out.println("Informe o valor de suas vendas: ");
		double valorvendas = entrada.nextDouble();
		
		System.out.println("Informe o valor do seu salario: ");
		double salariofixo = entrada.nextDouble();
		
		System.out.println("Informe o valor que voce recebe por caros vendidos: ");
		double comissao = entrada.nextDouble();
		
	
		double valorfinalvendas =(valorvendas * 5 )/100;
		double valorfinalcomissao = comissao * carrosvendidos;
		double salariofinal = salariofixo + valorfinalvendas+valorfinalcomissao;
		
		System.out.printf("Seu salario total e de R$ %.2f",salariofinal);
		
		entrada.close();
	}

}
