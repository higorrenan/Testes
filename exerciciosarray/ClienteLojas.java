package exerciciosarray;

import java.util.Scanner;

public class ClienteLojas {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] tamanho = new int [3];
		String[]registro = new String[3];
		String resp;
		for(int i =0; i <tamanho.length;i++) {
			for(int f = 0; f < registro.length;i++) {
					System.out.println("Informe o seu nome: ");
					registro[i] = entrada.next();
					System.out.println("Informe o seu endereço: ");
					registro[i] = entrada.next();
					System.out.println("Informe o seu telefone: ");
					registro[i] = entrada.next();
					System.out.println("...");
					entrada.next();
					System.out.println("Novo cliente ? |S/N| ");
					resp = entrada.next();
			}
		}
		System.out.println(registro);
		entrada.close();
	}
}
