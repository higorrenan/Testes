package logica;

import java.util.Scanner;

public class ValorMaiorOuMenor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int valor1 = entrada.nextInt();
	
		System.out.println("Digite o ano atual: ");
		int valor2= entrada.nextInt();
		
		if(valor1 == valor2); {
			
		}
		
		if(valor1> valor2){
			System.out.println("Este valor é maior: "+valor1);
			
		}else if( valor2>valor1) {
			System.out.println("Este valor é maior: "+ valor1);
		}
		entrada.close();
	}
}
