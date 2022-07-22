package exerciciosarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SomaMat {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o numero de colunas: ");
		int coluna =entrada.nextInt();
		System.out.println("Informe o numero de linhas: ");
		int linhas =entrada.nextInt();
		int [][] soma = new int [coluna][linhas];
		Random valores = new Random();
		int i, f, result=0;
		for( i = 0; i <coluna; i++) {
			for(f = 0; f <linhas; f++) {
				soma[i][f] = valores.nextInt(10);
				 result = result + soma [i][f];
				 System.out.println(result);
			}
		} 
	}
}
