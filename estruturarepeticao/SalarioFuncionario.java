package estruturarepeticao;

import java.util.Scanner;

public class SalarioFuncionario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numFuncionario = 0, horaMes = 0;
		double valorHora = 0, salario = 0;
		
		System.out.println("informe um numero de identificação: ");
		numFuncionario = entrada.nextInt();
		System.out.println("Informe quantas horas foram trabalhadas: ");
		horaMes = entrada.nextInt();
		System.out.println("Informe quanto recebe por hora de trabalho: ");
		valorHora = entrada.nextDouble();
		
		salario = horaMes * valorHora;
		
		System.out.printf("Numero = " + numFuncionario+"\n");
		System.out.printf("Salario = R$ %.2f",salario);
		
		entrada.close();
	}

}
