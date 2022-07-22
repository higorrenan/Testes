package exerciciofixacao2;

import java.util.Scanner;

public class SomaEntreNumeros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x =0 , y =0, soma =0;
		int min = 0, max =0 , i =0;
		System.out.println("Digito um numero: ");
		x = entrada.nextInt();
		System.out.println("Digito um numero: ");
		y = entrada.nextInt();
		
		if(x < y ) {
			min = x;
			max =y;
		}else {
			min = y;
			max = x;
		}
		for(i = min+1 ; i < max; i++) {
			 
			if(i % 2 !=0) {
				soma = soma + i;
			}	
		}
		System.out.println(soma);
		
		entrada.close();
	}
}
