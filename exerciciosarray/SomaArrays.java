package exerciciosarray;

import java.util.Arrays;
import java.util.Scanner;

public class SomaArrays {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[]a = new int [3],
			b =new int [3],
			soma = new int[6] ;
		int i;
	
		for( i =0; i<a.length; i++) {
			System.out.println("insira um numero: ");
			a[i] = entrada.nextInt();
		}
		
		System.out.println("Primeiros digistos inseridos");
		
		for ( i = 0; i < b.length; i++) {
			System.out.println("Insiria novamente um numero: ");
			b [i] = entrada.nextInt();
		}
		for(i = 0; i<soma.length;i++) {
		soma[i] = b[i] + a[i];
		}
		System.out.println(Arrays.toString(soma));
		
		entrada.close();
	}
}
