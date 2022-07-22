package fundamentos;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
import javax.swing.JOptionPane; 

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print(
				" Digite o valor do primeiro salario: ");
		String valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.print(
				" Digite o valor do segundo salario: ");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.print(
				" Digite o valor do terceiro salario: ");
		String valor3 = entrada.nextLine().replace(",", ".");
		 
		 double salario1 = Double.parseDouble(valor1);
		 double salario2 = Double.parseDouble(valor2);
		 double salario3 = Double.parseDouble(valor3);
		 
		 double media = (salario1 + salario2 + salario3)/2;
		 
		 System.out.println("A sua média salarial é de: "+ media);
		 
		
		 
		 
		 
		 
		 
		 
	}

}
