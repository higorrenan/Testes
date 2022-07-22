package exerciciofixacao2;

import java.util.Scanner;

public class NumeroPositivoMedia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int i =0, quant =0;
		double num = 0 , media = 0 , soma = 0;
		
		for(i = 1; i <= 6 ; i++) {
			System.out.println("Digite qualquer numero: ");
			num = entrada.nextDouble();
		
		if(num > 0) {
			soma = soma + num ;
			quant++;
		}
		}
		
		media = soma / quant;
		
		System.out.println(quant + " Valores positivos");
		System.out.printf("%.1f",media);
		
		entrada.close();
	}
}
