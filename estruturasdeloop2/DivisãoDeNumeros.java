package estruturasdeloop2;

import java.util.Scanner;

public class DivisãoDeNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int quant = 0;
		int valor = 0;
		
		System.out.println("informe numero : "); 
		valor = sc.nextInt();
		
		for(i = valor ; i >= 0 ; i--) {
			 valor = valor/2;
			 quant++;
		}
		System.out.println(valor);
		System.out.println(quant);
		
		sc.close();
	}
}
