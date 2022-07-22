package metodos;

import java.util.Scanner;

public class OrdemDosNumeros {
	static void ordem (int a , int b , int c) {
		if(a > b && b> c) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}else if(a > b && c > b) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}else if(b > a && a > c) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}else if(b > a && c > a) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}else if(c > a && a > b) {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}else if(c > a && b > a) {
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro numero: ");
		int a = entrada.nextInt();
		System.out.println("Informe o segundo numero: ");
		int b = entrada.nextInt();
		System.out.println("Informe o terceiro numero: ");
		int c = entrada.nextInt();
		
		ordem(a, b, c);
		
		entrada.close();
	}
}
