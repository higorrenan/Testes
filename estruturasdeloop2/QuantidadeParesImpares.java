package estruturasdeloop2;

import java.util.Scanner;

public class QuantidadeParesImpares {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int i = 0;
		 int quantpar = 0;
		 int quantimpar = 0;
		 int numero = 0;
		 System.out.println("Digite a quantidade de numeros ");
		 System.out.println("E saiba a quantidade se for impa ou par");
		 System.out.println("Para ver o resultado Digite -1");
			 for(i = 1; i<=50 ; i++) {
			if(numero != -1) {
				 System.out.println("digite um número: ");
				 numero = sc.nextInt();
			 if(numero % 2 ==0) {
				 quantpar++;
			 }
			if(numero % 2 ==1) {
				quantimpar++;
			}
		 }  
	}
	System.out.println(quantimpar);
	System.out.println(quantpar);
	
	sc.close();
}
}
