package estruturarepeticao;

import java.util.Scanner;

public class Produtos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int produto1 =0, produto2 =0, unidade1 = 0,unidade2 =0;
		double valor1 =0, valor2 =0 , valorTotal = 0;
		
		System.out.println("Informe o código do produto: ");
		produto1 = entrada.nextInt();
		System.out.println("Informe a quantidade de produto: ");
		unidade1 = entrada.nextInt();
		System.out.println("Informe o valor do produto: ");
		valor1 = entrada.nextDouble();
		System.out.println("---------------------------------");
		System.out.println("Informe o código do produto: ");
		produto2 = entrada.nextInt();
		System.out.println("Informe a quantidade de produto: ");
		unidade2 = entrada.nextInt();
		System.out.println("Informe o valor do produto: ");
		valor2 = entrada.nextDouble();
		
		valorTotal = (unidade1*valor1)+(unidade2*valor2);
		
		System.out.printf("VALOR A PAGAR : R$%.2f",valorTotal);
		
		entrada.close();
	}

}
