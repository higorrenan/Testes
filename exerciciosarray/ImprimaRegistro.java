package exerciciosarray;

import java.util.Scanner;

public class ImprimaRegistro {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cheque, cadastro =0;
		String livro, aluno, endereco;
		
		System.out.println("informe seu cheque bancário: ");
		cheque = entrada.nextInt();
		System.out.println("informe seu livro: ");
		 livro= entrada.next();
		System.out.println("informe  aluno: ");
		 aluno= entrada.next();
		System.out.println("informe seu endereço: ");
		 endereco= entrada.next();
		System.out.println("informe cadastro de pessoa:");
		 cadastro= entrada.nextInt();
		
		 System.out.println(cheque);
		 System.out.println(livro);
		 System.out.println(aluno);
		 System.out.println(endereco);
		 System.out.println(cadastro);
		 
		entrada.close();
	}
}
