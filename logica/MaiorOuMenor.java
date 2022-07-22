package logica;

import java.util.Scanner;

public class MaiorOuMenor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int valor = entrada.nextInt();
		
		
			if(valor>10){
				System.out.println("Valor mair que 10");
				
			}else {
				System.out.println("Valor menor que 10");
			}
		entrada.close();
		
	}

}
