package metodos;

import java.util.Scanner;

public class EixoXeEixoY {
	static void encontra (double x, double y) {
		if(x > 0 && y >0) {
			System.out.println("Q1");
		} if(x > 0 && y < 0) {
			System.out.println("Q4");
		} if (x < 0 && y >0) {
			System.out.println("Q2");
		} if (x < 0 && y < 0) {
			System.out.println("Q3");
		}else if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
	}
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double a = 0,  b =0;	
		System.out.println("Informe o numero de X: ");
		a = entrada.nextDouble();
		System.out.println("Informe o numero de X: ");
		b = entrada.nextDouble();
		encontra(a, b);
		
		entrada.close();
	}
}
