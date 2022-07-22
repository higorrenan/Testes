package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner(System.in);
		System.out.print("login: ");
		String nome = entrada.nextLine();
		
		System.out.print("senha: ");
		int senha = entrada.nextInt();
		entrada.nextLine();
		System.out.print("apelidio: ");
		String apelidio = entrada.nextLine();
		
		System.out.printf(" %s de apelidio %s sua conta foi logada com sucesso!", nome, apelidio);
		
		entrada.close();
		
		
		
		
		
		
	}
	
	
	

}
