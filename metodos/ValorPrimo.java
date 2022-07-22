package metodos;

import java.util.Scanner;

public class ValorPrimo {
	public static boolean identificar(int x) {
		if(x % 2 == 1  && x % x == 0) {			
			return (true);
		}else {
			return (false);
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = entrada.nextInt();
		
		System.out.println(identificar(valor));
				
		entrada.close();	
	}
}
