package logica;

import java.util.Scanner;

public class AnoEleicao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = entrada.nextInt();
		System.out.println("Digite o ano de nascimento: ");
		int anoNascimento = entrada.nextInt();
		
		int idade = (anoAtual - anoNascimento);
		
		if(idade > 16) {
			System.out.println("Esta pessoa poderá votar");
		}else {
			System.out.println("Esta pessoa não poderá votar");
		}
	
		
		entrada.close();
		
	}

}
